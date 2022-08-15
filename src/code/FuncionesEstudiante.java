package code;

import static code.Main.panelContenido;
import static code.panelEstudiantes.idEstudianteModificar;
import static code.panelEstudiantes.nombreCurso;
import static code.panelEstudiantes.tablaEstudiantes;
import static code.panelRegistroEstudiantes.cu;
import static code.panelRegistroEstudiantes.etiquetaGuardar;
import static code.panelRegistroEstudiantes.inputCedula;
import static code.panelRegistroEstudiantes.inputEdad;
import static code.panelRegistroEstudiantes.inputNombre;
import static code.panelRegistroEstudiantes.inputPrimerApellido;
import static code.panelRegistroEstudiantes.inputSegundoApellido;
import static code.panelRegistroEstudiantes.inputTelefono;
import static code.panelRegistroEstudiantes.listaCursos;
import static code.panelRegistroEstudiantes.modeloCursos;
//import static code.panelRegistroEstudiantes.verificacion;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author XPC
 */
public class FuncionesEstudiante {

    private String regexNums = "^[0-9]+";
    private String regexLetr = "^[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+(\\s*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]*)*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+$";
    private boolean verificacion;

    FuncionesCurso cursosF = new FuncionesCurso();
    Conexion conn = new Conexion();
    Connection reg = conn.getConexion();

    /* Funciones panelRegistroEstudiantes */
    // Metodo para guardar el estudiante registrado
    public void guardarDatosRegistroE() {
        try {
            cu = listaCursos.getSelectedItem().toString();
            System.out.println(cu);
        } catch (NullPointerException ex) {
            System.out.println(cu);
        }

        // Comprobar que todos los campos estén llenos
        if ((!inputNombre.getText().matches(regexLetr)) || (inputNombre.getText().length() > 10) || (!inputPrimerApellido.getText().matches(regexLetr)) || (inputPrimerApellido.getText().length() > 10)
                || (!inputSegundoApellido.getText().matches(regexLetr)) || (inputSegundoApellido.getText().length() > 10)
                || (!inputEdad.getText().matches(regexNums))
                || (!inputCedula.getText().matches(regexNums)) || (inputCedula.getText().length() < 9) || (inputCedula.getText().length() > 9)
                || (!inputTelefono.getText().matches(regexNums)) || (inputTelefono.getText().length() < 8) || (inputTelefono.getText().length() > 8)
                || (cu == null)) {

            javax.swing.JOptionPane.showMessageDialog(null, "Debe llenar todos los campos y/o verificar los datos introducidos (campos numéricos y/o longitud de caracteres)\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            inputNombre.requestFocus();

        } else {
            // Comprobar que la edad sea válida
            int comprobarEdad = Integer.parseInt(inputEdad.getText());
            if (comprobarEdad < 0 && comprobarEdad > 150) {
                javax.swing.JOptionPane.showMessageDialog(null, "Edad no válida\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                inputEdad.requestFocus();
            } else {
                // guardar datos en variables
                String nombre = inputNombre.getText();
                String primerA = inputPrimerApellido.getText();
                String segundoA = inputSegundoApellido.getText();
                int edad = comprobarEdad;
                String ced = inputCedula.getText();
                String tel = inputTelefono.getText();
                String curso = listaCursos.getSelectedItem().toString();
                Estudiante es = new Estudiante(nombre, primerA, segundoA, edad, ced, tel, curso);

                try {
                    // Control para saber si se debe hacer un UPDATE o INSERT
                    if (etiquetaGuardar.getText().equals("Modificar")) {
                        System.out.println(nombreCurso);
                        if (modificarCantidadCurso(es.getCurso(), nombreCurso)) {
                            modificarEstudiante(es.getNombre(), es.getPrimerApellido(), es.getSegundoApellido(), es.getEdad(), es.getCedula(), es.getTelefono(), es.getCurso(), idEstudianteModificar);

                            // Instanciamos el panel&
                            panelEstudiantes estudiantes = new panelEstudiantes();
                            estudiantes.setSize(680, 360);
                            estudiantes.setLocation(0, 0);

                            // Removemos el panel anterior y pasamos el nuevo para mostrarlo
                            panelContenido.removeAll();
                            panelContenido.add(estudiantes, BorderLayout.CENTER);
                            panelContenido.revalidate();
                            panelContenido.repaint();
                        } else {
                            JOptionPane.showMessageDialog(null, "No fue posible ingresar al curso, verificar cantidad disponible del curso seleccionado.");
                        }

                    } else {
                        if (modificarCantidadCurso(es.getCurso(), "")) {
                            insertarEstudiante(es.getNombre(), es.getPrimerApellido(), es.getSegundoApellido(), es.getEdad(), es.getCedula(), es.getTelefono(), es.getCurso());
                            // Reiniciar los campos
                            inputNombre.setText("");
                            inputPrimerApellido.setText("");
                            inputSegundoApellido.setText("");
                            inputEdad.setText("");
                            inputTelefono.setText("");
                            inputCedula.setText("");
                            inputNombre.requestFocus();
                        } else {
                            JOptionPane.showMessageDialog(null, "No fue posible ingresar al curso, verificar cantidad disponible del curso seleccionado.");
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(panelRegistroEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    // Metodo para modificar cantidad de curso
    private boolean modificarCantidadCurso(String curso, String c) {
        Curso cr = new Curso();
        Curso cr2 = new Curso();

        int idAux = -1;
        int idCurso = -1;

        try {
            //Ejecutamos la consulta
            Statement stm = reg.createStatement();

            //Recorremos la tabla
            ResultSet contador = stm.executeQuery("SELECT * FROM `cursos`");

            // Obtener cantidad de filas de la tabla
            int fila = 0;
            while (contador.next()) {
                fila++;
            }

            // [filas][columnas]
            String cursos[][] = new String[fila][6];

            // iterador
            int i = 0;

            // Para recorrer los datos 
            ResultSet re = stm.executeQuery("SELECT * FROM `cursos`");

            //Recorrer la tabla de los cursos
            while (re.next()) {
                cursos[i][0] = re.getString("idCurso");
                cursos[i][1] = re.getString("nombre");
                cursos[i][4] = re.getString("cantidad");
                cursos[i][5] = re.getString("cantidadEstudiantes");

                // Comprobar y obtener datos del curso seleccionado
                if (cursos[i][1].equals(curso)) {
                    idCurso = Integer.parseInt(cursos[i][0]);
                    cr.setNombreCurso(curso);
                    cr.setCantidad(Integer.parseInt(cursos[i][4]));
                    cr.setCantidadEstudiantes(Integer.parseInt(cursos[i][5]));
                }

                // Comprobar y obtener datos del curso seleccionado si la opcion es modificar
                if (cursos[i][1].equals(c)) {
                    idAux = Integer.parseInt(cursos[i][0]);
                    cr2.setCantidad(Integer.parseInt(cursos[i][4]));
                    cr2.setCantidadEstudiantes(Integer.parseInt(cursos[i][5]));
                }

                i++;
            }
            try {
                if (etiquetaGuardar.getText().equals("Modificar")) {
                    // Verificar cantidad del curso
                    if (cr.getCantidad() > 0) {
                        cr.setCantidad(cr.getCantidad() - 1);
                        cr2.setCantidad(cr2.getCantidad() + 1);
                        // Verificar que el curso seleccionado no sea el mismo al anterior
                        if (!c.equals(curso)) {
                            stm.executeUpdate("UPDATE `cursos` SET `cantidad` = '" + (cr.getCantidad()) + "', `cantidadEstudiantes` = '" + (cr.getCantidadEstudiantes()+1) + "' WHERE `idCurso` = " + idCurso + ";");
                            stm.executeUpdate("UPDATE `cursos` SET `cantidad` = '" + (cr2.getCantidad()) + "', `cantidadEstudiantes` = '" + (cr2.getCantidadEstudiantes()-1) + "' WHERE `idCurso` = " + idAux + ";");
                        }
                        verificacion = true;
                    } else {
                        verificacion = false;
                    }

                } else {
                    // Verificar cantidad del curso
                    if (cr.getCantidad() > 0) {
                        cr.setCantidad(cr.getCantidad() - 1);
                        stm.executeUpdate("UPDATE `cursos` SET `cantidad` = '" + (cr.getCantidad()) + "', `cantidadEstudiantes` = '" + (cr.getCantidadEstudiantes()+1) + "' WHERE `idCurso` = " + idCurso + ";");
                        verificacion = true;
                    } else {
                        verificacion = false;
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(FuncionesEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FuncionesEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return verificacion;
    }

    // Obtener el nombre de los cursos de la tabla en la BD
    public void getListaCursos() {
        try {
            //Ejecutar la consulta
            Statement stm = reg.createStatement();

            //Recorrer tabla
            ResultSet contador = stm.executeQuery("SELECT * FROM `cursos`");

            //Obtener el numero de filas
            int fila = 0;
            while (contador.next()) {
                fila++;
            }

            String cursos[][] = new String[fila][2];

            //Iterador de las filas
            int i = 0;
            ResultSet re = stm.executeQuery("SELECT * FROM `cursos`");

            //Recorrer la tabla
            while (re.next()) {
                modeloCursos.addElement(cursos[i][1] = re.getString("nombre"));
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(panelCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /* Funciones panelEstudiantes */
    // Obtener id del estudiante para eliminarlo
    public void getDeleteEstudiante() {
        try {
            int filaEstudiante = tablaEstudiantes.getSelectedRow(); // Obtenemos la fila del estudiante seleccionado
            if (filaEstudiante < 0) {
                javax.swing.JOptionPane.showMessageDialog(null, "Debe seleccionar el estudiante a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                // para ejecutar la consulta
                Statement stm = reg.createStatement();
                ResultSet contador = stm.executeQuery("SELECT * FROM `estudiantes`");

                // para obtener el numero de filas
                int fila = 0;
                while (contador.next()) {
                    fila++;
                }

                // [filas][columnas]
                String estudiantes[][] = new String[fila][7];

                // itera las filas
                int i = 0;
                // para reccorer los datos
                ResultSet re = stm.executeQuery("SELECT * FROM `estudiantes`");

                while (re.next()) { //re.next obtiene la cantidad de filas a iterar
                    estudiantes[i][0] = re.getString("idEstudiante");
                    estudiantes[i][6] = re.getString("curso");
                    i++;
                }

                // obtenemos el id del estudiante
                int idEstudiante = Integer.parseInt(estudiantes[filaEstudiante][0]);
                modificarCantidadCurso(estudiantes[filaEstudiante][6]);
                System.out.println(idEstudiante);
                if (idEstudiante < 0) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Debe seleccionar el estudiante a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // para ejecutar la consulta
                    Statement stm2 = null;
                    try {
                        stm2 = reg.createStatement();

                    } catch (SQLException ex) {
                        Logger.getLogger(FuncionesEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        stm2.executeUpdate("DELETE FROM `estudiantes` WHERE `idEstudiante` = " + idEstudiante + " LIMIT 1");
                        javax.swing.JOptionPane.showMessageDialog(null, "¡Estudiante borrado! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        getStudents();

                    } catch (SQLException ex) {
                        Logger.getLogger(FuncionesEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(panelEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Obtener el estudiante para ser modificado
    public void getStudent() {
        try {
            // Obtenemos la fila del estudiante seleccionado
            int filaEstudiante = tablaEstudiantes.getSelectedRow();

            if (filaEstudiante < 0) {
                javax.swing.JOptionPane.showMessageDialog(null, "Debe seleccionar el estudiante a modificarr. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                // para ejecutar la consulta
                Statement stm = reg.createStatement();
                ResultSet contador = stm.executeQuery("SELECT * FROM `estudiantes`");

                // para obtener el numero de filas
                int fila = 0;
                while (contador.next()) {
                    fila++;
                }

                String estudiantes[][] = new String[fila][8]; // [filas][columnas]
                int i = 0; // itera las filas
                // para reccorer los datos
                ResultSet re = stm.executeQuery("SELECT * FROM `estudiantes`");

                // recorre la tabla estudiantes
                while (re.next()) {
                    estudiantes[i][0] = re.getString("idEstudiante");
                    estudiantes[i][1] = re.getString("nombre");
                    estudiantes[i][2] = re.getString("primerApellido");
                    estudiantes[i][3] = re.getString("segundoApellido");
                    estudiantes[i][4] = re.getString("edad");
                    estudiantes[i][5] = re.getString("cedula");
                    estudiantes[i][6] = re.getString("telefono");
                    estudiantes[i][7] = re.getString("curso");
                    i++;
                }

                // obtenemos el id del estudiante
                idEstudianteModificar = Integer.parseInt(estudiantes[filaEstudiante][0]);
                nombreCurso = estudiantes[filaEstudiante][7];

                // mostramos el panel
                panelRegistroEstudiantes rUp = new panelRegistroEstudiantes();
                rUp.setSize(680, 360);
                rUp.setLocation(0, 0);
                rUp.etiquetaTitulo.setText("Modificar Estudiante");
                rUp.etiquetaGuardar.setText("Modificar");

                // Pasamos los datos
                rUp.inputNombre.setText(estudiantes[filaEstudiante][1]);
                rUp.inputPrimerApellido.setText(estudiantes[filaEstudiante][2]);
                rUp.inputSegundoApellido.setText(estudiantes[filaEstudiante][3]);
                rUp.inputEdad.setText(estudiantes[filaEstudiante][4]);
                rUp.inputCedula.setText(estudiantes[filaEstudiante][5]);
                rUp.inputTelefono.setText(estudiantes[filaEstudiante][6]);
                rUp.listaCursos.setSelectedItem(estudiantes[filaEstudiante][7]);

                // Removemos el panel anterior y pasamos el nuevo para mostrarlo
                panelContenido.removeAll();
                panelContenido.add(rUp, BorderLayout.CENTER);
                panelContenido.revalidate();
                panelContenido.repaint();

            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionesEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Metodo para traer los estudiantes de la Base de Datos
    public void getStudents() throws SQLException {
        // para ejecutar la consulta
        Statement stm = reg.createStatement();
        ResultSet contador = stm.executeQuery("SELECT * FROM `estudiantes`");

        // para obtener el numero de filas
        int fila = 0;
        while (contador.next()) {
            fila++;
        }

        String estudiantes[][] = new String[fila][7]; // [filas][columnas]
        int i = 0; // itera las filas

        ResultSet re = stm.executeQuery("SELECT * FROM `estudiantes`");
        // recorre la tabla estudiantes
        while (re.next()) {
            estudiantes[i][0] = re.getString("nombre");
            estudiantes[i][1] = re.getString("primerApellido");
            estudiantes[i][2] = re.getString("segundoApellido");
            estudiantes[i][3] = re.getString("edad");
            estudiantes[i][4] = re.getString("cedula");
            estudiantes[i][5] = re.getString("telefono");
            estudiantes[i][6] = re.getString("curso");
            i++;
        }

        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(estudiantes, new String[]{
            "Nombre", "Primer Apellido", "Segundo Apellido", "Edad", "Cédula", "Teléfono", "Curso"}));
    }

    // Metodo para la cantidad disponible y de estudiantes cuando un estudiante se elimina
    private void modificarCantidadCurso(String curso) throws SQLException {
        Curso cr = new Curso();
        int idCurso = -1;
        try {
            //Ejecutamos la consulta
            Statement stm = reg.createStatement();

            //Recorremos la tabla
            ResultSet contador = stm.executeQuery("SELECT * FROM `cursos`");

            // Obtener cantidad de filas de la tabla
            int fila = 0;
            while (contador.next()) {
                fila++;
            }
            String cursos[][] = new String[fila][6]; // [filas][columnas]
            int i = 0; //Iterador de las filas
            // Para recorrer los datos 
            ResultSet re = stm.executeQuery("SELECT * FROM `cursos`");

            //Recorrer la tabla de los cursos
            while (re.next()) {
                cursos[i][0] = re.getString("idCurso");
                cursos[i][1] = re.getString("nombre");
                cursos[i][2] = re.getString("horario");
                cursos[i][3] = re.getString("modalidad");
                cursos[i][4] = re.getString("cantidad");
                cursos[i][5] = re.getString("cantidadEstudiantes");
                if (cursos[i][1].equals(curso)) {
                    idCurso = Integer.parseInt(cursos[i][0]);
                    cr.setNombreCurso(curso);
                    cr.setCantidad(Integer.parseInt(cursos[i][4]));
                    cr.setCantidadEstudiantes(Integer.parseInt(cursos[i][5]));
                }
                i++;
            }
            try {
                stm.executeUpdate("UPDATE `cursos` SET `cantidad` = '" + (cr.getCantidad() + 1) + "', `cantidadEstudiantes` = '" + (cr.getCantidadEstudiantes() - 1) + "' WHERE `idCurso` = " + idCurso + ";");
                //pC.getCursos();

            } catch (SQLException ex) {
                System.out.println("Error 2 " + ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FuncionesEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /* Funciones Bases de Datos */
    // Metodo para insertar estudiante
    private void insertarEstudiante(String nombre, String pA, String sP, int edad, String cedula, String tel, String curso) throws SQLException {
        Statement stm = reg.createStatement();

        stm.executeUpdate("INSERT INTO `estudiantes` (`nombre`, `primerApellido`, `segundoApellido`, `edad`, `cedula`, `telefono`, `curso`)"
                + " VALUES ('" + nombre + "', '" + pA + "', '" + sP + "', '" + edad + "', '" + cedula + "', '" + tel + "', '" + curso + "')");
        javax.swing.JOptionPane.showMessageDialog(null, "¡Estudiante registrado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }

    // Metodo para modificar estudiante
    private void modificarEstudiante(String nombre, String pA, String sP, int edad, String cedula, String tel, String curso, int id) throws SQLException {
        Statement stm = reg.createStatement();
        stm.executeUpdate("UPDATE `estudiantes` SET `nombre` = '" + nombre + "', `primerApellido` = '" + pA + "', `segundoApellido` = '" + sP + "', `edad` = '" + edad + "',"
                + " `cedula` = '" + cedula + "', `telefono` = '" + tel + "', `curso` = '" + curso + "' WHERE `idEstudiante` = " + id + ";");

        javax.swing.JOptionPane.showMessageDialog(null, "¡Estudiante modificado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
}
