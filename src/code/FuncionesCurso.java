package code;

import static code.Main.panelContenido;
import static code.panelCursos.anteriorCurso;
import static code.panelCursos.idCursoModificar;
import static code.panelCursos.tablaCursos;
import static code.panelRegistroCursos.etiquetaGuardar;
import static code.panelRegistroCursos.inputCantidadC;
import static code.panelRegistroCursos.inputNombreC;
import static code.panelRegistroCursos.listaHorario;
import static code.panelRegistroCursos.listaModalidad;
import static code.panelRegistroCursos.listaSedes;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XPC
 */
public class FuncionesCurso {

    private String regexNums = "^[0-9]+";
    private String regexLtr = "^^[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+(\\s*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]*)*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+$";

    Conexion conn = new Conexion();
    Connection reg = conn.getConexion();

    /* Funciones panelRegistroCursos */
    //Comprobar que todos los campos esten completos
    public void guardarDatosRegistroC() {
        if (!inputCantidadC.getText().matches(regexNums) || (inputCantidadC.getText().length() > 3) || !(inputNombreC.getText().matches(regexLtr)) || (inputNombreC.getText().length() < 3 || inputNombreC.getText().length() > 16)) {
            if (!inputCantidadC.getText().matches(regexNums) || inputCantidadC.getText().length() > 3) {
                javax.swing.JOptionPane.showMessageDialog(null, "Debe llenar todos los campos y/o verificar la cantidad para poder agregar el curso (max 100)");
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para poder agregar el curso (longitud de caracteres (max 16)");
            }
            inputNombreC.requestFocus();

        } else {
            //Comprobar que virtual sea igual a la sede
            String verificarModalidadC = listaModalidad.getSelectedItem().toString();
            String verificarSedeC = listaSedes.getSelectedItem().toString();

            //Comprobar que la cantidad sea valida
            int comprobarCantidad = Integer.parseInt(inputCantidadC.getText());
            //Verificamos la cantidad y que si la modalidad es virtual entonces la sede tambien tiene que ser virtual
            if (comprobarCantidad < 0 || (verificarModalidadC.equals("Virtual") && !verificarModalidadC.equals(verificarSedeC)) || (verificarModalidadC.equals("Presencial") && verificarSedeC.equals("Virtual"))) {
                javax.swing.JOptionPane.showMessageDialog(null, "Cantidad de cursos no valida y/o verificar la sede");
                inputNombreC.requestFocus();
            } else {
                //Guardamos los datos en las variables
                Curso course = new Curso();
                course.setNombreCurso(inputNombreC.getText());
                course.setHorario(listaHorario.getSelectedItem().toString());
                course.setModalidad(listaModalidad.getSelectedItem().toString());
                course.setCantidad(comprobarCantidad);
                course.setSede(listaSedes.getSelectedItem().toString());

                try {
                    if (etiquetaGuardar.getText().equals("Modificar")) {
                        //Agregar metodo
                        modificarCurso(course.getNombreCurso(), course.getHorario(), course.getModalidad(), course.getCantidad(), course.getSede(), idCursoModificar);
                        modificarCursoStundents(course.getNombreCurso(), anteriorCurso);

                        panelCursos cursos = new panelCursos();
                        cursos.setSize(680, 360);
                        cursos.setLocation(0, 0);

                        // Removemos el panel anterior y pasamos el nuevo para mostrarlo
                        panelContenido.removeAll();
                        panelContenido.add(cursos, BorderLayout.CENTER);
                        panelContenido.revalidate();
                        panelContenido.repaint();
                    } else {
                        insertarCurso(course.getNombreCurso(), course.getHorario(), course.getModalidad(), course.getCantidad(), course.getSede());

                        //Resetear los campos
                        inputCantidadC.setText("");
                        inputNombreC.setText("");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(panelRegistroCursos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    // Metodo para modificar el nombre del curso a los estudiantes cuando este se modifica
    private void modificarCursoStundents(String nuevoCurso, String anteriorCurso) throws SQLException {
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

        ResultSet re = stm.executeQuery("SELECT * FROM `estudiantes`");
        // recorre la tabla estudiantes
        while (re.next()) {
            estudiantes[i][0] = re.getString("idEstudiante");
            estudiantes[i][7] = re.getString("curso");

            if (estudiantes[i][7].equals(anteriorCurso)) {
                int id = Integer.parseInt(estudiantes[i][0]);
                Statement stm2 = reg.createStatement();
                try {
                    stm2.executeUpdate("UPDATE `estudiantes` SET `curso` = '" + nuevoCurso + "'  WHERE `idEstudiante` = " + id + ";");
                } catch (SQLException ex) {
                    System.out.println("Error 2" + ex);
                }
            }
            i++;
        }
    }

    /* Funciones panelCursos */
    // Metodo para obtener datos del curso seleccionado a modificar
    public void getModificarCurso() {
        try {
            int filaCurso = tablaCursos.getSelectedRow(); //Para obtener la fila del curso

            //Condicional para verificar que se seleccione un curso para ser modificado
            if (filaCurso < 0) {
                javax.swing.JOptionPane.showMessageDialog(null, "Debe seleccionar un curso para poder modificarlo. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                //Ejecutar la consulta
                Statement stm = reg.createStatement();
                ResultSet contador = stm.executeQuery("SELECT * FROM `cursos`");

                //Obtener el numero de filas
                int fila = 0;
                while (contador.next()) {
                    fila++;
                }

                String cursos[][] = new String[fila][6];
                int i = 0; //Iterador de las filas
                ResultSet re = stm.executeQuery("SELECT * FROM `cursos`");

                //Recorrer la tabla
                while (re.next()) {
                    cursos[i][0] = re.getString("idCurso");
                    cursos[i][1] = re.getString("nombre");
                    cursos[i][2] = re.getString("horario");
                    cursos[i][3] = re.getString("modalidad");
                    cursos[i][4] = re.getString("cantidad");
                    cursos[i][5] = re.getString("sede");
                    i++;
                }

                // Variables para poder modificar la base de datos
                idCursoModificar = Integer.parseInt(cursos[filaCurso][0]);
                anteriorCurso = cursos[filaCurso][1];

                //Mostrar el panel
                panelRegistroCursos pRc = new panelRegistroCursos();
                pRc.setSize(680, 360);
                pRc.setLocation(0, 0);
                etiquetaGuardar.setText("Modificar");

                //Poner los datos en los campos
                pRc.inputNombreC.setText(cursos[filaCurso][1]);
                pRc.listaHorario.setSelectedItem(cursos[filaCurso][2]);
                pRc.listaModalidad.setSelectedItem(cursos[filaCurso][3]);
                pRc.inputCantidadC.setText(cursos[filaCurso][4]);
                pRc.listaSedes.setSelectedItem(cursos[filaCurso][5]);

                //Remover el panel anterior
                panelContenido.removeAll();
                panelContenido.add(pRc, BorderLayout.CENTER);
                panelContenido.revalidate();
                panelContenido.repaint();

            }
        } catch (SQLException ex) {
            Logger.getLogger(panelCursos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Metodo para obtener datos del curso seleccionado a eliminar
    public void getDeleteCurso() {
        try {
            //Para obtener la fila de el curso seleccionado
            int filaCurso = tablaCursos.getSelectedRow();
            if (filaCurso < 0) {
                javax.swing.JOptionPane.showMessageDialog(null, "Debe seleccionar el curso que desea borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                //Ejecutamos la consulta
                Statement stm = reg.createStatement();
                ResultSet contador = stm.executeQuery("SELECT * FROM `cursos`");

                //Obtenemos la consulta
                int fila = 0;
                while (contador.next()) {
                    fila++;
                }
                //primero las filas y despues las columnas
                String cursos[][] = new String[fila][6];
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
                    cursos[i][5] = re.getString("sede");
                    i++;
                }
                //Variable para obtener el id del estudiante
                int idCurso = Integer.parseInt(cursos[filaCurso][0]);

                // Obtener nombre para eliminar estudiantes que llevan el curso
                String cursoEliminado = cursos[filaCurso][1];
                

                if(deleteStudents(cursoEliminado) > 0) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Debe eliminar estudiantes del curso. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    //Ejecutamos la consulta
                    Statement stm2 = reg.createStatement();
                    try {
                        stm2.executeUpdate("DELETE FROM `cursos` WHERE `idCurso` = " + idCurso + " LIMIT 1");
                        javax.swing.JOptionPane.showMessageDialog(null, "Se borró el curso correctamente \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        getCursos();
                    } catch (SQLException ex) {
                        System.out.println("Error 2" + ex);
                    }
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(panelCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Metodo para mostrar los datos en la tabla
    public void getCursos() throws SQLException {
        Statement stm = reg.createStatement(); //Para procesar una sentencia SQL
        ResultSet counter = stm.executeQuery("SELECT * FROM `cursos`"); //Para indicar que tabla vamos a utlizar

        // Obtener el numero de filas
        int contador = 0;
        while (counter.next()) {
            contador++;
        }
        //Creamos un arreglo para luego recorrerlo
        String cursos[][] = new String[contador][6];//filas //columnas
        int i = 0;
        ResultSet re = stm.executeQuery("SELECT * FROM `cursos`");
        while (re.next()) {
            cursos[i][0] = re.getString("nombre");
            cursos[i][1] = re.getString("horario");
            cursos[i][2] = re.getString("modalidad");
            cursos[i][3] = re.getString("cantidad");
            cursos[i][4] = re.getString("cantidadEstudiantes");
            cursos[i][5] = re.getString("sede");
            i++;
        }

        tablaCursos.setModel(new javax.swing.table.DefaultTableModel(cursos, new String[]{"Nombre", "Horario", "Modalidad", "Cantidad", "Cantidad Estudiantes", "Campus"}));
    }

    // Metodo para eliminar estudiantes que se han registrado al curso eliminado
    private int deleteStudents(String curso) throws SQLException {
        int Cantestudiantes=0;
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

        ResultSet re = stm.executeQuery("SELECT * FROM `estudiantes`");
        // recorre la tabla estudiantes
        while (re.next()) {
            estudiantes[i][0] = re.getString("idEstudiante");
            estudiantes[i][7] = re.getString("curso");

            if (estudiantes[i][7].equals(curso)) {
                Cantestudiantes++;
                break;
                /*
                Statement stm2 = reg.createStatement();
                try {
                    stm2.executeUpdate("DELETE FROM `estudiantes` WHERE `idEstudiante` = " + Integer.parseInt(estudiantes[i][0]));
                } catch (SQLException ex) {
                    System.out.println("Error 2" + ex);
                }
                */
            }
            i++;
        }
        return Cantestudiantes;
    }

    /* Base de Datos */
    //Metodo para insertar curso a la BD
    private void insertarCurso(String nombre, String horario, String modalidad, int cantidad, String sede) throws SQLException {
        Statement stm = reg.createStatement();

        stm.executeUpdate("INSERT INTO `cursos` (`nombre`, `horario`, `modalidad`, `cantidad`, `cantidadEstudiantes`, `sede`) VALUES ('" + nombre + "', '" + horario + "', '" + modalidad + "', '" + cantidad + "', '" + 0 + "', '" + sede + "')");
        javax.swing.JOptionPane.showMessageDialog(null, "¡Curso registrado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }

    //Metodo para modificar curso en la BD
    private void modificarCurso(String nombre, String horario, String modalidad, int cantidad, String sede, int id) throws SQLException {
        Statement stm = reg.createStatement();

        stm.executeUpdate("UPDATE `cursos` SET `nombre` = '" + nombre + "', `horario` = '" + horario + "', `modalidad` = '" + modalidad + "', `cantidad` = '" + cantidad + "', `sede` = '" + sede + "' WHERE `idCurso` = " + id + ";");
        javax.swing.JOptionPane.showMessageDialog(null, "¡Curso editado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }

}
