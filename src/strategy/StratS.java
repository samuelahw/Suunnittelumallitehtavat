
package strategy;

import java.util.List;

public class StratS implements ListConverter{

    public StratS(){

    }
    
    @Override
    public String listToString(List l) {
        String returnable = "";
        String[] tempList = new String[l.size()]; 
        for(int i = 0; i < l.size(); i++){
            tempList[i] = (String) l.get(i);
        }
        for(int i = 0; i < tempList.length; i++){
            if(i % 2 == 1){
                returnable += " " + l.get(i) + "\n";
            } else {
                returnable += l.get(i);
            }
        }
        return returnable;
    }
    
}
