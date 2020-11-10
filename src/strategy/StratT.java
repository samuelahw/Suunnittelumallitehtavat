
package strategy;

import java.util.List;

public class StratT implements ListConverter{

    public StratT(){

    }
     
    @Override
    public String listToString(List l) {
        String returnable = "";
        for(int i = 1; i < l.size()+1; i++){
            if(i % 3 == 0){
                returnable += l.get(i-1) + "\n";
            }else {
                returnable += l.get(i-1) + " ";
            }
        }
        return returnable;
    }
    
}
