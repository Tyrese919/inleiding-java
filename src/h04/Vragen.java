package h04;

import java.awt.*;
import java.applet.*;

public class Vragen extends Applet {

    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {

        g.drawString("Vraag 1: Wat is een platform?", 10, 10);
        g.drawString("Andwoord: een platform is de prossesor en besturingssysteem die hun eigen eisen stellen aan programma's. samen noem je dat het Platform", 10, 25);
            g.drawString("Vraag 2: Waarom hoeft een programmeur in Java maar één keer een programma te schrijven voor verschillende platforms?", 10, 40);
            g.drawString("Andwoord: omdat java ervoor zorgt dat hij dat veranderd in allerlei codes", 10, 55);
        g.drawString("Vraag 3: Wat is bytecode?", 10, 70);
        g.drawString("Andwoord: bytecode is een code die je in java kan maken die dan woord vertaald naar een tussentaal die standaard is", 10, 85);
            g.drawString("Vraag 4: Wat doet JVM?", 10, 100);
            g.drawString("Andwoord: JVM vertaald de Bytecode in mechinetaal", 10, 115);
        g.drawString("Vraag 5: Met welke methode kun je een vierkant tekenen?", 10, 130);
        g.drawString("Andwoord: g.drawRect", 10, 145);
            g.drawString("Vraag 6: Noem drie methodes waarmee je een cirkel kunt tekenen", 10, 160);
            g.drawString("Andwoord: g.drawRoundRect, g.drawArch, g.drawOval", 10, 175);
        g.drawString("Vraag 7: Waarom worden opdrachten voor het scherm in paint() gezet en niet in een andere methode?", 10, 190);
        g.drawString("Andwoord: vanwegen dat elke computer / pc al paint heeft geinstaleerd", 10, 205);
    }
}