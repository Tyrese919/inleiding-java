package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet {

    public void init() {
        setSize(500,500);
    }

    public void paint(Graphics g) {

        setBackground(Color.white);

        //StoplightVreem
        g.drawRoundRect(50, 50, 100, 300, 25, 25);

        //Stoplight kleuren
        g.setColor(Color.red);
        g.fillArc(60, 60, 80, 80, 0, 360);

        g.setColor(Color.orange);
        g.fillArc(60, 160, 80, 80, 0, 360);

        g.setColor(Color.green);
        g.fillArc(60, 260, 80, 80, 0, 360);
    }

}
