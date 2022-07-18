    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package code;

import static code.Home.panelContenido;
import java.sql.Connection;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Sojo
 */
public class panelEstudiantes extends javax.swing.JPanel {

    Conexion conn;
    Connection reg;
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    public static int idEstudianteModificar;

    public panelEstudiantes() {
        initComponents();
        conn = new Conexion();
        reg = conn.getConexion();
        try {
            getStudents();
        } catch (SQLException ex) {
            Logger.getLogger(panelEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
        panelContenido.removeAll();
        panelContenido.add(this);
        panelContenido.revalidate();
        panelContenido.repaint();
         */
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();
        btnAgregar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setMinimumSize(new java.awt.Dimension(680, 360));
        panel.setPreferredSize(new java.awt.Dimension(750, 430));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Title.setText("Matriculados");
        panel.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel.add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPane1MousePressed(evt);
            }
        });

        tablaEstudiantes.setModel(modeloTabla);
        jScrollPane1.setViewportView(tablaEstudiantes);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 680, 260));

        btnAgregar.setBackground(new java.awt.Color(18, 90, 173));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });
        btnAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar");
        btnAgregar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        panel.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 80, 30));

        btnModificar.setBackground(new java.awt.Color(18, 90, 173));
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModificarMousePressed(evt);
            }
        });
        btnModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modificar");
        btnModificar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        panel.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 80, 30));

        btnBorrar.setBackground(new java.awt.Color(18, 90, 173));
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBorrarMousePressed(evt);
            }
        });
        btnBorrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Borrar");
        btnBorrar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        panel.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Agregar Estudiantes
    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        System.out.println("Hola");
        // Instanciamos el panel
        panelRegistroEstudiantes rAg = new panelRegistroEstudiantes();
        rAg.setSize(680, 360);
        rAg.setLocation(0, 0);
        rAg.etiquetaTitulo.setText("Registrar Estudiante");
        rAg.etiquetaGuardar.setText("Registrar");

        // Removemos el panel anterior y pasamos el nuevo para mostrarlo
        panelContenido.removeAll();
        panelContenido.add(rAg, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();

    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        if (btnAgregar.getBackground().getRGB() == -15574355) {
            establecerColor(btnAgregar);
        }
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        if (btnModificar.getBackground().getRGB() != -15574355 || btnBorrar.getBackground().getRGB() != -15574355) {
            resetearColor(btnAgregar);
        }
    }//GEN-LAST:event_btnAgregarMouseExited
    // Modificar Estudiantes
    private void btnModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMousePressed
      
        // Instanciamos el panel
        getStudent();
    }//GEN-LAST:event_btnModificarMousePressed

    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        if (btnModificar.getBackground().getRGB() == -15574355) {
            establecerColor(btnModificar);
        }
    }//GEN-LAST:event_btnModificarMouseEntered

    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
        if (btnAgregar.getBackground().getRGB() != -15574355 || btnBorrar.getBackground().getRGB() != -15574355) {
            resetearColor(btnModificar);
        }
    }//GEN-LAST:event_btnModificarMouseExited

    private void btnBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseEntered
        if (btnBorrar.getBackground().getRGB() == -15574355) {
            establecerColor(btnBorrar);
        }
    }//GEN-LAST:event_btnBorrarMouseEntered

    private void btnBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseExited
        if (btnAgregar.getBackground().getRGB() != -15574355 || btnModificar.getBackground().getRGB() != -15574355) {
            resetearColor(btnBorrar);
        }
    }//GEN-LAST:event_btnBorrarMouseExited

    // Borrar estudiantes
    private void btnBorrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMousePressed
        try {
            int filaEstudiante = tablaEstudiantes.getSelectedRow(); // Obtenemos la fila del estudiante seleccionado
            if (filaEstudiante <= -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el estudiante a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                // para ejecutar la consulta
                Statement stm = reg.createStatement();
                ResultSet contador = stm.executeQuery("SELECT * FROM `estudiantes`");

                // para obtener el numero de filas
                int fila = 0;
                while (contador.next()) {
                    fila++;
                }

                String estudiantes[][] = new String[fila][1]; // [filas][columnas]
                int i = 0; // itera las filas
                // para reccorer los datos
                ResultSet re = stm.executeQuery("SELECT * FROM `estudiantes`");
                // recorre la tabla estudiantes

                while (re.next()) { //re.next obtiene la cantidad de filas a iterar
                    estudiantes[i][0] = re.getString("idEstudiante");
                    i++;
                }

                int idEstudiante = Integer.parseInt(estudiantes[filaEstudiante][0]); // obtenemos el id del estudiante
                System.out.println(idEstudiante);
                if (idEstudiante <= 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el estudiante a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // para ejecutar la consulta
                    Statement stm2 = null;
                    try {
                        stm2 = reg.createStatement();
                    } catch (SQLException ex) {
                        System.out.println("Error 1");
                        //Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        stm2.executeUpdate("DELETE FROM `estudiantes` WHERE `idEstudiante` = " + idEstudiante + " LIMIT 1");
                        javax.swing.JOptionPane.showMessageDialog(this, "¡Estudiante borrado! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        getStudents();
                    } catch (SQLException ex) {
                        System.out.println("Error 2" + ex);
                        //Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(panelEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBorrarMousePressed

    private void jScrollPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MousePressed

    private void getStudents() throws SQLException {
        // para ejecutar la consulta
        Statement stm = reg.createStatement();
        ResultSet contador = stm.executeQuery("SELECT * FROM `estudiantes`");

        // para obtener el numero de filas
        int fila = 0;
        while (contador.next()) {
            fila++;
        }

        String estudiantes[][] = new String[fila][7]; // [filas][columnas]
        int i = 0; // itera las filas

        ResultSet re = stm.executeQuery("SELECT * FROM `estudiantes`");
        // recorre la tabla estudiantes
        while (re.next()) {
            estudiantes[i][0] = re.getString("nombre");
            estudiantes[i][1] = re.getString("primerApellido");
            estudiantes[i][2] = re.getString("segundoApellido");
            estudiantes[i][3] = re.getString("edad");
            estudiantes[i][4] = re.getString("cedula");
            estudiantes[i][5] = re.getString("telefono");
            estudiantes[i][6] = re.getString("curso");
            i++;
        }

        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(estudiantes,new String[]{
                    "Nombre", "Primer Apellido", "Segundo Apellido", "Edad", "Cédula", "Teléfono", "Curso"}));
    }

    // Obtener el estudiante para ser modificado
    public void getStudent() {
        try {
            // Obtenemos la fila del estudiante seleccionado
            int filaEstudiante = tablaEstudiantes.getSelectedRow(); 
            
            if (filaEstudiante <= -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el estudiante a modificarr. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                // para ejecutar la consulta
                Statement stm = reg.createStatement();
                ResultSet contador = stm.executeQuery("SELECT * FROM `estudiantes`");

                // para obtener el numero de filas
                int fila = 0;
                while (contador.next()) {
                    fila++;
                }

                String estudiantes[][] = new String[fila][7]; // [filas][columnas]
                int i = 0; // itera las filas
                // para reccorer los datos
                ResultSet re = stm.executeQuery("SELECT * FROM `estudiantes`");
                
                // recorre la tabla estudiantes
                while (re.next()) { 
                    estudiantes[i][0] = re.getString("idEstudiante");
                    estudiantes[i][1] = re.getString("nombre");
                    estudiantes[i][2] = re.getString("primerApellido");
                    estudiantes[i][3] = re.getString("segundoApellido");
                    estudiantes[i][4] = re.getString("edad");
                    estudiantes[i][5] = re.getString("cedula");
                    estudiantes[i][6] = re.getString("telefono");
                    i++;
                }

                // obtenemos el id del estudiante
                idEstudianteModificar = Integer.parseInt(estudiantes[filaEstudiante][0]);
                
                if (idEstudianteModificar <= 0) {   
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el estudiante a modificar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // mostramos el panel
                    panelRegistroEstudiantes rUp = new panelRegistroEstudiantes();
                    rUp.setSize(680, 360);
                    rUp.setLocation(0, 0);
                    rUp.etiquetaTitulo.setText("Modificar Estudiante");
                    rUp.etiquetaGuardar.setText("Modificar");
                    
                    // Pasamos los datos
                    rUp.inputNombre.setText(estudiantes[filaEstudiante][1]);
                    rUp.inputPrimerApellido.setText(estudiantes[filaEstudiante][2]);
                    rUp.inputSegundoApellido.setText(estudiantes[filaEstudiante][3]);
                    rUp.inputEdad.setText(estudiantes[filaEstudiante][4]);
                    rUp.inputCedula.setText(estudiantes[filaEstudiante][5]);
                    rUp.inputTelefono.setText(estudiantes[filaEstudiante][6]);
                    
                    // Removemos el panel anterior y pasamos el nuevo para mostrarlo
                    panelContenido.removeAll();
                    panelContenido.add(rUp, BorderLayout.CENTER);
                    panelContenido.revalidate();
                    panelContenido.repaint();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(panelEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Para obtener el color cuando pase MousePressed
    public void establecerColor(JPanel panel) {
        panel.setBackground(new Color(21, 101, 192));
    }

    // Para devolver el color por defecto
    public void resetearColor(JPanel panel) {
        panel.setBackground(new Color(18, 90, 173));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnBorrar;
    private javax.swing.JPanel btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    public javax.swing.JTable tablaEstudiantes;
    // End of variables declaration//GEN-END:variables
}
