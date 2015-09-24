
package siscdm;
import javax.swing.JFrame;
import siscdm.login.iniciarSesion;

public class SisCDM  extends JFrame{
   
    public static void main(String[] args) {
        
        iniciarSesion loginWindow = new iniciarSesion();
        loginWindow.setVisible(true);
    }

    
}
