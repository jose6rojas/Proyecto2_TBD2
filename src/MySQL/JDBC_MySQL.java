package MySQL;

import java.sql.*;

public class JDBC_MySQL {
    
    // atributos
    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    
    // constructores
    public JDBC_MySQL() {}
    
    // setters & getters
    // public void setCon(Connection con) { this.con = con; }
    public void setSt(Statement st) { this.st = st; }
    public void setRs(ResultSet rs) { this.rs = rs; }
    public Connection getCon() { return con; }
    public Statement getSt() { return st; }
    public ResultSet getRs() { return rs; }
    
    // métodos & funciones
    public Connection establecerConexion(String nombreBD, String puerto, String nombreUsuario, String passUsuario) {
        String url = "jdbc:mysql://localhost:" + puerto + "/" + nombreBD + "?autoReconnect=true&useSSL=false";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, nombreUsuario, passUsuario);
            System.out.println("La conexión a MySQL fue establecida exitosamente.");
        } catch (Exception e) {
            System.out.println("La conexión no pudo ser establecida.");
            System.out.println(e);
        }
        return con;
    }    

}