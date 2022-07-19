/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package code;

import static code.Home.panelContenido;
import static code.panelCursos.idCursoModificar;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author XPC
 */
public class panelRegistroEstudiantes extends javax.swing.JPanel {
    String cu = null;
    DefaultComboBoxModel modeloCursos = new DefaultComboBoxModel();

    private String regexNums = "^[0-9]+";
    Conexion conn;
    Connection reg;

    public panelRegistroEstudiantes() {
        initComponents();
        
        conn = new Conexion();
        reg = conn.getConexion();
        
        try {
            getListaCursos();
        } catch (NullPointerException ex) {
            Logger.getLogger(panelRegistroEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        etiquetaPrimerApellido = new javax.swing.JLabel();
        inputPrimerApellido = new javax.swing.JTextField();
        etiquetaSegundoApellido = new javax.swing.JLabel();
        inputSegundoApellido = new javax.swing.JTextField();
        etiquetaEdad = new javax.swing.JLabel();
        inputEdad = new javax.swing.JTextField();
        etiquetaCedula = new javax.swing.JLabel();
        inputCedula = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        etiquetaTelefono = new javax.swing.JLabel();
        inputTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JPanel();
        etiquetaGuardar = new javax.swing.JLabel();
        etiquetaCurso = new javax.swing.JLabel();
        listaCursos = new javax.swing.JComboBox<>();

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setPreferredSize(new java.awt.Dimension(680, 360));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        panel1.add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        etiquetaNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiquetaNombre.setText("Nombre");
        panel1.add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        inputNombre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        inputNombre.setText("Ingresar nombre");
        inputNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputNombreMousePressed(evt);
            }
        });
        inputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombreActionPerformed(evt);
            }
        });
        panel1.add(inputNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, 30));

        etiquetaPrimerApellido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiquetaPrimerApellido.setText("Primer Apellido");
        panel1.add(etiquetaPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        inputPrimerApellido.setText("Ingresar primer apellido");
        inputPrimerApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputPrimerApellidoMousePressed(evt);
            }
        });
        panel1.add(inputPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 30));

        etiquetaSegundoApellido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiquetaSegundoApellido.setText("Segundo Apellido");
        panel1.add(etiquetaSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        inputSegundoApellido.setText("Ingresar segundo apellido");
        inputSegundoApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputSegundoApellidoMousePressed(evt);
            }
        });
        panel1.add(inputSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 30));

        etiquetaEdad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiquetaEdad.setText("Edad");
        panel1.add(etiquetaEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        inputEdad.setText("Ingresar edad");
        inputEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputEdadMousePressed(evt);
            }
        });
        panel1.add(inputEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 95, 30));

        etiquetaCedula.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiquetaCedula.setText("Cédula");
        panel1.add(etiquetaCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        inputCedula.setText("Ingresar cédula");
        inputCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputCedulaMousePressed(evt);
            }
        });
        panel1.add(inputCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 190, 30));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        panel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 10, 350));

        etiquetaTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiquetaTelefono.setText("Teléfono");
        panel1.add(etiquetaTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        inputTelefono.setText("Ingresar número telefónico");
        inputTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputTelefonoMousePressed(evt);
            }
        });
        panel1.add(inputTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 190, 30));

        btnGuardar.setBackground(new java.awt.Color(18, 90, 173));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarMousePressed(evt);
            }
        });

        etiquetaGuardar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiquetaGuardar.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(etiquetaGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 210, 50));

        etiquetaCurso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiquetaCurso.setText("Curso");
        panel1.add(etiquetaCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        listaCursos.setModel(modeloCursos);
        panel1.add(listaCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
                                    

    private void inputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNombreActionPerformed

    private void btnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMousePressed
        try {
            cu = listaCursos.getSelectedItem().toString();
            System.out.println(cu);
        } catch (NullPointerException ex) {
            System.out.println(cu);
        }
        
        // Comprobar que todos los campos estén llenos
        if (inputNombre.getText().equals("") || inputPrimerApellido.getText().equals("") || inputSegundoApellido.getText().equals("")
                || inputEdad.getText().equals("") || !inputEdad.getText().matches(regexNums)
                || inputCedula.getText().equals("") || !inputCedula.getText().matches(regexNums)
                || inputTelefono.getText().equals("") || !inputTelefono.getText().matches(regexNums)
                || cu == null) {
            
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos y/o verificar los datos introducidos\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            inputNombre.requestFocus();

        } else {
            // Comprobar que la edad sea válida
            int comprobarEdad = Integer.parseInt(inputEdad.getText());
            if (comprobarEdad < 0 && comprobarEdad > 150) {
                javax.swing.JOptionPane.showMessageDialog(this, "Edad no válida\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                inputEdad.requestFocus();
            } else {
                // guardar datos en variables
                Estudiante es = new Estudiante();
                es.setNombre(inputNombre.getText());
                es.setPrimerApellido(inputPrimerApellido.getText());
                es.setSegundoApellido(inputSegundoApellido.getText());
                es.setEdad(comprobarEdad);
                es.setCedula(inputCedula.getText());
                es.setTelefono(inputTelefono.getText());
                es.setCurso(listaCursos.getSelectedItem().toString());

                try {
                    // Control para saber si se debe hacer un UPDATE o INSERT
                    if (etiquetaGuardar.getText().equals("Modificar")) {
                        int id = panelEstudiantes.idEstudianteModificar;
                        String c = panelEstudiantes.nombreCurso;
                        
                        modificarCantidadCurso(es.getCurso(), c);
                        modificarEstudiante(es.getNombre(), es.getPrimerApellido(), es.getSegundoApellido(), es.getEdad(), es.getCedula(), es.getTelefono(), es.getCurso(), id);

                    } else {
                        modificarCantidadCurso(es.getCurso(), "");
                        insertarEstudiante(es.getNombre(), es.getPrimerApellido(), es.getSegundoApellido(), es.getEdad(), es.getCedula(), es.getTelefono(), es.getCurso());
                    }

                    // Reiniciar los campos
                    inputNombre.setText("");
                    inputPrimerApellido.setText("");
                    inputSegundoApellido.setText("");
                    inputEdad.setText("");
                    inputTelefono.setText("");
                    inputCedula.setText("");
                    
                    inputNombre.requestFocus();

                } catch (SQLException ex) {
                    Logger.getLogger(panelRegistroEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarMousePressed
    /*Autor : Andy*/
    private void inputNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputNombreMousePressed
        if (inputNombre.getText().equals("Ingresar nombre")) {
            inputNombre.setText("");
        }
        if (inputPrimerApellido.getText().equals("") || inputPrimerApellido == null || inputPrimerApellido.getText().equals(" ")) {
            inputPrimerApellido.setText("Ingresar primer apellido");
        }
        if (inputSegundoApellido.getText().equals("") || inputSegundoApellido.getText() == null || inputSegundoApellido.getText().equals(" ")) {
            inputSegundoApellido.setText("Ingresar segundo apellido");
        }
        if (inputEdad.getText().equals("") || inputEdad.getText() == null || inputEdad.getText().equals(" ")) {
            inputEdad.setText("Ingresar edad");
        }
        if (inputCedula.getText().equals("") || inputCedula.getText() == null || inputCedula.getText().equals(" ")) {
            inputCedula.setText("Ingresar cédula");
        }
        if (inputTelefono.getText().equals("") || inputTelefono.getText() == null || inputTelefono.getText().equals(" ")) {
            inputTelefono.setText("Ingresar número telefónico");
        }

    }//GEN-LAST:event_inputNombreMousePressed
    /*Autor :Andy*/
    private void inputPrimerApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputPrimerApellidoMousePressed
        if (inputNombre.getText().equals("") || inputNombre.getText() == null || inputNombre.getText().equals(" ")) {
            inputNombre.setText("Ingresar nombre");
        }
        if (inputPrimerApellido.getText().equals("Ingresar primer apellido")) {
            inputPrimerApellido.setText("");
        }
        if (inputSegundoApellido.getText().equals("") || inputSegundoApellido.getText() == null || inputSegundoApellido.getText().equals(" ")) {
            inputSegundoApellido.setText("Ingresar segundo apellido");
        }
        if (inputEdad.getText().equals("") || inputEdad.getText() == null || inputEdad.getText().equals(" ")) {
            inputEdad.setText("Ingresar edad");
        }
        if (inputCedula.getText().equals("") || inputCedula.getText() == null || inputCedula.getText().equals(" ")) {
            inputCedula.setText("Ingresar cédula");
        }
        if (inputTelefono.getText().equals("") || inputTelefono.getText() == null || inputTelefono.getText().equals(" ")) {
            inputTelefono.setText("Ingresar número telefónico");
        }


    }//GEN-LAST:event_inputPrimerApellidoMousePressed
    /*Autor : Andy*/
    private void inputSegundoApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputSegundoApellidoMousePressed
        if (inputNombre.getText().equals("") || inputNombre.getText() == null || inputNombre.getText().equals(" ")) {
            inputNombre.setText("Ingresar nombre");
        }
        if (inputPrimerApellido.getText().equals("") || inputPrimerApellido.getText() == null || inputPrimerApellido.getText().equals(" ")) {
            inputPrimerApellido.setText("Ingresar primer apellido");
        }
        if (inputSegundoApellido.getText().equals("Ingresar segundo apellido")) {
            inputSegundoApellido.setText("");
        }
        if (inputEdad.getText().equals("") || inputEdad.getText() == null || inputEdad.getText().equals(" ")) {
            inputEdad.setText("Ingresar edad");
        }
        if (inputCedula.getText().equals("") || inputCedula.getText() == null || inputCedula.getText().equals(" ")) {
            inputCedula.setText("Ingresar cédula");
        }
        if (inputTelefono.getText().equals("") || inputTelefono.getText() == null || inputTelefono.getText().equals(" ")) {
            inputTelefono.setText("Ingresar número telefónico");
        }


    }//GEN-LAST:event_inputSegundoApellidoMousePressed
    /*Autor : Andy*/
    private void inputEdadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputEdadMousePressed
        if (inputNombre.getText().equals("") || inputNombre.getText() == null || inputNombre.getText().equals(" ")) {
            inputNombre.setText("Ingresar nombre");
        }
        if (inputPrimerApellido.getText().equals("") || inputPrimerApellido.getText() == null || inputPrimerApellido.getText().equals(" ")) {
            inputPrimerApellido.setText("Ingresar primer apellido");
        }
        if (inputSegundoApellido.getText().equals("") || inputSegundoApellido.getText() == null || inputSegundoApellido.getText().equals(" ")) {
            inputSegundoApellido.setText("Ingresar segundo apellido");
        }
        if (inputEdad.getText().equals("Ingresar edad")) {
            inputEdad.setText("");
        }
        if (inputCedula.getText().equals("") || inputCedula.getText() == null || inputCedula.getText().equals(" ")) {
            inputCedula.setText("Ingresar cédula");
        }
        if (inputTelefono.getText().equals("") || inputTelefono.getText() == null || inputTelefono.getText().equals(" ")) {
            inputTelefono.setText("Ingresar número telefónico");
        }


    }//GEN-LAST:event_inputEdadMousePressed
    /*Autor : Andy*/
    private void inputCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputCedulaMousePressed
        if (inputNombre.getText().equals("") || inputNombre.getText() == null || inputNombre.getText().equals(" ")) {
            inputNombre.setText("Ingresar nombre");
        }
        if (inputPrimerApellido.getText().equals("") || inputPrimerApellido.getText() == null || inputPrimerApellido.getText().equals(" ")) {
            inputPrimerApellido.setText("Ingresar primer apellido");
        }
        if (inputSegundoApellido.getText().equals("") || inputSegundoApellido.getText() == null || inputSegundoApellido.getText().equals(" ")) {
            inputSegundoApellido.setText("Ingresar segundo apellido");
        }
        if (inputEdad.getText().equals("Ingresar edad") || inputEdad.getText() == null || inputEdad.getText().equals(" ")) {
            inputEdad.setText("Ingresar edad");
        }
        if (inputCedula.getText().equals("Ingresar cédula")) {
            inputCedula.setText("");
        }
        if (inputTelefono.getText().equals("") || inputTelefono.getText() == null || inputTelefono.getText().equals(" ")) {
            inputTelefono.setText("Ingresar número telefónico");
        }


    }//GEN-LAST:event_inputCedulaMousePressed
    /*Autor : Andy*/
    private void inputTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputTelefonoMousePressed
        if (inputNombre.getText().equals("") || inputNombre.getText() == null || inputNombre.getText().equals(" ")) {
            inputNombre.setText("Ingresar nombre");
        }
        if (inputPrimerApellido.getText().equals("") || inputPrimerApellido.getText() == null || inputPrimerApellido.getText().equals(" ")) {
            inputPrimerApellido.setText("Ingresar primer apellido");
        }
        if (inputSegundoApellido.getText().equals("") || inputSegundoApellido.getText() == null || inputSegundoApellido.getText().equals(" ")) {
            inputSegundoApellido.setText("Ingresar segundo apellido");
        }
        if (inputEdad.getText().equals("") || inputEdad.getText() == null || inputEdad.getText().equals(" ")) {
            inputEdad.setText("Ingresar edad");
        }
        if (inputCedula.getText().equals("") || inputCedula.getText() == null || inputCedula.getText().equals(" ")) {
            inputCedula.setText("Ingresar cédula");
        }
        if (inputTelefono.getText().equals("Ingresar número telefónico")) {
            inputTelefono.setText("");
        }


    }//GEN-LAST:event_inputTelefonoMousePressed
    // Metodo para insertar estudiante
    public void insertarEstudiante(String nombre, String pA, String sP, int edad, String cedula, String tel, String curso) throws SQLException {
        Statement stm = reg.createStatement();

        stm.executeUpdate("INSERT INTO `estudiantes` (`nombre`, `primerApellido`, `segundoApellido`, `edad`, `cedula`, `telefono`, `curso`)"
                + " VALUES ('" + nombre + "', '" + pA + "', '" + sP + "', '" + edad + "', '" + cedula + "', '" + tel + "', '" + curso + "')");
        javax.swing.JOptionPane.showMessageDialog(this, "¡Estudiante registrado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }

    // Metodo para modificar estudiante
    public void modificarEstudiante(String nombre, String pA, String sP, int edad, String cedula, String tel, String curso, int id) throws SQLException {
        Statement stm = reg.createStatement();
        stm.executeUpdate("UPDATE `estudiantes` SET `nombre` = '" + nombre + "', `primerApellido` = '" + pA + "', `segundoApellido` = '" + sP + "', `edad` = '" + edad + "',"
                + " `cedula` = '" + cedula + "', `telefono` = '" + tel + "', `curso` = '" + curso + "' WHERE `idEstudiante` = " + id + ";");

        javax.swing.JOptionPane.showMessageDialog(this, "¡Estudiante modificado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }

    // Metodo para modificar cantidad de curso (agregar)
    private void modificarCantidadCurso(String curso, String c) throws SQLException {
        // variblaes para obtener cantidad disponible
        int idAux=0;
        int cantidadAux=0;
        
        // variables para obtener cantidad de estudiantes
        int ce=0;
        int ce2=0;
        panelCursos pC = new panelCursos();
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
                cursos[i][2] = re.getString("horario");
                cursos[i][3] = re.getString("modalidad");
                cursos[i][4] = re.getString("cantidad");
                cursos[i][5] = re.getString("cantidadEstudiantes");
                
                // Comprobar y obtener datos
                if (cursos[i][1].equals(curso)) {
                    idCurso = Integer.parseInt(cursos[i][0]);
                    cr.setNombreCurso(curso);
                    cr.setCantidad(Integer.parseInt(cursos[i][4]));
                    ce = Integer.parseInt(cursos[i][5]);
                }
                
                // Comprobar y obtener datos
                if (cursos[i][1].equals(c)) {
                    idAux = Integer.parseInt(cursos[i][0]);
                    cantidadAux = Integer.parseInt(cursos[i][4]);
                    ce2 = Integer.parseInt(cursos[i][5]);
                }
                
                i++;
            }
            try {
                if(etiquetaGuardar.getText().equals("Modificar")) {
                    cr.setCantidad(cr.getCantidad()-1);
                    cantidadAux += 1;
                    if(!c.equals(curso)) {
                        stm.executeUpdate("UPDATE `cursos` SET `cantidad` = '" + (cr.getCantidad()) + "', `cantidadEstudiantes` = '" + (ce + 1) + "' WHERE `idCurso` = " + idCurso + ";");
                        stm.executeUpdate("UPDATE `cursos` SET `cantidad` = '" + (cantidadAux) + "', `cantidadEstudiantes` = '" + (ce2 - 1) + "' WHERE `idCurso` = " + idAux + ";");
                    }
                } else {
                    stm.executeUpdate("UPDATE `cursos` SET `cantidad` = '" + (cr.getCantidad()) + "', `cantidadEstudiantes` = '" + (ce + 1) + "' WHERE `idCurso` = " + idCurso + ";");
                }
                
                pC.getCursos();
                
            } catch (SQLException ex) {
                System.out.println("Error 2 " + ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(panelCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Obtener el nombre de los cursos de la tabla en mysql
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JLabel etiquetaCedula;
    private javax.swing.JLabel etiquetaCurso;
    private javax.swing.JLabel etiquetaEdad;
    public javax.swing.JLabel etiquetaGuardar;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPrimerApellido;
    private javax.swing.JLabel etiquetaSegundoApellido;
    private javax.swing.JLabel etiquetaTelefono;
    public javax.swing.JLabel etiquetaTitulo;
    public javax.swing.JTextField inputCedula;
    public javax.swing.JTextField inputEdad;
    public javax.swing.JTextField inputNombre;
    public javax.swing.JTextField inputPrimerApellido;
    public javax.swing.JTextField inputSegundoApellido;
    public javax.swing.JTextField inputTelefono;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> listaCursos;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
