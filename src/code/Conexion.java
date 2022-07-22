
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
    private static final String pass = "Araya1712";
=======
<<<<<<< HEAD
    private static final String pass = "an2017dy";
=======
    private static final String pass = "Devastedrolo";
>>>>>>> b1632a89c23f202a8955288a4b256b07169e9bf5
>>>>>>> 2e432d77f30c6a61164ee2530aad74af27e1ca8d
    
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
