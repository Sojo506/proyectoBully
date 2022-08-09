/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package code;

import static code.Main.panelContenido;
import static code.panelCursos.anteriorCurso;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author andres
 */
public class panelRegistroCursos extends javax.swing.JPanel {

    DefaultComboBoxModel modeloHorarioC = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloModalidadC = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloSedeC = new DefaultComboBoxModel();

    FuncionesCurso funcionesR = new FuncionesCurso();

    /**
     * Creates new form panelRegistroCursos
     */
    public panelRegistroCursos() {
        agregarModeloListaModalidad();
        agregarModeloListaHorario();
        agregarModeloListaSede();

        initComponents();

        PlaceHolder nombre = new PlaceHolder("Ingresar nombre", inputNombreC);
        PlaceHolder cantidad = new PlaceHolder("Ingresar cantidad disponible", inputCantidadC);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputNombreC = new javax.swing.JTextField();
        btnGuardarC = new javax.swing.JPanel();
        etiquetaGuardar = new javax.swing.JLabel();
        listaHorario = new javax.swing.JComboBox<>();
        listaModalidad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        listaSedes = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 50, 20));

        inputCantidadC.setNextFocusableComponent(listaSedes);
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

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Modalidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 70, 20));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad disponible");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 130, 20));

        inputNombreC.setNextFocusableComponent(listaHorario);
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
        etiquetaGuardar.setNextFocusableComponent(inputNombreC);
        btnGuardarC.add(etiquetaGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        jPanel1.add(btnGuardarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 210, 50));

        listaHorario.setModel(modeloHorarioC);
        listaHorario.setNextFocusableComponent(listaModalidad);
        jPanel1.add(listaHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 30));

        listaModalidad.setModel(modeloModalidadC);
        listaModalidad.setNextFocusableComponent(inputCantidadC);
        listaModalidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaModalidadMousePressed(evt);
            }
        });
        listaModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaModalidadActionPerformed(evt);
            }
        });
        jPanel1.add(listaModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Campus");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 60, 20));

        listaSedes.setModel(modeloSedeC);
        listaSedes.setNextFocusableComponent(etiquetaGuardar);
        jPanel1.add(listaSedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 190, 30));

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
        funcionesR.guardarDatosRegistroC();
    }//GEN-LAST:event_btnGuardarCMousePressed

    private void inputNombreCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputNombreCMousePressed

    }//GEN-LAST:event_inputNombreCMousePressed

    /*Autor : Andy*/
    private void inputCantidadCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputCantidadCMousePressed

    }//GEN-LAST:event_inputCantidadCMousePressed

    private void listaModalidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaModalidadMousePressed

    }//GEN-LAST:event_listaModalidadMousePressed

    private void listaModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaModalidadActionPerformed
        if (listaModalidad.getSelectedItem().equals("Virtual")) {
            listaSedes.setSelectedItem("Virtual");
        } else if (listaModalidad.getSelectedItem().equals("Presencial")) {
            listaSedes.setSelectedItem("San Pedro");
        }
    }//GEN-LAST:event_listaModalidadActionPerformed

    private void agregarModeloListaHorario() {
        modeloHorarioC.addElement("8:00am - 11:00am");
        modeloHorarioC.addElement("9:00am - 12:00pm");
        modeloHorarioC.addElement("11:00am - 2:00pm");
        modeloHorarioC.addElement("2:00pm - 5:00pm");
        modeloHorarioC.addElement("6:00pm - 9:00pm");
    }

    private void agregarModeloListaModalidad() {
        modeloModalidadC.addElement("Presencial");
        modeloModalidadC.addElement("Virtual");
    }

    private void agregarModeloListaSede() {
        modeloSedeC.addElement("San Pedro");
        modeloSedeC.addElement("Escazú");
        modeloSedeC.addElement("Guanacaste");
        modeloSedeC.addElement("Puerto Viejo");
        modeloSedeC.addElement("Alajuelita");
        modeloSedeC.addElement("Virtual");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnGuardarC;
    public static javax.swing.JLabel etiquetaGuardar;
    public static javax.swing.JTextField inputCantidadC;
    public static javax.swing.JTextField inputNombreC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JComboBox<String> listaHorario;
    public static javax.swing.JComboBox<String> listaModalidad;
    public static javax.swing.JComboBox<String> listaSedes;
    // End of variables declaration//GEN-END:variables
}
