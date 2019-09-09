package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    int gewichtValerie;
    int gewichtJeroen;
    int gewichtHans;

    public void init() {
        setSize(500, 500);

        gewichtValerie = 40;
        gewichtJeroen = 100;
        gewichtHans = 80;

    }
    public void paint(Graphics g) {
        setBackground(Color.white);

        //Diagram
        // y as
        g.setColor(Color.black);
        g.fillRect(50, 150, 5, 300);
        // x as
        g.setColor(Color.black);
        g.fillRect(50, 450, 300, 5);

        //Gewichtlijnen

        g.drawLine(50, 450, 45, 450);
        g.drawString("0kg", 20, 450);

        g.drawLine(50, 400, 45, 400);
        g.drawString("50kg", 10, 400);

        g.drawLine(50, 350, 45, 350);
        g.drawString("100kg", 0, 350);

        g.drawLine(50, 300, 45, 300);
        g.drawString("150kg", 0, 300);

        g.drawLine(50, 250, 45, 250);
        g.drawString("200kg", 0, 250);

        g.drawLine(50, 200, 45, 200);
        g.drawString("250kg", 0, 200);

        //Valerie

        g.drawString("Valerie", 80, 480);

        g.setColor(Color.magenta);
        g.fillRect(70, 450, 50, - gewichtValerie);

        //Jeroen

        g.setColor(Color.black);
        g.drawString("Jeroen", 180, 480);

        g.setColor(Color. green);
        g.fillRect(170, 450, 50, - gewichtJeroen);

        //Hans

        g.setColor(Color.black);
        g.drawString("Hans", 280, 480);

        g.setColor(Color.blue);
        g.fillRect(270, 450, 50, - gewichtHans);
    }
}
