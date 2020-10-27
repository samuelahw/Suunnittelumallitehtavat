
package abstractfactory;

public class Tpaita {
    private String merkki;
    
    public Tpaita(String mer){
        merkki = mer;
    }
    
    @Override
    public String toString(){
        return "Hyvin istuva tämä " + merkki + " merkkinen t-paita";
    }
}
