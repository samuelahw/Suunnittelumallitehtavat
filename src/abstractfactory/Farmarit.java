/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
