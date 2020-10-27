
package abstractfactory;

import java.util.List;

public class Vaatteet implements VaatteetIf{
    VaateFactory f;
    public Vaatteet(VaateFactory factory){
        f = factory;
    }
    
    public void tulostus(){
        f.tulostaVaatteet();
    }
    
    
}
