
package chainofresponsibility;

public class YlennysVoima {
    protected static final double VAKIO = 100;
    private YlennysVoima seuraava;
    
    public void asetaSeuraava(YlennysVoima seuraava){
        this.seuraava = seuraava;
    }
    
    public void hoidaPyyntö(PalkanKorotusPyyntö pyyntö){
            if(seuraava != null){
                seuraava.hoidaPyyntö(pyyntö);
            }
    }
}
