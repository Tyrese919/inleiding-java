package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    int Xas1;
    int Xas2;
    int Xas3;
    int XasCircel;
    int Yas1;
    int Yas2;
    int Yas3;

    public void init() {
        setSize(500, 500);

        Xas1 = 50;
        Xas2 = 250;
        Xas3 = 450;

        XasCircel = 500;

        Yas1 = 50;
        Yas2 = 100;
        Yas3 = 200;
    }

    public void paint(Graphics g) {

        //lijn

        g.drawLine(Xas1,Yas1,200,50);

        g.drawString("Lijn", 120, 70);

        //Rechthoek

        g.drawRect(Xas1,Yas2,150,50);

        g.drawString("Rechthoek", 100, 170);

        //GevuldeRechthoekMetOvaal

        g.setColor(Color.magenta);
        g.fillRect(Xas2,Yas2,150,50);
        g.setColor(Color.black);
        g.drawOval(Xas2,Yas2,150,50);

        g.drawString("Gevulde Rechthoek met ovaal", 240, 170);

        //TaartpuntMetOvaalEromheen

        g.setColor(Color.magenta);
        g.fillArc(Xas3,Yas2,150,45,0,45);
        g.setColor(Color.black);
        g.drawOval(Xas3,Yas2,150,50);

        g.drawString("Taartpunt Met Ovaal Eromheen", 440, 170);

        //AfgerondeRechthoek

        g.drawRoundRect(Xas1,Yas3,150,50,25,25);

        g.drawString("Afgeronde Rechthoek", 65, 270);

        //GevuldeOvaal

        g.setColor(Color.magenta);
        g.fillOval(Xas2,Yas3,150,50);
        g.setColor(Color.black);
        g.drawOval(Xas2,Yas3,150,50);

        g.drawString("Gevulde Ovaal", 285, 270);

        //Cirkel

        g.drawOval(XasCircel,Yas3,50,50);

        g.drawString("Cirkel", 510, 270);

    }
}