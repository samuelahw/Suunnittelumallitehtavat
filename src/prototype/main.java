
package prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

public class main {
    public static void main(String[] args){
        Kello k = new Kello(12, 30, 15);
        
        Kello k2 = k.clone();
        
        k.asetaTunti(14);
        
        while(true){         
        k.tick();
        k2.tick();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
             Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
