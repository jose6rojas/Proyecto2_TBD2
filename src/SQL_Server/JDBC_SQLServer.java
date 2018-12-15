package SQL_Server;

import java.sql.*; // 1. Import the package.

public class JDBC_SQLServer {
    
    // atributos
    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    
    // constructores
    public JDBC_SQLServer() {}
    
    // setters & getters
    // public void setCon(Connection con) { this.con = con; }
    public void setSt(Statement st) { this.st = st; }
    public void setRs(ResultSet rs) { this.rs = rs; }
    public Connection getCon() { return con; }
    public Statement getSt() { return st; }
    public ResultSet getRs() { return rs; }
    
    // métodos & funciones
    public Connection establecerConexion(String nombreBD, String puerto, String nombreUsuario, String passUsuario) {
        String url = "jdbc:sqlserver://localhost:" + puerto + ";" + "databaseName = " + nombreBD;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // 2. Load and register the driver.
            con = DriverManager.getConnection(url, nombreUsuario, passUsuario); // 3. Create the connection.            
            System.out.println("La conexión a SQL Server fue establecida exitosamente.");
        } catch (Exception e) {
            System.out.println("La conexión no pudo ser establecida.");
            System.out.println(e);
        }
        return con;
    }
    
    /* public static void main(String[] args) throws Exception {                
        /* Statement st = con.createStatement(); // 4. Create the statement.
        ResultSet rs = st.executeQuery(query); // 5. Execute the query.
        
        // 6. Process the results.
        rs.next();
        String resultado = rs.getString("name");
        System.out.println(resultado);
        
        // 7. Close
        st.close();
        con.close();
    } */
    
}