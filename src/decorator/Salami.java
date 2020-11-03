
package decorator;

public class Salami extends PizzaTäyttäjä{
    public Salami(Pizza p){
        super(p);
    }

    @Override
    public int palautaHinta(){
        return super.palautaHinta() + 2;
    }
    
    @Override
    public String palautaTäytteet(){
        return super.palautaTäytteet() + ", Salami";
    }
    
}
