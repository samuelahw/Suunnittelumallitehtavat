
package memento;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Arvuuttaja {
    
    public synchronized Memento liityPeliin(Asiakas a){
        Memento m;
        int arvattava = (int) ( Math.random() * 6 + 1);
        return m = new Memento(arvattava);
    }
    
    public synchronized boolean tarkistus(Object memento, int arvaus){
        Memento m = (Memento) memento;
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Arvuuttaja.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(m.getArvattava() == arvaus){
        return true;
        }
        return false;
    }
    
    private class Memento{
        private int arvattava;
        
        public Memento(int arvattava){
            this.arvattava = arvattava;
        }
        
        public int getArvattava(){
            return arvattava;
        }
    }
}
