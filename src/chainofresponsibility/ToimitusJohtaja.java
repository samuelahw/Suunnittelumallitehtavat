
package chainofresponsibility;

import java.text.DecimalFormat;

public class ToimitusJohtaja extends YlennysVoima{
    private final double MAKSIMIKOROTUS = VAKIO;
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    
    public void hoidaPyyntö(PalkanKorotusPyyntö pyyntö){       
            double uusiPalkka = pyyntö.getPalkka() * ((pyyntö.getMäärä() /100) +1); 
            pyyntö.setPalkka(uusiPalkka);
            System.out.println("Palkkaa korotettu Toimitusjohtajan toimesta " + pyyntö.getMäärä() + "% ja palkka nyt: " + df2.format(uusiPalkka) + "€");
    }
}
