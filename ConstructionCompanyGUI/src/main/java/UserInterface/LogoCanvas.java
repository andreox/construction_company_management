package UserInterface;

import java.awt.*;

public class LogoCanvas extends Canvas {

    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit() ;
        Image i = t.getImage("logo.png") ;
        g.drawImage(i, 120, 100, this) ;
    }
}
