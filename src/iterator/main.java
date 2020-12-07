
package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {
    public static void main (String[] args){
        List lista = new ArrayList<String>();
        for(int i = 0; i<20; i++){
            lista.add(i);
        }
        Iterator<String> it1 = lista.iterator();
        Iterator<String> it2 = lista.iterator();
        IteraattoriSaie saie1 = new IteraattoriSaie(it1,1);
        IteraattoriSaie saie2 = new IteraattoriSaie(it2,2);
        saie1.start();
        saie2.start();
        
        //Kokoelmaan lisääminen kesken ajon kaataa säikeet.
        //lista.add("50");
        
        try {
            saie1.join();
            saie2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("\n<<Seuraava testi>>\n");
        Iterator<String> it3 = lista.iterator();
             
        IteraattoriSaie saie3 = new IteraattoriSaie(it3,3);
        IteraattoriSaie saie4 = new IteraattoriSaie(it3,4);
        saie3.start();
        saie4.start();
        
        //Iteraattorilla poistaminen pääohjelmasta kesken ajon antaa poikkeuksen pääohjelmaan mutta poistaa yhden alkion ja säie jatkaa iterointia.
        //it3.remove();
        
    }
}
