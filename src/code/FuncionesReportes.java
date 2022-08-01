/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import static code.panelReportes.cantidadCursos;
import static code.panelReportes.cantidadEstudiantes;
import static code.panelReportes.nombreArchivoCursos;
import static code.panelReportes.nombreArchivoEstd;
import static code.panelReportes.promedioEdad;
import static code.panelReportes.prsCantidad;
import static code.panelReportes.virCantidad;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XPC
 */
public class FuncionesReportes {

    private String regexLetr = "^[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+(\\s*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]*)*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+$";
    Conexion conn = new Conexion();
    Connection reg = conn.getConexion();
    // agregar fecha
    LocalDate now = LocalDate.now();
    int ano = now.getYear();
    int dia = now.getDayOfMonth();
    int mes = now.getMonthValue();
    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " ;Septiembre",
        "Octubre", "Noviembre", "Diciemrbre"};
    String fecha = (+dia + "/" + meses[mes - 1] + "/" + ano);
    int activos;
    int promEdad;
    int prs;
    int vir;

    // Metodo para crear archivo txt de estudiantes
    public void archivoEstudiantes() {
        if (!nombreArchivoEstd.getText().matches(regexLetr) || nombreArchivoEstd.getText().length() > 10) {
            javax.swing.JOptionPane.showMessageDialog(null, "Nombre de archivo incorrecto y/o longitud de caracteres no permitida (max 10)", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            // direccion del archivo
            String carpeta = System.getProperty("user.dir");
            String direccionCompleta = carpeta + "/src/reportesArchivos/" + nombreArchivoEstd.getText() + ".txt";
            
            // Crear archivo
            FileWriter url = null;
            try {
                url = new FileWriter(direccionCompleta);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Añadir al archivo
            try {
                BufferedWriter agregar = new BufferedWriter(url);
                agregar.write("\nEmpresa:   Bully Academy   Teléfono:   8888-8888\n\n"
                        + "Dirección:   Al infinito y más allá   Sitio Web:   Bully Academy\n\n"
                        + "Correo:   bullyacademy@gmail.com   Fecha: " + fecha + "\n\n\n"
                        + "\t\t\tReporte De Estudiantes\n\n\n\nNombre   P.A     S.A     Edad  Cédula      Teléfono   Curso\n\n");

                // para ejecutar la consulta
                Statement stm = reg.createStatement();
                ResultSet contador = stm.executeQuery("SELECT * FROM `estudiantes`");

                // para obtener el numero de filas
                activos = 0;
                while (contador.next()) {
                    activos++;
                }

                String estudiantes[][] = new String[activos][7]; // [filas][columnas]

                int i = 0; // itera las filas

                // para reccorer los datos
                ResultSet re = stm.executeQuery("SELECT * FROM `estudiantes`");

                // recorre la tabla estudiantes
                while (re.next()) {
                    agregar.write(estudiantes[i][0] = re.getString("nombre") + "   ");
                    agregar.write(estudiantes[i][1] = re.getString("primerApellido") + "   ");
                    agregar.write(estudiantes[i][2] = re.getString("segundoApellido") + "   ");
                    agregar.write(estudiantes[i][3] = re.getString("edad") + "    ");
                    agregar.write(estudiantes[i][4] = re.getString("cedula") + "   ");
                    agregar.write(estudiantes[i][5] = re.getString("telefono") + "   ");
                    agregar.write(estudiantes[i][6] = re.getString("curso") + "\n");
                    i++;
                }
                
                // Cerrar archivo
                agregar.close();
                javax.swing.JOptionPane.showMessageDialog(null, "¡Archivo Generado Correctamente!",
                        "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException | SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    // Metodo para crear archivo txt de cursos
    public void archivoCursos() {
        if (!nombreArchivoCursos.getText().matches(regexLetr) || nombreArchivoCursos.getText().length() > 10) {
            javax.swing.JOptionPane.showMessageDialog(null, "Nombre de archivo incorrecto y/o longitud de caracteres no permitida (max 10)", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            // direccion del archivo
            String carpeta = System.getProperty("user.dir");
            String direccionCompleta = carpeta + "/src/reportesArchivos/" + nombreArchivoCursos.getText() + ".txt";
            
            // Crear archivo
            FileWriter url = null;
            try {
                url = new FileWriter(direccionCompleta);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Añadir al archivo
            try {
                BufferedWriter agregar = new BufferedWriter(url);
                agregar.write("\nEmpresa:   Bully Academy   Teléfono:   8888-8888\n\n"
                        + "Dirección:   Al infinito y más allá   Sitio Web:   Bully Academy\n\n"
                        + "Correo:   bullyacademy@gmail.com   Fecha: " + fecha + "\n\n\n"
                        + "\t\t\tReporte De Cursos\n\n\n\nNombre        Horario           Modalidad     CantDisp CantEstd   Sede\n\n");

                // para ejecutar la consulta
                Statement stm = reg.createStatement();
                ResultSet contador = stm.executeQuery("SELECT * FROM `cursos`");

                // para obtener el numero de filas
                activos = 0;
                while (contador.next()) {
                    activos++;
                }

                String cursos[][] = new String[activos][6]; // [filas][columnas]

                int i = 0; // itera las filas

                // para reccorer los datos
                ResultSet re = stm.executeQuery("SELECT * FROM `cursos`");

                // recorre la tabla estudiantes
                while (re.next()) {
                    agregar.write(cursos[i][0] = re.getString("nombre") + "   ");
                    agregar.write(cursos[i][1] = re.getString("horario") + "   ");
                    agregar.write(cursos[i][2] = re.getString("modalidad") + "   ");
                    agregar.write(cursos[i][3] = re.getString("cantidad") + "       ");
                    agregar.write(cursos[i][4] = re.getString("cantidadEstudiantes") + "          ");
                    agregar.write(cursos[i][5] = re.getString("sede") + "\n");
                    i++;
                }

                // Cerrar archivo
                agregar.close();
                javax.swing.JOptionPane.showMessageDialog(null, "¡Archivo Generado Correctamente!",
                        "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException | SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    // Metodo para obtener estudiantes activos
    public void estudiantesActivos() throws SQLException {
        // para ejecutar la consulta
        Statement stm = reg.createStatement();
        ResultSet contador = stm.executeQuery("SELECT * FROM `estudiantes`");

        // para obtener el numero de filas
        activos = 0;
        while (contador.next()) {
            activos++;
        }

        String estudiantes[][] = new String[activos][5]; // [filas][columnas]

        int i = 0; // itera las filas
        promEdad = 0;

        // para reccorer los datos
        ResultSet re = stm.executeQuery("SELECT * FROM `estudiantes`");

        // recorre la tabla estudiantes
        while (re.next()) {
            estudiantes[i][4] = re.getString("edad");
            promEdad += Integer.parseInt(estudiantes[i][4]);
            i++;
        }
        if (activos != 0) {
            promEdad /= activos;
        }
        promedioEdad.setText("" + promEdad);
        cantidadEstudiantes.setText("" + activos);
    }

    // Metodo para obtener cursos activos
    public void cursosActivos() throws SQLException {
        // para ejecutar la consulta
        Statement stm = reg.createStatement();
        ResultSet contador = stm.executeQuery("SELECT * FROM `cursos`");

        // para obtener el numero de filas
        activos = 0;
        while (contador.next()) {
            activos++;

        }

        // Obtener cantidad de presencial y virtual
        String cursos[][] = new String[activos][5]; // [filas][columnas]

        // itera las filas
        int i = 0;
        prs = 0;
        vir = 0;

        // para reccorer los datos
        ResultSet re = stm.executeQuery("SELECT * FROM `cursos`");

        while (re.next()) {
            cursos[i][3] = re.getString("modalidad");
            if (cursos[i][3].equals("Presencial")) {
                prs++;
            } else {
                vir++;
            }
        }

        prsCantidad.setText("" + prs);
        virCantidad.setText("" + vir);
        cantidadCursos.setText("" + activos);
    }
}
