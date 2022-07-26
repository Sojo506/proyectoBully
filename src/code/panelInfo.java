/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package code;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author XPC
 */
public class panelInfo extends javax.swing.JPanel {

    /**
     * Creates new form panelInfo
     */
    public panelInfo() {
        initComponents();
        SojoInfo so = new SojoInfo();
        so.setSize(680, 260);
        so.setLocation(0, 0);

        panelInfoContenido.removeAll();
        panelInfoContenido.add(so, BorderLayout.CENTER);
        panelInfoContenido.revalidate();
        panelInfoContenido.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelprin = new javax.swing.JPanel();
        panelInfoContenido = new javax.swing.JPanel();
        Fabian = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(680, 360));

        panelprin.setBackground(new java.awt.Color(255, 255, 255));
        panelprin.setPreferredSize(new java.awt.Dimension(680, 360));
        panelprin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInfoContenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelInfoContenidoLayout = new javax.swing.GroupLayout(panelInfoContenido);
        panelInfoContenido.setLayout(panelInfoContenidoLayout);
        panelInfoContenidoLayout.setHorizontalGroup(
            panelInfoContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        panelInfoContenidoLayout.setVerticalGroup(
            panelInfoContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        panelprin.add(panelInfoContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 260));

        Fabian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fabian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        Fabian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fabian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FabianMousePressed(evt);
            }
        });
        panelprin.add(Fabian, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 48, 48));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        panelprin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 48, 48));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.jpg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        panelprin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 48, 48));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.jpg"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        panelprin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 48, 48));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.jpg"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        panelprin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 48, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FabianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FabianMousePressed
        SojoInfo so = new SojoInfo();
        so.setSize(680, 260);
        so.setLocation(0, 0);

        panelInfoContenido.removeAll();
        panelInfoContenido.add(so, BorderLayout.CENTER);
        panelInfoContenido.revalidate();
        panelInfoContenido.repaint();
    }//GEN-LAST:event_FabianMousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        AndresInfo and = new AndresInfo();
        and.setSize(680, 260);
        and.setLocation(0, 0);

        panelInfoContenido.removeAll();
        panelInfoContenido.add(and, BorderLayout.CENTER);
        panelInfoContenido.revalidate();
        panelInfoContenido.repaint();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        RoloInfo rl = new RoloInfo();
        rl.setSize(680, 260);
        rl.setLocation(0, 0);
        
        panelInfoContenido.removeAll();
        panelInfoContenido.add(rl);
        panelInfoContenido.revalidate();
        panelInfoContenido.repaint();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        AndyInfo AP = new AndyInfo();
        AP.setSize(680, 260);
        AP.setLocation(0, 0);

        panelInfoContenido.removeAll();
        panelInfoContenido.add(AP, BorderLayout.CENTER);
        panelInfoContenido.revalidate();
        panelInfoContenido.repaint();
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        KevinInfo IK = new KevinInfo();
        IK.setSize(680, 260);
        IK.setLocation(0, 0);

        panelInfoContenido.removeAll();
        panelInfoContenido.add(IK, BorderLayout.CENTER);
        panelInfoContenido.revalidate();
        panelInfoContenido.repaint();
    }//GEN-LAST:event_jLabel3MousePressed

    //Para obtener el color cuando pase MousePressed
    public void establecerColor(JPanel panel) {
        panel.setBackground(new Color(21, 101, 192));
    }

    // Para devolver el color por defecto
    public void resetearColor(JPanel panel) {
        panel.setBackground(new Color(18, 90, 173));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fabian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelInfoContenido;
    private javax.swing.JPanel panelprin;
    // End of variables declaration//GEN-END:variables
}
