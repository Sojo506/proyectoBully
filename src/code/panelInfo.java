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
        infoSojo so = new infoSojo();
        so.setSize(390, 360);
        so.setLocation(0, 0);

        Infodecadauno.removeAll();
        Infodecadauno.add(so, BorderLayout.CENTER);
        establecerColor(Fabian);
        Infodecadauno.revalidate();
        Infodecadauno.repaint();
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
        rolando = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Andy = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Fabian = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Andres = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Kevin = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Infodecadauno = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(680, 360));

        panelprin.setBackground(new java.awt.Color(255, 255, 255));
        panelprin.setPreferredSize(new java.awt.Dimension(680, 360));
        panelprin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rolando.setBackground(new java.awt.Color(18, 90, 173));
        rolando.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rolando.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rolandoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rolandoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rolandoMousePressed(evt);
            }
        });
        rolando.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Rolando");
        rolando.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        panelprin.add(rolando, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 140, 30));

        Andy.setBackground(new java.awt.Color(18, 90, 173));
        Andy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Andy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AndyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AndyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AndyMousePressed(evt);
            }
        });
        Andy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Andy");
        Andy.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        panelprin.add(Andy, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 140, 30));

        Fabian.setBackground(new java.awt.Color(18, 90, 173));
        Fabian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fabian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FabianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FabianMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FabianMousePressed(evt);
            }
        });
        Fabian.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fabián");
        Fabian.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 28));

        panelprin.add(Fabian, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 140, -1));

        Andres.setBackground(new java.awt.Color(18, 90, 173));
        Andres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Andres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AndresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AndresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AndresMousePressed(evt);
            }
        });
        Andres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Andrés");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        Andres.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 139, 28));

        panelprin.add(Andres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, -1));

        Kevin.setBackground(new java.awt.Color(18, 90, 173));
        Kevin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kevin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KevinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KevinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KevinMousePressed(evt);
            }
        });
        Kevin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Kevin");
        Kevin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 139, 30));

        panelprin.add(Kevin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 140, 30));

        Infodecadauno.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout InfodecadaunoLayout = new javax.swing.GroupLayout(Infodecadauno);
        Infodecadauno.setLayout(InfodecadaunoLayout);
        InfodecadaunoLayout.setHorizontalGroup(
            InfodecadaunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        InfodecadaunoLayout.setVerticalGroup(
            InfodecadaunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        panelprin.add(Infodecadauno, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 0, 390, 360));

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

    private void rolandoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rolandoMouseEntered
        if(rolando.getBackground().getRGB() == -15574355) {
            establecerColor(rolando);
        }
    }//GEN-LAST:event_rolandoMouseEntered

    private void rolandoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rolandoMouseExited
        if(Andy.getBackground().getRGB() != -15574355 || Fabian.getBackground().getRGB() != -15574355
            || Kevin.getBackground().getRGB() != -15574355 || Andres.getBackground().getRGB() != -15574355) {
            resetearColor(rolando);
        }
    }//GEN-LAST:event_rolandoMouseExited

    private void AndyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndyMouseEntered
        if(Andy.getBackground().getRGB() == -15574355) {
            establecerColor(Andy);
        }
    }//GEN-LAST:event_AndyMouseEntered

    private void AndyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndyMouseExited
        if (rolando.getBackground().getRGB() != -15574355 || Fabian.getBackground().getRGB() != -15574355
                || Kevin.getBackground().getRGB() != -15574355 || Andres.getBackground().getRGB() != -15574355) {
            resetearColor(Andy);
        }
    }//GEN-LAST:event_AndyMouseExited

    private void FabianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FabianMouseEntered
        if(Fabian.getBackground().getRGB() == -15574355) {
            establecerColor(Fabian);
        }
    }//GEN-LAST:event_FabianMouseEntered

    private void FabianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FabianMouseExited
        if (rolando.getBackground().getRGB() != -15574355 || Andy.getBackground().getRGB() != -15574355
                || Kevin.getBackground().getRGB() != -15574355 || Andres.getBackground().getRGB() != -15574355) {
            resetearColor(Fabian);
        }
    }//GEN-LAST:event_FabianMouseExited

    private void AndresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndresMouseEntered
        if(Andres.getBackground().getRGB() == -15574355) {
            establecerColor(Andres);
        }
    }//GEN-LAST:event_AndresMouseEntered

    private void AndresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndresMouseExited
        if (rolando.getBackground().getRGB() != -15574355 || Andy.getBackground().getRGB() != -15574355
                || Kevin.getBackground().getRGB() != -15574355 || Fabian.getBackground().getRGB() != -15574355) {
            resetearColor(Andres);
        }
    }//GEN-LAST:event_AndresMouseExited

    private void KevinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KevinMouseEntered
        if(Kevin.getBackground().getRGB() == -15574355) {
            establecerColor(Kevin);
        }
    }//GEN-LAST:event_KevinMouseEntered

    private void KevinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KevinMouseExited
        if (rolando.getBackground().getRGB() != -15574355 || Andy.getBackground().getRGB() != -15574355
                || Fabian.getBackground().getRGB() != -15574355 || Andres.getBackground().getRGB() != -15574355) {
            resetearColor(Kevin);
        }
    }//GEN-LAST:event_KevinMouseExited

    private void FabianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FabianMousePressed
        // Reseteamos el color de los btns, y establecemos el color al btn seleccionado
        resetearColor(rolando);
        resetearColor(Andy);
        resetearColor(Andres);
        resetearColor(Kevin);
        establecerColor(Fabian);
        
        infoSojo so = new infoSojo();
        so.setSize(390, 360);
        so.setLocation(0, 0);

        Infodecadauno.removeAll();
        Infodecadauno.add(so, BorderLayout.CENTER);
        Infodecadauno.revalidate();
        Infodecadauno.repaint();


    }//GEN-LAST:event_FabianMousePressed

    private void rolandoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rolandoMousePressed
        // Reseteamos el color de los btns, y establecemos el color al btn seleccionado
        resetearColor(Fabian);
        resetearColor(Andy);
        resetearColor(Andres);
        resetearColor(Kevin);
        establecerColor(rolando);
        
        
        
        Infodecadauno.removeAll();
        
        Infodecadauno.revalidate();
        Infodecadauno.repaint();
    }//GEN-LAST:event_rolandoMousePressed

    private void AndyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndyMousePressed
        // Reseteamos el color de los btns, y establecemos el color al btn seleccionado
        resetearColor(rolando);
        resetearColor(Fabian);
        resetearColor(Andres);
        resetearColor(Kevin);
        establecerColor(Andy);
        
        
        
        Infodecadauno.removeAll();
        
        Infodecadauno.revalidate();
        Infodecadauno.repaint();
    }//GEN-LAST:event_AndyMousePressed

    private void AndresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndresMousePressed
        // Reseteamos el color de los btns, y establecemos el color al btn seleccionado
        resetearColor(rolando);
        resetearColor(Andy);
        resetearColor(Fabian);
        resetearColor(Kevin);
        establecerColor(Andres);
        System.out.print("andres");
        InfoAnd IAnd = new InfoAnd();
        IAnd.setSize(390, 360);
        IAnd.setLocation(0, 0);
        
       
        Infodecadauno.removeAll();
        Infodecadauno.add(IAnd);
        Infodecadauno.revalidate();
        Infodecadauno.repaint();
    }//GEN-LAST:event_AndresMousePressed

    private void KevinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KevinMousePressed
        // Reseteamos el color de los btns, y establecemos el color al btn seleccionado
        resetearColor(rolando);
        resetearColor(Andy);
        resetearColor(Andres);
        resetearColor(Fabian);
        establecerColor(Kevin);
        
         InfoK IK = new InfoK();
        IK.setSize(390, 360);
        IK.setLocation(0, 0);
        
        Infodecadauno.removeAll();
        Infodecadauno.add(IK);
        Infodecadauno.revalidate();
        Infodecadauno.repaint();
    }//GEN-LAST:event_KevinMousePressed

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MousePressed

    //Para obtener el color cuando pase MousePressed
    public void establecerColor(JPanel panel) {
        panel.setBackground(new Color(21, 101, 192));
    }

    // Para devolver el color por defecto
    public void resetearColor(JPanel panel) {
        panel.setBackground(new Color(18, 90, 173));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Andres;
    private javax.swing.JPanel Andy;
    private javax.swing.JPanel Fabian;
    private javax.swing.JPanel Infodecadauno;
    private javax.swing.JPanel Kevin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panelprin;
    private javax.swing.JPanel rolando;
    // End of variables declaration//GEN-END:variables
}
