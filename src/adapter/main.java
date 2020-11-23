
package adapter;

public class main {
    
    public static void main(String[] arg){
    Video video = new Musiikkivideo();
    Äänite musiikki = new Musiikkikappale();
    
    Äänite ääniAdapteri = new ÄäniAdapteri(video);

    Äänisoitin soitin = new Äänisoitin();
    soitin.soitaÄäntä(musiikki);
    soitin.soitaÄäntä(ääniAdapteri);
    
   
    }
    
}
