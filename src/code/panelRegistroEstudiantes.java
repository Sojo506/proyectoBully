/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package code;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author XPC
 */
public class panelRegistroEstudiantes extends javax.swing.JPanel {

    private String regexNums = "^[0-9]+";
    Conexion conn;
    Connection reg;

    public panelRegistroEstudiantes() {
        initComponents();
        conn = new Conexion();
        reg = conn.getConexion();
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

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setPreferredSize(new java.awt.Dimension(680, 360));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        panel1.add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        etiquetaNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiquetaNombre.setText("Nombre");
        panel1.add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        inputNombre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        inputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombreActionPerformed(evt);
            }
        });
        panel1.add(inputNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, 30));

        etiquetaPrimerApellido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiquetaPrimerApellido.setText("Primer Apellido");
        panel1.add(etiquetaPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        panel1.add(inputPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 30));

        etiquetaSegundoApellido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiquetaSegundoApellido.setText("Segundo Apellido");
        panel1.add(etiquetaSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        panel1.add(inputSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 30));

        etiquetaEdad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiquetaEdad.setText("Edad");
        panel1.add(etiquetaEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));
        panel1.add(inputEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 180, 30));

        etiquetaCedula.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiquetaCedula.setText("Cédula");
        panel1.add(etiquetaCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));
        panel1.add(inputCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 190, 30));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        panel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 10, 350));

        etiquetaTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiquetaTelefono.setText("Teléfono");
        panel1.add(etiquetaTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));
        panel1.add(inputTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 190, 30));

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
        // Comprobar que todos los campos estén llenos
        if (inputNombre.getText().equals("") || inputPrimerApellido.getText().equals("") || inputSegundoApellido.getText().equals("")
                || !inputEdad.getText().matches(regexNums) || inputEdad.getText().equals("")
                || inputCedula.getText().equals("") || inputTelefono.getText().equals("")) {
            if (!inputEdad.getText().matches(regexNums)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos y/o verificar la Edad\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            inputNombre.requestFocus();
        } else {
            // Comprobar que la edad sea válida
            int comprobarEdad = Integer.parseInt(inputEdad.getText());
            if (comprobarEdad < 0 && comprobarEdad > 150) {
                javax.swing.JOptionPane.showMessageDialog(this, "Edad no válida\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                inputEdad.requestFocus();
                System.out.println(((Object) comprobarEdad).getClass().getSimpleName());
            } else {
                // guardar datos en variables
                String nombre = inputNombre.getText();
                String pA = inputPrimerApellido.getText();
                String sP = inputSegundoApellido.getText();
                int edad = comprobarEdad;
                String cedula = inputCedula.getText();
                String tel = inputTelefono.getText();

                try {
                    if (etiquetaGuardar.getText().equals("Modificar")) {
                        int id = panelEstudiantes.idEstudianteModificar;
                        modificarEstudiante(nombre, pA, sP, edad, cedula, tel, id);

                    } else {
                        insertarEstudiante(nombre, pA, sP, edad, cedula, tel);
                    }

                    // Resetear los campos y centrar el click en el textField nombre
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
    // Metodo para insertar estudiante
    public void insertarEstudiante(String nombre, String pA, String sP, int edad, String cedula, String tel) throws SQLException {
        Statement stm = reg.createStatement();

        stm.executeUpdate("INSERT INTO `estudiantes` (`nombre`, `primerApellido`, `segundoApellido`, `edad`, `cedula`, `telefono`) VALUES ('" + nombre + "', '" + pA + "', '" + sP + "', '" + edad + "', '" + cedula + "', '" + tel + "')");
        javax.swing.JOptionPane.showMessageDialog(this, "¡Estudiante registrado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }

    // Metodo para modificar estudiante
    public void modificarEstudiante(String nombre, String pA, String sP, int edad, String cedula, String tel, int id) throws SQLException {
        Statement stm = reg.createStatement();        
        stm.executeUpdate("UPDATE `estudiantes` SET `nombre` = '" + nombre + "', `primerApellido` = '" + pA + "', `segundoApellido` = '" + sP + "', `edad` = '" + edad + "', `cedula` = '" + cedula + "', `telefono` = '" + tel + "' WHERE `idEstudiante` = " + id + ";");
        
        javax.swing.JOptionPane.showMessageDialog(this, "¡Estudiante modificado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }

    public void seleccionarEstudiante() {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JLabel etiquetaCedula;
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
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
