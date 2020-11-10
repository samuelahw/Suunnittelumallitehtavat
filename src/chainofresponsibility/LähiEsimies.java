
package chainofresponsibility;

import java.text.DecimalFormat;

public class LähiEsimies extends YlennysVoima{
    private final double MAKSIMIKOROTUS = VAKIO/50;
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    
    public void hoidaPyyntö(PalkanKorotusPyyntö pyyntö){
        if(pyyntö.getMäärä() < MAKSIMIKOROTUS){
            double uusiPalkka = pyyntö.getPalkka() * ((pyyntö.getMäärä() /100) +1);
            pyyntö.setPalkka(uusiPalkka);
            System.out.println("Palkkaa korotettu Lähiesimiehen toimesta " + pyyntö.getMäärä() + "% ja palkka nyt: " + df2.format(uusiPalkka) + "€");
        } else {
            super.hoidaPyyntö(pyyntö);
        }
    }
}
