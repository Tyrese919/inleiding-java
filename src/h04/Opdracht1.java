package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(75, 125, 175, 125);
        g.drawLine(125, 50, 75, 125);
        g.drawLine(125, 50, 175, 125);
    }
}
