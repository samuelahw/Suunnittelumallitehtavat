
package composite;

public class Prosessori implements Laiteosa{
    
    int hinta;
    
    public Prosessori(int h){
        this.hinta = h;
    }
    
    @Override
    public void addLaiteosa(Laiteosa osa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHinta() {
        return hinta;
    }
    
}
