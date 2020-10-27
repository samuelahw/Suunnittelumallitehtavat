package abstractfactory;

public class Farmarit {
    String merkki;
    
    public Farmarit(String mer){
        merkki = mer;
    }
    
    @Override
    public String toString(){
        return "Kyllä nämä " + merkki + " merkkiset farmarit ovat laadukkaat";
    }
    
}
