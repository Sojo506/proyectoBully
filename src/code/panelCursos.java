/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package code;

import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Logger;
import java.util.logging.Level;
import static code.Home.panelContenido;
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

    Conexion conn;
    Connection reg;
    private DefaultTableModel modeloTabla2 = new DefaultTableModel();
    public static int idCursoModificar;

    /**
     * Creates new form panelCursos
     */
    public panelCursos() {
        initComponents();
        conn = new Conexion();
        reg = conn.getConexion();
        try {
            getCursos();
        } catch (SQLException ex) {
            Logger.getLogger(panelCursos.class.getName()).log(Level.SEVERE, null, ex);
        }

        //agregarModeloTabla();

    }

    //Metodo para agregar las columnas de la tabla
    private void agregarModeloTabla() {
        modeloTabla2.addColumn("Nombre");
        modeloTabla2.addColumn("Horario");
        modeloTabla2.addColumn("Modalidad");
        modeloTabla2.addColumn("Cantidad");
        modeloTabla2.addColumn("Disponibilidad");

    }

    //Metodo para mostrar los datos en las tablas
    private void getCursos() throws SQLException {
        Statement stm = reg.createStatement(); //Para procesar una sentencia SQL
        ResultSet counter = stm.executeQuery("SELECT * FROM `cursos`"); //Para indicar que tabla vamos a utlizar

        // Obtener el numero de filas
        int contador = 0;
        while (counter.next()) {
            contador++;
        }
        //Creamos un arreglo para luego recorrerlo
        String cursos[][] = new String[contador][4];//filas //columnas
        int i = 0;
        ResultSet re = stm.executeQuery("SELECT * FROM `cursos`");
        while (re.next()) {
            cursos[i][0] = re.getString("nombre");
            cursos[i][1] = re.getString("horario");
            cursos[i][2] = re.getString("modalidad");
            cursos[i][3] = re.getString("cantidad");
            i++;
        }

        tablaCursos.setModel(new javax.swing.table.DefaultTableModel(cursos, new String[]{
            "Nombre", "Horario", "Modalidad", "Cantidad"
        }));

    }

    //Metodo para modificar algun curso
    private void getModificarCurso() {
        try {
            int filaCurso = tablaCursos.getSelectedRow(); //Para obtener la fila del curso
            System.out.println("fila seleccionada "+filaCurso);
            //Condicional para verificar que se seleccione un curso para ser modificado
            if (filaCurso < 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar un curso para poder modificarlo. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                //Ejecutar la consulta
                Statement stm = reg.createStatement();
                ResultSet contador = stm.executeQuery("SELECT * FROM `cursos`");

                //Obtener el numero de filas
                int fila = 0;
                while (contador.next()) {
                    fila++;
                }

                String cursos[][] = new String[fila][5];
                int i = 0; //Iterador de las filas
                ResultSet re = stm.executeQuery("SELECT * FROM `cursos`");

                //Recorrer la tabla
                while (re.next()) {
                    cursos[i][0] = re.getString("idCurso");
                    cursos[i][1] = re.getString("nombre");
                    cursos[i][2] = re.getString("horario");
                    cursos[i][3] = re.getString("modalidad");
                    cursos[i][4] = re.getString("cantidad");
                    i++;
                }

                //Para obtener los datos de los cursos
                idCursoModificar = Integer.parseInt(cursos[filaCurso][0]);
                System.out.println("Seleccionado"+ idCursoModificar);

                //Otro condicional para verificar que se seleccione un curso a modificar
                if (idCursoModificar < 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar un curso para poder modificarlo. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    //Mostrar el panel
                    panelRegistroCursos pRc = new panelRegistroCursos();
                    pRc.setSize(680, 360);
                    pRc.setLocation(0, 0);
                    pRc.etiquetaGuardar.setText("Modificar");

                    //Poner los datos en los campos
                    pRc.inputNombreC.setText(cursos[filaCurso][1]);
                    pRc.inputHorarioC.setText(cursos[filaCurso][2]);
                    pRc.inputModalidadC.setText(cursos[filaCurso][3]);
                    pRc.inputCantidadC.setText(cursos[filaCurso][4]);

                    //Remover el panel anterior
                    panelContenido.removeAll();
                    panelContenido.add(pRc, BorderLayout.CENTER);
                    panelContenido.revalidate();
                    panelContenido.repaint();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(panelCursos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void establecerColor(JPanel panel){
        panel.setBackground(new Color(21, 101, 192));
    }
    
    public void resetearColor(JPanel panel){
        panel.setBackground(new Color(18, 90, 173));
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
        tablaCursos = new javax.swing.JTable();
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
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        tablaCursos.setModel(modeloTabla2);
        jScrollPane1.setViewportView(tablaCursos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 680, 260));

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

        jPanel1.add(btnAgregarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 80, 30));

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

        jPanel1.add(btnModificarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 80, 30));

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

        jPanel1.add(btnBorrarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 80, 30));

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

        panelRC.etiquetaGuardar.setText("Guardar");

        panelContenido.removeAll();
        panelContenido.add(panelRC);
        panelContenido.revalidate();
        panelContenido.repaint();


    }//GEN-LAST:event_btnAgregarCMousePressed

    private void btnModificarCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarCMousePressed
        //Llamar el metodo para modificar un curso
        getModificarCurso();
    }//GEN-LAST:event_btnModificarCMousePressed

    private void btnBorrarCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarCMousePressed
        try {
            //Para obtener la fila de el curso seleccionado
            int filaCuros = tablaCursos.getSelectedRow();
            if (filaCuros < 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el curso que desea borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
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
                String cursos[][] = new String[fila][5];
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
                    i++;
                }
                //Variable para obtener el id del estudiante
                int idCurso = Integer.parseInt(cursos[filaCuros][0]);
                System.out.println(idCurso);
                if (idCurso < 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el curso que desea borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    //Ejecutamos la consulta
                    Statement stm2 = null;
                    try {
                        stm2 = reg.createStatement();
                    } catch (SQLException ex) {
                        System.out.println("Error 1");

                    }
                    try {
                        stm2.executeUpdate("DELETE FROM `cursos` WHERE `idCurso` = " + idCurso + " LIMIT 1");
                        javax.swing.JOptionPane.showMessageDialog(this, "Se borro el curso correctamente \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        getCursos();
                    } catch (SQLException ex) {
                        System.out.println("Error 2" + ex);
                    }

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(panelCursos.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnBorrarCMousePressed

    private void btnAgregarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCMouseEntered
        if(btnAgregarC.getBackground().getRGB() == -15574355){
            establecerColor(btnAgregarC);
        }
    }//GEN-LAST:event_btnAgregarCMouseEntered

    private void btnAgregarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCMouseExited
        if(btnModificarC.getBackground().getRGB() != -15574355 || btnBorrarC.getBackground().getRGB() != -15574355){
            resetearColor(btnAgregarC);
        }
    }//GEN-LAST:event_btnAgregarCMouseExited

    private void btnModificarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarCMouseEntered
        if(btnModificarC.getBackground().getRGB() == -15574355){
            establecerColor(btnModificarC);
        }
    }//GEN-LAST:event_btnModificarCMouseEntered

    private void btnModificarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarCMouseExited
        if(btnAgregarC.getBackground().getRGB() != -15574355 || btnBorrarC.getBackground().getRGB() != -15574355){
            resetearColor(btnModificarC);
        }
    }//GEN-LAST:event_btnModificarCMouseExited

    private void btnBorrarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarCMouseEntered
        if(btnBorrarC.getBackground().getRGB() == -15574355){
            establecerColor(btnBorrarC);
        }
    }//GEN-LAST:event_btnBorrarCMouseEntered

    private void btnBorrarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarCMouseExited
        if(btnAgregarC.getBackground().getRGB() != -15574355 || btnModificarC.getBackground().getRGB() != -15574355){
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
    private javax.swing.JTable tablaCursos;
    // End of variables declaration//GEN-END:variables
}
