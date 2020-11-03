
package decorator;

public class Herkkusieni extends PizzaTäyttäjä{
    public Herkkusieni(Pizza p){
        super(p);
    }

    @Override
    public int palautaHinta(){
        return super.palautaHinta() + 1;
    }
    
    @Override
    public String palautaTäytteet(){
        return super.palautaTäytteet() + ", Herkkusieni";
    }
}
