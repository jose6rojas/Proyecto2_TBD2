package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {

    private String nombreBD = "", puerto = "", nombreUsuario = "", passUsuario = "";
    
    public DB_Connection() {}    
    public DB_Connection(String nombreBD, String puerto, String nombreUsuario, String passUsuario) {
        this.nombreBD = nombreBD;
        this.puerto = puerto;
        this.nombreUsuario = nombreUsuario;
        this.passUsuario = passUsuario;
    }
    
    /* public static void main(String[] args) {
        DB_Connection obj_DB_Connection = new DB_Connection();
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