package SQL_Server;

import java.sql.*; // 1. Import the package.

public class JDBC_SQLServer {
    
    public static void main(String[] args) throws Exception {        
        String url = "jdbc:sqlserver://localhost:1433;databaseName=aero";
        String nombreUsuario = "sa";
        String passUsuario = "Overkill23";
        
        String query = "select name from Passenger where ID_psg = 1;";
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // 2. Load and register the driver.
        Connection con = DriverManager.getConnection(url, nombreUsuario, passUsuario); // 3. Create the connection.
        System.out.println("La conexión a SQL Server fue establecida exitosamente.");
        Statement st = con.createStatement(); // 4. Create the statement.
        ResultSet rs = st.executeQuery(query); // 5. Execute the query.
        
        // 6. Process the results.
        rs.next();
        String resultado = rs.getString("name");
        System.out.println(resultado);
        
        // 7. Close
        st.close();
        con.close();        
    }
    
}