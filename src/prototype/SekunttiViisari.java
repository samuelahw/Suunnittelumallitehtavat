
package prototype;

public class SekunttiViisari implements Cloneable{
    private int sekuntti;
    
    public SekunttiViisari(int annettu){
        sekuntti = annettu;
    }
    public int getSekuntti(){
        return sekuntti;
    }
    
        public void lisaaSekuntti(){
        sekuntti += 1;
        if(sekuntti >= 60) sekuntti = 0;
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
    
    public void setSekuntti(int s){
        sekuntti = s;
    }
    
}
