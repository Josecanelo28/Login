package Login;

//Esta clase es para realizar la conexion a la Base de Datos

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    //Estas variables son para la conexion y determinar la ruta y datos relacionados con la BD
    protected static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "Canelo0228";
    private static final String url = "jdbc:mysql://localhost:3306/Login";

    //Este metodo es el que realiza la conexión
    public ConexionBD() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Conexion Exitosa a la Base de Datos.");
            } 
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("Error en la conexión a la Base de Datos" + e);
        }
    }
    
    //Este metodo es para retornar la conexion
    public Connection getConnection(){
        return conn;
    }
    
    //Este metodo desconecta la Base de Datos
    public void desconectar(){
        conn = null;
        if (conn == null) {
            System.out.println("Conexión Finalizada con la Base de Datos.");
            
        }
    }
    
}
