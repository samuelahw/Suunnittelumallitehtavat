
package strategy;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        
        
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        
        ListConverter first = new StratF();
        ListConverter sec = new StratS();
        ListConverter third = new StratT();
        Writer writer = new Writer(first);
        
        writer.printList(list);
        System.out.println("");
        
        writer.setStrategy(sec);
        
        writer.printList(list);
        System.out.println("");
        
        writer.setStrategy(third);
        writer.printList(list);
    }
}
