
package abstractfactory;

public class Kengat {
    private String merkki;
    
    public Kengat(String mer){
        merkki = mer;
    }
    @Override
    public String toString(){
        return "Hyvät kävellä nämä" + merkki + " merkkiset kengät";
    }
}
