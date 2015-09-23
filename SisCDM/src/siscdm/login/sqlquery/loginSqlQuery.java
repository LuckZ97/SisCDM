/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscdm.login.sqlquery;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Ernesto Zeledon
 */
public class loginSqlQuery {
    //Variables para almacenar el usuario y la contraseña
    String usuario;
    String contra;
    
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
    
    public loginSqlQuery() {
        
        
        try {
           System.out.println("Intentando conectarme a la base de datos.......");
           Class.forName("com.mysql.jdbc.Driver");
           
           Connection logsql = DriverManager.getConnection("jdbc:mysql://127.0.0.1/zoologico","root","");
           Statement logquery = logsql.createStatement();
           ResultSet logresult = logquery.executeQuery("SELECT * FROM `dbadmins`");
           
           
           while(logresult.next()){
               String sqluser = logresult.getString("Usuario");
               String sqlpass = logresult.getString("Contraseña");
               //System.out.println("Usuario: " + logresult.getString("Usuario") + "Contraseña: " + logresult.getString("Contraseña"));
               //JOptionPane.showMessageDialog(null, "Tu usuario es: " + logresult.getString("Usuario") + " y tu contraseña: " + logresult.getString("Contraseña"));
               //JOptionPane.showMessageDialog(null, "Tu usuario es: " + user + " contraseña: " + pass);
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
