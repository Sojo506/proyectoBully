/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package code;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



/**
 *
 * @author andres
 */
public class panelRegistroCursos extends javax.swing.JPanel {
    private String regexNums = "^[0-9]+";
    Conexion conn;
    Connection reg;

    /**
     * Creates new form panelRegistroCursos
     */
    public panelRegistroCursos() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputCantidadC = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        inputHorarioC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputModalidadC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputNombreC = new javax.swing.JTextField();
        btnGuardarC = new javax.swing.JPanel();
        etiquetaGuardar = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 50, 20));

        inputCantidadC.setText("Ingresar cantidad disponible");
        inputCantidadC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputCantidadCMousePressed(evt);
            }
        });
        jPanel1.add(inputCantidadC, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 190, 30));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 10, 350));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Horario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 50, 20));
        jPanel1.add(inputHorarioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Modalidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 70, 20));

        inputModalidadC.setText("Ingresar modalidad");
        inputModalidadC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputModalidadCMousePressed(evt);
            }
        });
        jPanel1.add(inputModalidadC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 60, 20));

        inputNombreC.setText("Ingresar nombre");
        inputNombreC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputNombreCMousePressed(evt);
            }
        });
        jPanel1.add(inputNombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, 30));

        btnGuardarC.setBackground(new java.awt.Color(18, 90, 173));
        btnGuardarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarCMousePressed(evt);
            }
        });
        btnGuardarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaGuardar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        etiquetaGuardar.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardarC.add(etiquetaGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        jPanel1.add(btnGuardarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCMousePressed
        // Poner codigo aqui
        //Comprobar que todos los campos esten completos
        if(inputCantidadC.getText().equals("")|| inputHorarioC.getText().equals("") || inputModalidadC.getText().equals("")
                || !inputCantidadC.getText().matches(regexNums) || inputNombreC.getText().equals("")){
            if(!inputCantidadC.getText().matches(regexNums)){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos y/o verificar la cantidad para poder agregar el curso");
            }else{
                javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos para poder agregar el curso");
            }
            inputNombreC.requestFocus();
        }else{
            //Comprobar que la cantidad sea valida
            int comprobarCantidad = Integer.parseInt(inputCantidadC.getText());
            if(comprobarCantidad < 0){
                javax.swing.JOptionPane.showMessageDialog(this, "Cantidad de cursos no valida");
                inputNombreC.requestFocus();
                System.out.println(((Object)comprobarCantidad).getClass().getSimpleName());
            }else {
                //Guardamos los datos en las variables
                String nombre = inputNombreC.getText();
                String horario = inputHorarioC.getText();
                String modalidad = inputModalidadC.getText();
                int cantidad = comprobarCantidad;
                
                try{
                    if(etiquetaGuardar.getText().equals("Modificar")){
                        //Agregar metodo
                        int id = panelCursos.idCursoModificar;
                        modificarCurso(nombre, horario, modalidad, cantidad, id);
                    }else{
                        insertarCurso(nombre, horario, modalidad, cantidad);
                    }
                    //Resetear los campos
                    inputCantidadC.setText("");
                    inputHorarioC.setText("");
                    inputModalidadC.setText("");
                    inputNombreC.setText("");
                        
                }catch(SQLException ex){
                    Logger.getLogger(panelRegistroCursos.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
        }
        
    }//GEN-LAST:event_btnGuardarCMousePressed

    private void inputNombreCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputNombreCMousePressed
        if (inputNombreC.getText().equals("Ingresar nombre")) {
            inputNombreC.setText("");
        }
        if (inputModalidadC.getText().equals("") || inputModalidadC.getText() == null) {
            inputModalidadC.setText("Ingresar modalidad");
        }
        if (inputCantidadC.getText().equals("") || inputCantidadC.getText() == null) {
            inputCantidadC.setText("Ingresar cantidad disponible");
        }
       
        
        
    }//GEN-LAST:event_inputNombreCMousePressed
/*Autor : Andy*/
    private void inputModalidadCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputModalidadCMousePressed
        
        if (inputNombreC.getText().equals("") || inputNombreC.getText() == null ) {
            inputNombreC.setText("Ingresar nombre");
        }
        if (inputModalidadC.getText().equals("Ingresar modalidad"))  {
            inputModalidadC.setText("");
        }
        if (inputNombreC.getText().equals("") || inputNombreC.getText() == null) {
            inputNombreC.setText("Ingresar cantidad disponible");
        }
        
    }//GEN-LAST:event_inputModalidadCMousePressed
/*Autor : Andy*/
    private void inputCantidadCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputCantidadCMousePressed
       if (inputNombreC.getText().equals("") || inputNombreC.getText()== null) {
            inputNombreC.setText("Ingresar nombre");
        }
        if (inputModalidadC.getText().equals("") || inputModalidadC.getText() == null) {
            inputModalidadC.setText("Ingresar modalidad");
        }
        if (inputCantidadC.getText().equals("Ingresar cantidad disponible") ) {
            inputCantidadC.setText("");
        }
        
        
    }//GEN-LAST:event_inputCantidadCMousePressed
    
    //Metodo para insertar curso a la BD
     public void insertarCurso(String nombre, String horario, String modalidad, int cantidad) throws SQLException{
        Statement stm = reg.createStatement();
        
        stm.executeUpdate("INSERT INTO `cursos` (`nombre`, `horario`, `modalidad`, `cantidad`) VALUES ('"+nombre+"', '"+horario+"', '"+ modalidad+"', '"+ cantidad+"')");
        javax.swing.JOptionPane.showMessageDialog(this, "¡Curso registrado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
    }
     
     //Metodo para modificar curso en la BD
     public void modificarCurso(String nombre, String horario, String modalidad, int cantidad, int id) throws SQLException{
        Statement stm = reg.createStatement();
        
        stm.executeUpdate("UPDATE `cursos` SET `nombre` = '" + nombre + "', `horario` = '" + horario + "', `modalidad` = '" + modalidad + "', `cantidad` = '" + cantidad +"' WHERE `idCurso` = " + id + ";");
        javax.swing.JOptionPane.showMessageDialog(this, "¡Curso editado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnGuardarC;
    public javax.swing.JLabel etiquetaGuardar;
    public javax.swing.JTextField inputCantidadC;
    public javax.swing.JTextField inputHorarioC;
    public javax.swing.JTextField inputModalidadC;
    public javax.swing.JTextField inputNombreC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
