
package decorator;

public class Pohja implements Pizza{
    
    public Pohja(){
        
    }

    @Override
    public int palautaHinta(){
        return 3;
    }
    
    @Override
    public String palautaTäytteet(){
        return "Normaali pohja";
    }
  
}
