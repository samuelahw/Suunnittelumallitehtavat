
package abstractfactory;

public class Lippis {
    private String merkki;
    
    public Lippis(String mer){
        merkki = mer;
    }
    @Override
    public String toString(){
        return "Tyylikäs tämä " + merkki + " merkkinen lippis";
    }
}
