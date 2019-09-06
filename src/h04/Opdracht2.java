package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        //HuisZelf
        g.drawRect(200,200,100,100);

        //HetDak
        g.drawLine(200, 200,250, 150);
        g.drawLine(250,150,300,200);

        //HetRaam
        g.drawRect(220,260, 20, 20);
        g.drawRect(220,215, 20, 20);
        g.drawRect(260,215, 20, 20);

        //DeDeur
        g.drawRect(260,260,20,40);
    }
}