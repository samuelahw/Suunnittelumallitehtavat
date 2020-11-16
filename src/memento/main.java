
package memento;

public class main {
    public static void main(String[] arg){
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Asiakas pelaaja = new Asiakas(arvuuttaja, "pekka");
        Asiakas pelaajaa = new Asiakas(arvuuttaja, "mikko");
        Asiakas pelaajat = new Asiakas(arvuuttaja, "petri");
        
        pelaaja.start();
        pelaajaa.start();
        pelaajat.start();
        
        
    }
}
