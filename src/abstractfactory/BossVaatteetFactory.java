
package abstractfactory;

public class BossVaatteetFactory implements VaateFactory{

    private final String merkki = "Boss";
    private Lippis l;
    private Farmarit f;
    private Kengat k;
    private Tpaita p;
    
    public BossVaatteetFactory(){
        luoVaatteet();
    }

    @Override
    public void tulostaVaatteet() {
        System.out.println(l.toString() + " " + f.toString() + " " + k.toString() + " " + p.toString());
    }

    @Override
    public void luoVaatteet() {
        l = new Lippis(merkki);
        f = new Farmarit(merkki);
        k = new Kengat(merkki);
        p = new Tpaita(merkki);         
    }
    
}
