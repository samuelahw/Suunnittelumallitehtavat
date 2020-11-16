
package memento;

public class Asiakas extends Thread{
    private Object obj;
    Arvuuttaja arv;
    String nimi;
    
    public Asiakas(Arvuuttaja a, String nimi){
        arv = a;
        this.nimi = nimi;
        obj = arv.liityPeliin(this);
    }
    
    public boolean arvaus(Arvuuttaja a, int arvaus){
        return arv.tarkistus(obj, arvaus);
    }
  
    @Override
    public void run(){
        int i = 0;
        while(true){
            if (arvaus(arv,i)){
                System.out.println(nimi + " arvasi numeroa "+i+" ja se on oikein!");
                break;
            } else System.out.println(nimi + " arvasi numeroa "+i+" ja se on väärin");

            i++;
        }
    }
}
