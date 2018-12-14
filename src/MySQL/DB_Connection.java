package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {

    private String BD = "", port = "", username = "", password = "";

//    public static void main(String[] args) {
//        DB_Connection obj_DB_Connection = new DB_Connection();
//        System.out.println(obj_DB_Connection.get_connection());
//    }
    public Connection get_connection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:" + port + "/" + BD + "?autoReconnect=true&useSSL=false", username, password);
            //jdbc:mysql://localhost:3306/Peoples?autoReconnect=true&useSSL=false
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }

    public DB_Connection() {
    }

    public DB_Connection(String BD, String port, String username, String password) {
        this.BD = BD;
        this.port = port;
        this.username = username;
        this.password = password;
    }
}
