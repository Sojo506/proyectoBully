/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package code;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JPanel;

/**
 *
 * @author XPC
 */
public class Home extends javax.swing.JFrame {
    // Hola
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        LocalDate now = LocalDate.now();
        int ano = now.getYear();
        int dia = now.getDayOfMonth();
        int mes = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"," ;Septiembre"
            ,"Octubre","Noviembre","Diciemrbre"};
        etiquetaFecha.setText("Hoy es "+dia+" de "+meses[mes - 1]+" de "+ano);
        
        
        panelInicio inicio = new panelInicio();
        inicio.setSize(680, 360);
        inicio.setLocation(0, 0);
        panelContenido.removeAll();
        panelContenido.add(inicio, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        btnInicio = new javax.swing.JPanel();
        etiquetaInicio = new javax.swing.JLabel();
        iconInicio = new javax.swing.JLabel();
        btnEstudiantes = new javax.swing.JPanel();
        etiquetaEstudiante = new javax.swing.JLabel();
        iconEstudiante = new javax.swing.JLabel();
        btnCursos = new javax.swing.JPanel();
        etiquetaCursos = new javax.swing.JLabel();
        iconCursos = new javax.swing.JLabel();
        btnInfo = new javax.swing.JPanel();
        etiquetaInfo = new javax.swing.JLabel();
        iconInfo = new javax.swing.JLabel();
        etiquetaInicio2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelEncabezado = new javax.swing.JPanel();
        etiquetaPalabrasClaves = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLateral.setBackground(new java.awt.Color(13, 71, 161));
        panelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setBackground(new java.awt.Color(18, 90, 173));
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInicioMousePressed(evt);
            }
        });

        etiquetaInicio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiquetaInicio.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaInicio.setText("Inicio");

        iconInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaInicio)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addGroup(btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnInicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(btnInicioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(etiquetaInicio)))
                .addGap(16, 16, 16))
        );

        panelLateral.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 290, 50));

        btnEstudiantes.setBackground(new java.awt.Color(18, 90, 173));
        btnEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstudiantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstudiantesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEstudiantesMousePressed(evt);
            }
        });

        etiquetaEstudiante.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiquetaEstudiante.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaEstudiante.setText("Estudiantes");

        iconEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N

        javax.swing.GroupLayout btnEstudiantesLayout = new javax.swing.GroupLayout(btnEstudiantes);
        btnEstudiantes.setLayout(btnEstudiantesLayout);
        btnEstudiantesLayout.setHorizontalGroup(
            btnEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEstudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaEstudiante)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        btnEstudiantesLayout.setVerticalGroup(
            btnEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEstudiantesLayout.createSequentialGroup()
                .addGroup(btnEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnEstudiantesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(btnEstudiantesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(etiquetaEstudiante)))
                .addGap(16, 16, 16))
        );

        panelLateral.add(btnEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 290, 50));

        btnCursos.setBackground(new java.awt.Color(18, 90, 173));
        btnCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCursosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCursosMousePressed(evt);
            }
        });

        etiquetaCursos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiquetaCursos.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaCursos.setText("Cursos");

        iconCursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/courses.png"))); // NOI18N

        javax.swing.GroupLayout btnCursosLayout = new javax.swing.GroupLayout(btnCursos);
        btnCursos.setLayout(btnCursosLayout);
        btnCursosLayout.setHorizontalGroup(
            btnCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCursosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaCursos)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        btnCursosLayout.setVerticalGroup(
            btnCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCursosLayout.createSequentialGroup()
                .addGroup(btnCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnCursosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(btnCursosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(etiquetaCursos)))
                .addGap(16, 16, 16))
        );

        panelLateral.add(btnCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 290, 50));

        btnInfo.setBackground(new java.awt.Color(18, 90, 173));
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInfoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInfoMousePressed(evt);
            }
        });

        etiquetaInfo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiquetaInfo.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaInfo.setText("Info");

        iconInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.png"))); // NOI18N

        javax.swing.GroupLayout btnInfoLayout = new javax.swing.GroupLayout(btnInfo);
        btnInfo.setLayout(btnInfoLayout);
        btnInfoLayout.setHorizontalGroup(
            btnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaInfo)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        btnInfoLayout.setVerticalGroup(
            btnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInfoLayout.createSequentialGroup()
                .addGroup(btnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(btnInfoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(etiquetaInfo)))
                .addGap(16, 16, 16))
        );

        panelLateral.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 290, 50));

        etiquetaInicio2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        etiquetaInicio2.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaInicio2.setText("Bully Academy");
        panelLateral.add(etiquetaInicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        panelLateral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 220, 20));

        bgPanel.add(panelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 540));

        panelEncabezado.setBackground(new java.awt.Color(197, 168, 14));

        etiquetaPalabrasClaves.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiquetaPalabrasClaves.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaPalabrasClaves.setText("Concurrencia/Control/Academia/");

        etiquetaFecha.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiquetaFecha.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaFecha)
                    .addComponent(etiquetaPalabrasClaves))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(etiquetaPalabrasClaves)
                .addGap(18, 18, 18)
                .addComponent(etiquetaFecha)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        bgPanel.add(panelEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 680, 110));

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        bgPanel.add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 680, 360));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });
        bgPanel.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Error de evento
    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked

    }//GEN-LAST:event_btnInicioMouseClicked

    //MousePressed: cuando se presiones realiace las siguientes acciones
    private void btnInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMousePressed
        // Reseteamos el color de los btns, y establecemos el color al btn seleccionado
        resetearColor(btnEstudiantes);
        resetearColor(btnCursos);
        resetearColor(btnInfo);
        establecerColor(btnInicio);
        
        // Instanciamos el panel
        panelInicio inicio = new panelInicio();
        inicio.setSize(680, 360);
        inicio.setLocation(0, 0);
        
        // Removemos el panel anterior y pasamos el nuevo para mostrarlo
        panelContenido.removeAll();
        panelContenido.add(inicio, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnInicioMousePressed

    private void btnEstudiantesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstudiantesMousePressed
        // Reseteamos el color de los btns, y establecemos el color al btn seleccionado
        resetearColor(btnInicio);
        resetearColor(btnCursos);
        resetearColor(btnInfo);
        establecerColor(btnEstudiantes);
        
        // Instanciamos el panel&
        panelEstudiantes estudiantes = new panelEstudiantes();
        estudiantes.setSize(680, 360);
        estudiantes.setLocation(0, 0);
        
        // Removemos el panel anterior y pasamos el nuevo para mostrarlo
        panelContenido.removeAll();
        panelContenido.add(estudiantes, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnEstudiantesMousePressed
    // MouseEntered: Cuando pase el mouse por encima del panel
    // MouseExited: Cuando el mouse salga del panel
    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        if(btnInicio.getBackground().getRGB() == -15574355) {
            establecerColor(btnInicio);
        }
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        if(btnEstudiantes.getBackground().getRGB() != -15574355 || btnCursos.getBackground().getRGB() != -15574355
            || btnInfo.getBackground().getRGB() != -15574355) {
            resetearColor(btnInicio);
        }
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnEstudiantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstudiantesMouseEntered
        if(btnEstudiantes.getBackground().getRGB() == -15574355) {
            establecerColor(btnEstudiantes);
        }
    }//GEN-LAST:event_btnEstudiantesMouseEntered

    private void btnEstudiantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstudiantesMouseExited
        if(btnInicio.getBackground().getRGB() != -15574355 || btnCursos.getBackground().getRGB() != -15574355
            || btnInfo.getBackground().getRGB() != -15574355) {
            resetearColor(btnEstudiantes);
        }
    }//GEN-LAST:event_btnEstudiantesMouseExited

    private void btnCursosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCursosMousePressed
        // Reseteamos el color de los btns, y establecemos el color al btn seleccionado
        resetearColor(btnInicio);
        resetearColor(btnEstudiantes);
        resetearColor(btnInfo);
        establecerColor(btnCursos);
        
        // Instanciamos el panel
        panelCursos cursos = new panelCursos();
        cursos.setSize(680, 360);
        cursos.setLocation(0, 0);
        
        // Removemos el panel anterior y pasamos el nuevo para mostrarlo
        panelContenido.removeAll();
        panelContenido.add(cursos, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnCursosMousePressed

    private void btnCursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCursosMouseEntered
        if(btnCursos.getBackground().getRGB() == -15574355) {
            establecerColor(btnCursos);
        }
    }//GEN-LAST:event_btnCursosMouseEntered

    private void btnCursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCursosMouseExited
        if(btnInicio.getBackground().getRGB() != -15574355 || btnEstudiantes.getBackground().getRGB() != -15574355
            || btnInfo.getBackground().getRGB() != -15574355) {
            resetearColor(btnCursos);
        }
    }//GEN-LAST:event_btnCursosMouseExited

    private void btnInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMousePressed
        // Reseteamos el color de los btns, y establecemos el color al btn seleccionado
        resetearColor(btnInicio);
        resetearColor(btnEstudiantes);
        resetearColor(btnCursos);
        establecerColor(btnInfo);
        
        // Instanciamos el panel
        panelInfo info = new panelInfo();
        info.setSize(680, 360);
        info.setLocation(0, 0);
        
        // Removemos el panel anterior y pasamos el nuevo para mostrarlo
        panelContenido.removeAll();
        panelContenido.add(info, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnInfoMousePressed

    private void btnInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseEntered
        if(btnInfo.getBackground().getRGB() == -15574355) {
            establecerColor(btnInfo);
        }
    }//GEN-LAST:event_btnInfoMouseEntered

    private void btnInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseExited
        if(btnInicio.getBackground().getRGB() != -15574355 || btnEstudiantes.getBackground().getRGB() != -15574355
            || btnCursos.getBackground().getRGB() != -15574355) {
            resetearColor(btnInfo);
        }
    }//GEN-LAST:event_btnInfoMouseExited

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnSalirMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    //Para obtener el color cuando pase MousePressed
    public void establecerColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    // Para devolver el color por defecto
    public void resetearColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JPanel btnCursos;
    private javax.swing.JPanel btnEstudiantes;
    private javax.swing.JPanel btnInfo;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel etiquetaCursos;
    private javax.swing.JLabel etiquetaEstudiante;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaInfo;
    private javax.swing.JLabel etiquetaInicio;
    private javax.swing.JLabel etiquetaInicio2;
    private javax.swing.JLabel etiquetaPalabrasClaves;
    private javax.swing.JLabel iconCursos;
    private javax.swing.JLabel iconEstudiante;
    private javax.swing.JLabel iconInfo;
    private javax.swing.JLabel iconInicio;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelLateral;
    // End of variables declaration//GEN-END:variables
}
