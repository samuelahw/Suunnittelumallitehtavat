
package decorator;

public class Kinkku extends PizzaTäyttäjä{
    public Kinkku(Pizza p){
        super(p);
    }

    @Override
    public int palautaHinta(){
        return super.palautaHinta() + 3;
    }
    
    @Override
    public String palautaTäytteet(){
        return super.palautaTäytteet() + ", Kinkku";
    }
}
