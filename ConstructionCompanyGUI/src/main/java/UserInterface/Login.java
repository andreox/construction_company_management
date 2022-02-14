package UserInterface;

import APIRequests.LoginAPI;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Login extends JFrame {
    private JTextArea constructionCompanyLoginPageTextArea;
    private JPanel panel1;
    private JButton loginButton;
    private JTextField usernameTextField;
    private JPasswordField passwordPasswordField;

    /*private void createUIComponents() {
        // TODO: place custom component creation code here
    }*/

    public static void main(String [] args ) {

        //FlatLightLaf.setup() ;
        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Login frame = new Login() ;
                    frame.setVisible(true) ;
                }
                catch ( Exception e) {
                    e.printStackTrace() ;
                }
            }
        }) ;

    }

    public Login() {

        //LogoCanvas lc = new LogoCanvas() ;
        FlatDarkLaf.setup() ;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        this.setLayout(new BorderLayout()) ;
        this.add(panel1) ;
        //this.add(lc) ;
        /*try {
            BufferedImage myPicture = ImageIO.read(this.getClass().getResource("./logo.png"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));

            this.add(picLabel);
        } catch (Exception e ) { e.printStackTrace(); }*/

        setBounds(100,100,427,284) ;
        clickLogin() ;

    }

    private void clickLogin() {

        this.loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean ret = LoginAPI.LoginRequest(usernameTextField.getText(),passwordPasswordField.getText());
                String s = new String("ok") ;

                if ( ret ) JOptionPane.showConfirmDialog(rootPane, "Login effettuato") ;
                else JOptionPane.showConfirmDialog(rootPane, "Credenziali errate") ;
            }
        });
    }
}
