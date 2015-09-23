
package siscdm;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import siscdm.login.iniciarSesion;
import siscdm.login.sqlquery.loginSqlQuery;
import siscdm.registro.paciente.Identificacion;

public class SisCDM {   
    //public SisCDM() {
      //  iniciarSesion window = new iniciarSesion();
    //}
    
    public static void main(String[] args) {
        //SisCDM VenPrin = new SisCDM();
        iniciarSesion VenPrin = new iniciarSesion();
        VenPrin.setVisible(true);
    }

    
}
