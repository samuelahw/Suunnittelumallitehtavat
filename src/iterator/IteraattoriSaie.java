
package iterator;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IteraattoriSaie extends Thread {
    int numero;
    Iterator iteraattori;
    public IteraattoriSaie(Iterator r, int i){
        iteraattori = r;
        numero = i;
    }
    
    public void iteroi(){
        while(iteraattori.hasNext()){
            System.out.println(iteraattori.next() + " " + numero);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(IteraattoriSaie.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void run(){
        iteroi();
    }
}
