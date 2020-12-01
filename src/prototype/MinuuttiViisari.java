
package prototype;

public class MinuuttiViisari implements Cloneable{
    private int minuutti;
    
    public MinuuttiViisari(int annettu){
        minuutti = annettu;
    }
    public int getMinuutti(){
        return minuutti;
    }
    
    public void lisaaMinuutti(){
        minuutti += 1;
        if(minuutti >= 60) minuutti = 0;
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
    
    public void setMinuutti(int m){
        minuutti = m;
    }
    
}
