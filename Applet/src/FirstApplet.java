import java.awt.*;
import java.applet.*;

public class FirstApplet extends Applet{
    Image img;
    public void init(){
        img = getImage(getCodeBase(), "img.gif");
    }
    public void paint (Graphics g){
        g.drawImage(img, 0,0,this);
        g.drawOval(100,0,150,50);
        g.drawString("The Ivy",110,25);
    }
}
