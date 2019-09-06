package h04;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {

    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {

        //lijn

        g.drawLine(50,50,200,50);

        g.drawString("Lijn", 120, 70);

        //Rechthoek

        g.drawRect(50,100,150,50);

        g.drawString("Rechthoek", 100, 170);

        //GevuldeRechthoekMetOvaal

        g.setColor(Color.magenta);
        g.fillRect(250,100,150,50);
        g.setColor(Color.black);
        g.drawOval(250,100,150,50);

        g.drawString("Gevulde Rechthoek met ovaal", 240, 170);

        //TaartpuntMetOvaalEromheen

        g.setColor(Color.magenta);
        g.fillArc(450,100,150,45,0,45);
        g.setColor(Color.black);
        g.drawOval(450,100,150,50);

        g.drawString("Taartpunt Met Ovaal Eromheen", 440, 170);

        //AfgerondeRechthoek

        g.drawRoundRect(50,200,150,50,25,25);

        g.drawString("Afgeronde Rechthoek", 65, 270);

        //GevuldeOvaal

        g.setColor(Color.magenta);
        g.fillOval(250,200,150,50);
        g.setColor(Color.black);
        g.drawOval(250,200,150,50);

        g.drawString("Gevulde Ovaal", 285, 270);

        //Cirkel

        g.drawOval(500,200,50,50);

        g.drawString("Cirkel", 510, 270);

    }
}