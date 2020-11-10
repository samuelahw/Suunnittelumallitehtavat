
package chainofresponsibility;

public class main {
    public static void main(String[] args){
        PalkanKorotusPyyntö pyyntö = new PalkanKorotusPyyntö(1.5, 2000);
        PalkanKorotusPyyntö sPyyntö = new PalkanKorotusPyyntö(3, 3000);
        PalkanKorotusPyyntö aPyyntö = new PalkanKorotusPyyntö(6, 4000);
        
        LähiEsimies lähiEsimies = new LähiEsimies();
        YksikönPäällikkö päällikkö = new YksikönPäällikkö();
        ToimitusJohtaja johtaja = new ToimitusJohtaja();
               
        lähiEsimies.asetaSeuraava(päällikkö);
        päällikkö.asetaSeuraava(johtaja);
            
        lähiEsimies.hoidaPyyntö(pyyntö);
        lähiEsimies.hoidaPyyntö(sPyyntö);
        lähiEsimies.hoidaPyyntö(aPyyntö);
        
    }
}
