package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet {

    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {

        setBackground(Color.blue);

        g.setColor(Color.yellow);
        g.fillArc(50, 50, 250, 250, 0, 360);

    }

}
