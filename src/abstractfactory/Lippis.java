/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
