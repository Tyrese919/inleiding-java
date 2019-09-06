package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet {

    public void init() {
        setSize(500,500);
    }

    public void paint (Graphics g){

        //Dobblesteen

        g.drawRect(50,50, 400,400);

        //DeVierStenen

        g.fillArc(100,100,100,100,0,360);
        g.fillArc(100,300,100,100,0,360);
        g.fillArc(300,100,100,100,0,360);
        g.fillArc(300,300,100,100,0,360);

    }
}
