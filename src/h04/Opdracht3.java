package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    public void init() {
        setSize(500,500);
    }

    public void paint(Graphics g) {
        setBackground(Color. white);

        //VlaggenStok
        g.drawRect(50, 50, 20, 400);

        //Vlag
        g.drawRect(70, 60, 200, 40);
        g.drawRect(70, 100, 200, 40);
        g.drawRect(70, 140, 200, 40);

        //VlagKleur
        g.setColor(Color.red);
        g.fillRect(71,61,199,40);
        g.setColor(Color.white);
        g.fillRect(71, 100, 199, 40);
        g.setColor(Color.blue);
        g.fillRect(71, 140, 199,40);

    }
}
