
package strategy;

import java.util.List;

public class Writer {
    private ListConverter strategy;

    public Writer(ListConverter l){
        this.strategy = l;
    }
    
    public void setStrategy(ListConverter l){
        this.strategy = l;
    }
    
    public void printList(List list){
        System.out.println(strategy.listToString(list));
    }
}

