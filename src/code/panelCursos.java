/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package code;

import static code.Main.establecerColor;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Logger;
import java.util.logging.Level;
import static code.Main.panelContenido;
import static code.Main.resetearColor;
import static code.panelRegistroCursos.etiquetaGuardar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.util.concurrent.locks.StampedLock;
import javax.swing.JPanel;

/**
 *
 * @author Andrés
 */
public class panelCursos extends javax.swing.JPanel {

    private DefaultTableModel modeloTabla2 = new DefaultTableModel();
    public static int idCursoModificar;
    public static String anteriorCurso;
    FuncionesCurso funciones = new FuncionesCurso();

    /**
     * Creates new form panelCursos
     */
    public panelCursos() {
        initComponents();
        try {
            funciones.getCursos();
        } catch (SQLException ex) {
            Logger.getLogger(panelCursos.class.getName()).log(Level.SEVERE, null, ex);
        }

        //agregarModeloTabla();
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
        Title = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCursos = new javax.swing.JTable() {
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        btnAgregarC = new javax.swing.JPanel();
        agregar = new javax.swing.JLabel();
        btnModificarC = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBorrarC = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Title.setText("Cursos");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        tablaCursos.setModel(modeloTabla2);
        jScrollPane1.setViewportView(tablaCursos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 680, 260));

        btnAgregarC.setBackground(new java.awt.Color(18, 90, 173));
        btnAgregarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarCMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarCMousePressed(evt);
            }
        });
        btnAgregarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregar.setText("Agregar");
        btnAgregarC.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(btnAgregarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 80, 30));

        btnModificarC.setBackground(new java.awt.Color(18, 90, 173));
        btnModificarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarCMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModificarCMousePressed(evt);
            }
        });
        btnModificarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar");
        btnModificarC.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(btnModificarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 80, 30));

        btnBorrarC.setBackground(new java.awt.Color(18, 90, 173));
        btnBorrarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBorrarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrarCMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBorrarCMousePressed(evt);
            }
        });
        btnBorrarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Borrar");
        btnBorrarC.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(btnBorrarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCMousePressed
        panelRegistroCursos panelRC = new panelRegistroCursos();
        panelRC.setSize(680, 360);
        panelRC.setLocation(0, 0);

        etiquetaGuardar.setText("Guardar");

        panelContenido.removeAll();
        panelContenido.add(panelRC, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnAgregarCMousePressed

    private void btnModificarCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarCMousePressed
        //Llamar el metodo para modificar un curso
        funciones.getModificarCurso();
    }//GEN-LAST:event_btnModificarCMousePressed

    private void btnBorrarCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarCMousePressed
        funciones.getDeleteCurso();
    }//GEN-LAST:event_btnBorrarCMousePressed

    private void btnAgregarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCMouseEntered
        if (btnAgregarC.getBackground().getRGB() == -15574355) {
            establecerColor(btnAgregarC);
        }
    }//GEN-LAST:event_btnAgregarCMouseEntered

    private void btnAgregarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCMouseExited
        if (btnModificarC.getBackground().getRGB() != -15574355 || btnBorrarC.getBackground().getRGB() != -15574355) {
            resetearColor(btnAgregarC);
        }
    }//GEN-LAST:event_btnAgregarCMouseExited

    private void btnModificarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarCMouseEntered
        if (btnModificarC.getBackground().getRGB() == -15574355) {
            establecerColor(btnModificarC);
        }
    }//GEN-LAST:event_btnModificarCMouseEntered

    private void btnModificarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarCMouseExited
        if (btnAgregarC.getBackground().getRGB() != -15574355 || btnBorrarC.getBackground().getRGB() != -15574355) {
            resetearColor(btnModificarC);
        }
    }//GEN-LAST:event_btnModificarCMouseExited

    private void btnBorrarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarCMouseEntered
        if (btnBorrarC.getBackground().getRGB() == -15574355) {
            establecerColor(btnBorrarC);
        }
    }//GEN-LAST:event_btnBorrarCMouseEntered

    private void btnBorrarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarCMouseExited
        if (btnAgregarC.getBackground().getRGB() != -15574355 || btnModificarC.getBackground().getRGB() != -15574355) {
            resetearColor(btnBorrarC);
        }
    }//GEN-LAST:event_btnBorrarCMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel agregar;
    private javax.swing.JPanel btnAgregarC;
    private javax.swing.JPanel btnBorrarC;
    private javax.swing.JPanel btnModificarC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaCursos;
    // End of variables declaration//GEN-END:variables
}
