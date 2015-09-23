
package siscdm;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import siscdm.registro.paciente.Identificacion;

public class SisCDM  extends JFrame{
    SisCDM(){
        
        this.setBounds(0, 0, 400, 300);
        this.setVisible(true);
        
        
        String user;
        String password;
        
        JLabel lblUser = new JLabel("Ingrese su Usuario");
        lblUser.setBounds(20, 10, 30, 100);
        this.add(lblUser);
        
        JTextField txtfUser = new JTextField();
        txtfUser.setBounds(50, 20, 30, 100);
        JLabel lblPass = new JLabel("Ingrese su Contraseña");
        JTextField txtfPass = new JTextField();
        
    }
   
    public static void main(String[] args) {
        Identificacion n = new Identificacion();
    }
    
}
