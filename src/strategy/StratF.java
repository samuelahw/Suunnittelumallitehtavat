
package strategy;

import java.util.Iterator;
import java.util.List;

public class StratF implements ListConverter{

    public StratF(){

    }
    
    @Override
    public String listToString(List l) {
        String returnable = "";
        Iterator i = l.iterator();
        while(i.hasNext()){
            returnable += i.next().toString() + "\n" ;
        }
        
        return returnable;
    }
    
}
