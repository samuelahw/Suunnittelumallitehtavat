
package chainofresponsibility;

public class PalkanKorotusPyyntö {
    private double määrä;
    private double palkka;
    
    public PalkanKorotusPyyntö(double m, double p){
        this.määrä = m;
        this.palkka = p;
    }
    
    public double getMäärä(){
        return määrä;
    }
    
    public void setMäärä(double m){
        määrä = m;
    }
    
    public double getPalkka(){
        return palkka;
    }
    
    public void setPalkka(double p){
        this.palkka = p;
    }
}
