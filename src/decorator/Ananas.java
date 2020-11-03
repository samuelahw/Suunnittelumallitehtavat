
package decorator;

public class Ananas extends PizzaTäyttäjä{
        public Ananas(Pizza p){
        super(p);
    }

    @Override
    public int palautaHinta(){
        return super.palautaHinta() + 2;
    }
    
    @Override
    public String palautaTäytteet(){
        return super.palautaTäytteet() + ", Ananas";
    }
    
}
