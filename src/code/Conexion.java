
package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sojo
 */
public class Conexion {
    private static Connection conn;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/proyecto_bully";
    private static final String user = "root";
<<<<<<< HEAD
    private static final String pass = "an2017dy";
=======
    private static final String pass = "Araya1712";
>>>>>>> 13806025cc734e9bd9ed2176e7c1d64dd8d7f45c

    public Conexion() {
        conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión realizada");
            if(conn != null)
                System.out.println("Conexión establecida exitosamente");
            
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("Conexión Fallida:\n\n"+ex);
        }
    }
    
    public Connection getConexion() {
        return conn;
    }
    
}
