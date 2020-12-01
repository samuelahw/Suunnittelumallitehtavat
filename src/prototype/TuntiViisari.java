
package prototype;

public class TuntiViisari implements Cloneable {
    private int tunti;
    
    public TuntiViisari(int annettu){
        tunti = annettu;
    }
    public int getTunti(){
        return tunti;
    }
    
    public void lisaaTunti(){
        tunti += 1;
        if(tunti >= 24) tunti = 0;
    }
    
    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    public void setTunnit(int t){
        tunti = t;
    }
}
