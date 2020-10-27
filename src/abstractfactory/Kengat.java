/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
