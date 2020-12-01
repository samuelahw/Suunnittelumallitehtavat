
package prototype;

public class Kello implements Cloneable {
   private MinuuttiViisari minuutit;
   private SekunttiViisari sekuntit;
   private TuntiViisari tunnit;
    
    public Kello(int t, int m, int s){
        minuutit = new MinuuttiViisari(m);
        tunnit = new TuntiViisari(t);
        sekuntit = new SekunttiViisari(s);
    }
    
    public void tick(){       
            sekuntit.lisaaSekuntti();
            if(sekuntit.getSekuntti() == 0){
                minuutit.lisaaMinuutti();
                if(minuutit.getMinuutti() == 0) tunnit.lisaaTunti();
            }
            System.out.println(tunnit.getTunti()+ ":" + minuutit.getMinuutti() + ":" + sekuntit.getSekuntti());
        
    }
    
    
   @Override
    public Kello clone(){
        Kello k = null;
        try{
            k = (Kello)super.clone();
            k.sekuntit = (SekunttiViisari)sekuntit.clone();
            k.tunnit = (TuntiViisari)tunnit.clone();
            k.minuutit = (MinuuttiViisari)minuutit.clone();
            
        } catch(CloneNotSupportedException e){}
        
        return k;
    }
    
    public void asetaTunti(int t){
        tunnit.setTunnit(t);
    }
    
    public void asetaMinuutti(int m){
        minuutit.setMinuutti(m);
    }
    
    public void asetaSekuntti(int s){
        sekuntit.setSekuntti(s);
    }
}
