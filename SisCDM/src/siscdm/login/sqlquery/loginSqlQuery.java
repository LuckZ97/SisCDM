
package siscdm.login.sqlquery;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Ernesto Zeledon
 */
public class loginSqlQuery {
    //Variables para almacenar el usuario y la contraseña
    int id;
    String usuario;
    String contra;
    
    //Metodo para establecer id del usuario
    public void setId(int idusuario){
        int id = idusuario;
    }
    
    //Metodo para devolver el valor de "id" despues de usar el metodo setId()
    public int getId(){
        return id;
    }
    
    //metodos para establecer el valor de la variable "usuario"
    public void setUser(String user){
        usuario = user;
    }
    //Metodo para devolver el valor de "user" despues de usar el metodo setUser()
    public String getUser(){
        return usuario;    
    }
    //Metodo utilizado para estabelcer el valor de la variable "contra"
    public void setPass(String pass){
        contra = pass;
    }
    //Metodo para devolver el valor de la variable "contra"
    public String getPass(){
        return contra;
    }
    
    public loginSqlQuery(String u, String p) {
        String user = u;
        String password = p;
        
        
        try {
           System.out.println("Intentando conectarme a la base de datos.......");
           Class.forName("com.mysql.jdbc.Driver");
           
           Connection logsql = DriverManager.getConnection("jdbc:mysql://127.0.0.1/registro_pacientes","root","");
           
           
           System.out.println("Conexion realizada con exito");
           
           Statement logquery = logsql.createStatement();
           ResultSet logresult = logquery.executeQuery("SELECT id, Usuario, Contraseña FROM `dbdadmins` WHERE Usuario =" + "\"" + user + "\"");
           
           while(logresult.next()){
               int sqlid = logresult.getInt("id");
               String sqluser = logresult.getString("Usuario");
               String sqlpass = logresult.getString("Contraseña");
               setId(sqlid);
               setUser(sqluser);
               setPass(sqlpass);
               
           }
        }
        catch(SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Error de SQL:> " + sqlex.getMessage());
        }
        catch(ClassNotFoundException clex) {
            JOptionPane.showMessageDialog(null, "Error de Clase > ClassNotFoundException:> " + clex.getMessage());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error de Excepcion:> " + ex);
        }
            
    }
            
        
    
}
