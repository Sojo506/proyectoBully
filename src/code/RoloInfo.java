/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package code;
import java.awt.Color;
/**
 *
 * @author Andy
 */
public class RoloInfo extends javax.swing.JPanel {

    /**
     * Creates new form RoloPanel
     */
    public RoloInfo() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        gitHubPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        linkPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        instaPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        epicPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        gitHub = new javax.swing.JLabel();
        linkedin = new javax.swing.JLabel();
        epic = new javax.swing.JLabel();
        insta = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(470, 350));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/200X200_2.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 133, 200));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Rolando Algaba Aguilar");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 60));

        gitHubPanel.setBackground(new java.awt.Color(239, 248, 247));
        gitHubPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gitHubPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gitHubPanelMouseExited(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/github.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout gitHubPanelLayout = new javax.swing.GroupLayout(gitHubPanel);
        gitHubPanel.setLayout(gitHubPanelLayout);
        gitHubPanelLayout.setHorizontalGroup(
            gitHubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gitHubPanelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        gitHubPanelLayout.setVerticalGroup(
            gitHubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gitHubPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(gitHubPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 36, 36));

        linkPanel.setBackground(new java.awt.Color(239, 248, 247));
        linkPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linkPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                linkPanelMouseExited(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/linkedin.png"))); // NOI18N

        javax.swing.GroupLayout linkPanelLayout = new javax.swing.GroupLayout(linkPanel);
        linkPanel.setLayout(linkPanelLayout);
        linkPanelLayout.setHorizontalGroup(
            linkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linkPanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        linkPanelLayout.setVerticalGroup(
            linkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linkPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(linkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 36, 36));

        instaPanel.setBackground(new java.awt.Color(239, 248, 247));
        instaPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        instaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                instaPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                instaPanelMouseExited(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insta.png"))); // NOI18N

        javax.swing.GroupLayout instaPanelLayout = new javax.swing.GroupLayout(instaPanel);
        instaPanel.setLayout(instaPanelLayout);
        instaPanelLayout.setHorizontalGroup(
            instaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, instaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        instaPanelLayout.setVerticalGroup(
            instaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, instaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(instaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 36, 36));

        epicPanel.setBackground(new java.awt.Color(239, 248, 247));
        epicPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        epicPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                epicPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                epicPanelMouseExited(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/games.png"))); // NOI18N

        javax.swing.GroupLayout epicPanelLayout = new javax.swing.GroupLayout(epicPanel);
        epicPanel.setLayout(epicPanelLayout);
        epicPanelLayout.setHorizontalGroup(
            epicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(epicPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        epicPanelLayout.setVerticalGroup(
            epicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, epicPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(epicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 36, 36));

        gitHub.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        jPanel1.add(gitHub, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 70, 20));

        linkedin.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        jPanel1.add(linkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 80, 20));

        epic.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        jPanel1.add(epic, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 70, 20));

        insta.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        jPanel1.add(insta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 70, 20));

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel7.setText("y videojuegos.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel8.setText("Tengo 17 años y vivo en Argentina");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 220, 20));

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel9.setText("Soy Rolando un estudiante de ingeniería en sistemas");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel10.setText("Me gusta jugar fútbol, ir al gimnasio, saber de PC´s");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("\"El genio vive solamente un piso por encima de la locura\"");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 340, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 10, 350));

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel12.setText("¡Aquí te dejo algunas de mis redes sociales!");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gitHubPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitHubPanelMouseEntered
        gitHubPanel.setBackground(new Color(204,204,204));
        gitHub.setText("Rolo0519");
    }//GEN-LAST:event_gitHubPanelMouseEntered

    private void gitHubPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitHubPanelMouseExited
        gitHubPanel.setBackground(Color.white);
        gitHub.setText("");
    }//GEN-LAST:event_gitHubPanelMouseExited

    private void linkPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkPanelMouseEntered
        linkPanel.setBackground(new Color(204,204,204));
        linkedin.setText("Rolando Algaba");
    }//GEN-LAST:event_linkPanelMouseEntered

    private void linkPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkPanelMouseExited
        linkPanel.setBackground(Color.white);
        linkedin.setText("");
    }//GEN-LAST:event_linkPanelMouseExited

    private void instaPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instaPanelMouseEntered
        instaPanel.setBackground(new Color(204,204,204));
        insta.setText("rolando__0519");
    }//GEN-LAST:event_instaPanelMouseEntered

    private void instaPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instaPanelMouseExited
        instaPanel.setBackground(Color.white);
        insta.setText("");
    }//GEN-LAST:event_instaPanelMouseExited

    private void epicPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_epicPanelMouseEntered
        epicPanel.setBackground(new Color(204,204,204));
        epic.setText("Rolocondaxdxd");
    }//GEN-LAST:event_epicPanelMouseEntered

    private void epicPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_epicPanelMouseExited
        epicPanel.setBackground(Color.white);
        epic.setText("");
    }//GEN-LAST:event_epicPanelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel epic;
    private javax.swing.JPanel epicPanel;
    private javax.swing.JLabel gitHub;
    private javax.swing.JPanel gitHubPanel;
    private javax.swing.JLabel insta;
    private javax.swing.JPanel instaPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel linkPanel;
    private javax.swing.JLabel linkedin;
    // End of variables declaration//GEN-END:variables
}
