
package composite;

import java.util.ArrayList;

public class Emolevy implements Laiteosa{

    int hinta;
    private final ArrayList<Laiteosa> childLaiteosat = new ArrayList<>();
    
    public Emolevy(int h){
        hinta = h;
    }
    
    @Override
    public int getHinta() {
        int loppu = 0;
        for(Laiteosa o : childLaiteosat){
            loppu+=o.getHinta();
        }
        return loppu+hinta;
    }

    @Override
    public void addLaiteosa(Laiteosa osa) {
        childLaiteosat.add(osa);
    }
    
}
