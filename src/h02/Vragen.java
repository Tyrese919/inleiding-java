package h02;

import java.awt.*;
import java.applet.*;

public class Vragen extends Applet{

    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {

     g.drawString("Vraag 1: Wat is machinetaal?", 10, 10);
     g.drawString("Antwoord: mechinetaal is een code die alleen maar nullen en eenen gebruikt", 10,25);
        g.drawString("Vraag 2: Welke drie hulpmiddelen heb je nodig om te programmeren", 10, 40);
        g.drawString("Antwoord: 1. een tekstverwerker  2. een compiler 3. een liker", 10, 55);
     g.drawString("Vraag 3: Hoe herken je opdrachten in de broncode?", 10, 70);
     g.drawString("Antwoord: een broncode is de code die schrijft zodat je computer weet wat hij moet doen", 10, 85);
        g.drawString("Vraag 4: Waartoe dienen de import-opdrachten?", 10, 100);
        g.drawString("Antwoord: het word gebruikt om uit de klassenbibiotheek voorgedefinieerde codes te halen", 10, 115);
     g.drawString("Vraag 5: Wat is een methode?", 10, 130);
     g.drawString("Antwoord: het zorgt ervoor dat alles wat je schijft in een body zet", 10, 145);
    }
}
