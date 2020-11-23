
package builder;

import java.util.List;

public class main {
    public static void main(String[] args){
        
        
        HesburgerBuilder Hesburger = new HesburgerBuilder();
        Hesburger.luoBurgeri();
        
        System.out.println("Hesburgerin hampurilainen:");
        System.out.println(Hesburger.getBurger().toString());
        
        
        McDonaldsBuilder McDonalds = new McDonaldsBuilder();
        McDonalds.luoBurgeri();
        
        List<Object> mcdonaldsBurger = McDonalds.getBurger();
        
        
        System.out.println("\nMcDonalds hampurilainen:");
        for(Object o : mcdonaldsBurger){
            System.out.println(o.getClass().getName());
        }
    }
}
