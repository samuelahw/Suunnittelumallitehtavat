
package decorator;

public class main {
    public static void main(String[] args) {        
        Pizza f = new PizzaTäyttäjä(new Herkkusieni(new Salami(new Kinkku(new Pohja()))));
        System.out.println(f.palautaTäytteet() + " - " + f.palautaHinta()+ "€");
        
        Pizza x = new PizzaTäyttäjä(new Kinkku(new Kebab(new Herkkusieni(new Pohja()))));
        System.out.println(x.palautaTäytteet() + " - " + x.palautaHinta()+ "€");
        
        Pizza s = new PizzaTäyttäjä(new Kebab(new Ananas(new Kinkku(new Pohja()))));        
        System.out.println(s.palautaTäytteet() + " - " + s.palautaHinta()+ "€");
    }
}
