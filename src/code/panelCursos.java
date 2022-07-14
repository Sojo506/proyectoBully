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
import java.sql.Connection;

/**
 *
 * @author Andrés
 */
public class panelCursos extends javax.swing.JPanel {
    Conexion conn;
    Connection reg;
    private DefaultTableModel modeloTabla2 = new DefaultTableModel();
    /**
     * Creates new form panelCursos
     */
    public panelCursos() {
        initComponents();
        conn = new Conexion();
        reg = conn.getConexion();
        try{
            getCursos();
        }catch(SQLException ex){
            Logger.getLogger(panelCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        agregarModeloTabla();
        
    }

    private void agregarModeloTabla(){
        modeloTabla2.addColumn("Nombre");
        modeloTabla2.addColumn("Horario");
        modeloTabla2.addColumn("Modalidad");
        modeloTabla2.addColumn("Cantidad");
        modeloTabla2.addColumn("Disponibilidad");
    
    }
    
    private void getCursos()throws SQLException{
        Statement stm = reg.createStatement();
        ResultSet counter = stm.executeQuery("SELECT * FROM `cursos`");
        
        // Obtener el numero de filas
        int contador = 0;
        while(counter.next()) {
            contador++;
        }
        
        String cursos[][] = new String[contador][6];//filas //columnas
        int i = 0;
        ResultSet re = stm.executeQuery("SELECT * FROM `cursos`");
        while(re.next()){
        cursos[i][0] = re.getString("Nombre");
        cursos[i][1] = re.getString("Horario");
        cursos[i][2] = re.getString("Modalidad");
        cursos[i][3] = re.getString("Cantidad");
        i++;
        }
        
        tablaCursos.setModel(new javax.swing.table.DefaultTableModel(cursos, new String []{
            "Nombre", "Horario", "Modalidad", "Cantidad"
        }));
    
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 680, 240));

        btnAgregarC.setBackground(new java.awt.Color(18, 90, 173));
        btnAgregarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarCMousePressed(evt);
            }
        });
        btnAgregarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("Agregar");
        btnAgregarC.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        jPanel1.add(btnAgregarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 80, 30));

        btnModificarC.setBackground(new java.awt.Color(18, 90, 173));
        btnModificarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificar");
        btnModificarC.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        jPanel1.add(btnModificarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 80, 30));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel agregar;
    private javax.swing.JPanel btnAgregarC;
    private javax.swing.JPanel btnModificarC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCursos;
    // End of variables declaration//GEN-END:variables
}
