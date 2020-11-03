
package decorator;

public class PizzaTäyttäjä implements Pizza{
    private final Pizza täytettäväPizza;
    
    public PizzaTäyttäjä(Pizza täytettäväPizza){
        this.täytettäväPizza = täytettäväPizza;
    }
    
    @Override
    public int palautaHinta() {
        return täytettäväPizza.palautaHinta();
    }

    @Override
    public String palautaTäytteet() {
       return täytettäväPizza.palautaTäytteet();
    }
    
}
