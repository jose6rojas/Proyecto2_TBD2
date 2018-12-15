package MySQL;

import java.sql.*;

public class JDBC_MySQL {

    private String nombreBD = "", puerto = "", nombreUsuario = "", passUsuario = "";
    
    public JDBC_MySQL() {}    
    public JDBC_MySQL(String nombreBD, String puerto, String nombreUsuario, String passUsuario) {
        this.nombreBD = nombreBD;
        this.puerto = puerto;
        this.nombreUsuario = nombreUsuario;
        this.passUsuario = passUsuario;
    }
    
    /* public static void main(String[] args) {
        JDBC_MySQL obj_DB_Connection = new JDBC_MySQL();
        System.out.println(obj_DB_Connection.get_connection());
    } */
    
    public Connection get_connection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:" + puerto + "/" + nombreBD + "?autoReconnect=true&useSSL=false", nombreUsuario, passUsuario);
            // jdbc:mysql://localhost:3306/Peoples?autoReconnect=true&useSSL=false
            System.out.println("La conexión a MySQL fue establecida exitosamente.");
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }

}