
package decorator;

public class Kebab extends PizzaTäyttäjä{
    public Kebab(Pizza p){
        super(p);
    }

    @Override
    public int palautaHinta(){
        return super.palautaHinta() + 3;
    }
    
    @Override
    public String palautaTäytteet(){
        return super.palautaTäytteet() + ", Kebab";
    }
}
