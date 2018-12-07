package SQL_Server;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexiones {
    static Connection contacto = null;  
    public static String user; 
    public static String psw;
    public static boolean status =false; 
    public static Statement st; 
    public static ResultSet rs = null;
    
    public static Connection getConnection(){
        status = false;
        String url = "jdbc:sqlserver://172.16.31.206:1433;databaseName=AEROPUERTO_1"; 
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudos establecer la conexion... "
            + "revisa driver" + e.getMessage(),"Error de conexion",JOptionPane.ERROR_MESSAGE);                        
        }
        try {
            contacto = DriverManager.getConnection(url,Conexiones.user,Conexiones.psw);
            status = true;
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion... "
            + "revisa driver" + e.getMessage(),"Error de conexion",JOptionPane.ERROR_MESSAGE);                        
        }
        return contacto;
    }
    
    public static ResultSet consultaDatos(String consulta) {
        Connection con = getConnection();
        Statement declara; 
        try {
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion... "
            + "revisa driver" + e.getMessage(),"Error de conexion",JOptionPane.ERROR_MESSAGE); 
        }
        return null;
    }
    
    public static void setCuenta(String user, String pass) {
        Conexiones.user = user; 
        Conexiones.psw = pass; 
    }
    public static boolean getStatus() {
        return status;
    }
    
    public static void addModelo(String numModelo, int capacidad,float peso) {
        try {
           st= contacto.createStatement();
           st.executeUpdate("INSERT INTO MODELO (numModelo,capacidad,peso)"
                   + " VALUES ('"+numModelo+"',"+"'"+capacidad+"',"+"'"+peso+"');"); 
        }catch (SQLException e) {
            
        }      
    }
    public static void addAviones(String numRegistro, String A_numModelo){
        try{
           st= contacto.createStatement();
           st.executeUpdate("INSERT INTO AVION (numRegistro,A_numModelo)"
                   + " VALUES ('"+numRegistro+"',"+"'"+A_numModelo+"');"); 
        }catch (SQLException e) {
            
        }      
    }
    
    public static void addEmpleado(String dni, int numAfiliacion,
            String nombre, String direccion, String numTelefono,float sueldo){
        try{
           st= contacto.createStatement();
           st.executeUpdate("INSERT INTO EMPLEADO (DNI,numAfiliacion,nombre,"
                   + "direccion,numTelefono,sueldo)"
                   + " VALUES ('"+dni+"',"+numAfiliacion+",'"+
                   nombre+"',"+"'"+direccion+"','"+numTelefono+"',"+
                   sueldo + ");"); 
        }catch (SQLException e) {
            
        }      
    }
    
    public static void addTecnico(String T_DNI){
        try{
           st= contacto.createStatement();
           st.executeUpdate("INSERT INTO TECNICO (T_DNI)"
                   + " VALUES ('"+T_DNI+"');"); 
        }catch (SQLException e) {
            
        }      
    }
    
    public static void addControlador(String CA_DNI, String fechaExamen){
        try{
           st= contacto.createStatement();
           st.executeUpdate("INSERT INTO CONTROLADOR_AEREO (numRegistro,A_numModelo)"
                   + " VALUES ('"+CA_DNI+"',"+"'"+fechaExamen+"');"); 
        }catch (SQLException e) {
            
        }      
    }
    
    public static void addPrueba(int numExamen, String Pnombre,
            int Pnota, String PnumRegistro, String P_DNI){
        try{
           st= contacto.createStatement();
           st.executeUpdate("INSERT INTO PRUEBA (numExamen,Pnombre,Pnota,"
                   + "PnumRegistro,String,P_DNI)"
                   + " VALUES ("+numExamen+","+Pnombre+","+
                   Pnota+","+"'"+PnumRegistro+"','"+P_DNI+");"); 
        }catch (SQLException e) {
            
        }      
    }
    public static void addExperto(String E_numModelo, String E_DNI, String maestria){
        try{
           st= contacto.createStatement();
           st.executeUpdate("INSERT INTO EXPERTO (numRegistro,A_numModelo)"
                   + " VALUES ('"+E_numModelo+"',"+"'"+E_DNI+"'"+maestria+"');"); 
        }catch (SQLException e) {
            
        }      
    }
    
    
    public static void crearUsuario(String user, String pass){
        try{
            st = contacto.createStatement();
            st.executeQuery("create login "+ user + " with password = "+"'"+pass+"'");
            st.executeQuery("create user "+ user + " for login "+ user);
            st.executeQuery("alter server Role [sysadmin] add member " +
                    user+";");
            
        }
        catch (SQLException e) {
            
        } 
    }
    
    public static void eliminarUsuario(String user){
        try {
            st = contacto.createStatement();
            int confirmado = JOptionPane.showConfirmDialog(null,
            "¿Esta seguro que quiere eliminar el usuario?");
            if (JOptionPane.OK_OPTION == confirmado){
                //st.executeQuery("DROP USER "+user+";");
                st.executeQuery("drop login "+user+";");    
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexiones.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
    public static boolean modificarUser(String user, String pass){
        try {
            st = contacto.createStatement();
            st.executeQuery("create login "+ user + " with password = "+"'"+pass+"'");
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexiones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false; 
    }
    public static boolean superRoot(String user, String pass){
        
        try {
            rs = st.executeQuery("SELECT * FROM sys.sql_logins\n" +
                                 "Where name = '"+user+"');");
            if (rs!=null){
                while(rs.next()){

                }
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexiones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;         
    }
    
    public static void commit() {
        try {
            try {
                contacto.commit();
            } catch (SQLException e) {
            }
        } catch (Exception e) {
         }
    }
   
}
