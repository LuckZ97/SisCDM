
package siscdm.registro.paciente.sqlUpdates;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Data Collectors
 */
public class regSqlUpdates {
    String dui, noExp, priApe, segApe, nom, sexo, fDeNa, estCivil, docLeTip, ocup, dirHab, noTel;
    int meses, edad, dias, horas;
    
    public void setDui(String d){
        dui = d;    
    }
    
    public void setNoExp(String exp){
        noExp = exp;
    }
    
    public void setPriApe(String pAp){
        priApe = pAp;
    }
    
    public void setSegApe(String sAp){
        segApe = sAp;
    }
    
    public void setNom(String name){
        nom = name;
    }
    
    public void setSex(String sex){
        sexo = sex;
    }
    
    public void setFDeNa(String fdna){
        fDeNa = fdna;
    }
    
    public void setEstCivil(String ecivil){
        estCivil = ecivil;
    }
    
    public void setDocLeTip(String dltipo){
        docLeTip = dltipo;
    }
    
    public void setOcup(String oc){
        ocup = oc;
    }
    
    public void setDirHab(String dirh){
        dirHab = dirh;
    }
    
    public void setNoTel(String ntel){
        noTel = ntel;
    }
    
    //Metodos para devolver los valores en caso de que se realize una consulta 
    public String getDui(){
        return dui;    
    }
    
    public String getNoExp(){
        return noExp;
    }
    
    public String getPriApe(){
        return priApe;
    }
    
    public String getSegApe(){
        return segApe;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getSex(){
        return sexo;
    }
    
    public String getFDeNa(){
        return fDeNa;
    }
    
    public String getEstCivil(){
        return estCivil;
    }
    
    public String getDocLeTip(){
        return docLeTip;
    }
    
    public String getOcup(){
        return ocup;
    }
    
    public String getDirHab(){
        return dirHab;
    }
    
    public String getNoTel(){
        return noTel;
    }
    
    
    public regSqlUpdates(String numExp, String primApellido, String segApellido, String nombres, String docLegal, String numIdentidad, String ocupacion, String dirHabitual, String noTelPaciente){
        try {
            noExp = numExp;
            priApe = primApellido;
            segApe = segApellido;
            nom = nombres;
            docLeTip = docLegal;
            dui = numIdentidad;
            ocup = ocupacion;
            dirHab = dirHabitual;
            noTel = noTelPaciente;
            
            System.out.println("Intentando conectarme a la base de datos.....");
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection regSql = DriverManager.getConnection("jdbc:mysql://127.0.0.1/registro_pacientes", "root","");
            Statement regState = regSql.createStatement();
            
            /*regState.execute("INSERT INTO paciente ('Dui', 'NoExpediente', 'PriApellido', 'SegApellido', 'Nombres', 'Sexo', 'FdeNacimiento', 'Edad', 'Meses', 'Dias', 'Horas', 'EstCivil', 'DocLegIdenTipo', 'Ocupacion', 'DirHabitual', 'NoTelefono') VALUES (" + "\"" +  dui + "\"" + "\"" +  noExp + "\"" + "\"" +  priApe + "\""
                    + "\"" +  segApe + "\"" + "\"" +  nom + "\"" + "\"" +  sexo + "\"" + "\"" + fDeNa + "\"" + "\"" +  edad + "\"" + "\""
                    +  meses + "\"" + "\"" +  dias + "\"" + "\"" +  horas + "\"" + "\"" +  estCivil + "\"" + "\"" +  docLeTip + "\"" + "\""
                    +  ocup + "\"" + "\"" +  dirHab + "\"" + "\"" +  noTel + "\"" + ")");
                    */
        }
        catch(SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Error de SQL:> " + sqlex.getMessage());
        }
        catch(ClassNotFoundException clex){
            JOptionPane.showMessageDialog(null, "Error ClassNotFound:> " + clex.getMessage());
        }
    }    
}
 