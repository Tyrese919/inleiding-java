package h02;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Tyrese", 50, 60 );
        g.setColor(Color.red);
        g.drawString("van Schagen", 50, 70);
    }
}
