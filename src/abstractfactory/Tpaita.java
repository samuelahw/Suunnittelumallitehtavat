/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
