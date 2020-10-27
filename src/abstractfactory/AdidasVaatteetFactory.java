/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;


public class AdidasVaatteetFactory implements VaateFactory{

    public AdidasVaatteetFactory(){
        luoVaatteet();
    }
    
    private String merkki = "Adidas";
    private Lippis l;
    private Farmarit f;
    private Kengat k;
    private Tpaita p;
    
    @Override
    public void tulostaVaatteet() {
        System.out.println(l.toString() + " " + f.toString() + " " + k.toString() + " " + p.toString());
    }

    @Override
    public void luoVaatteet() {
        l = new Lippis(merkki);
        f = new Farmarit(merkki);
        k = new Kengat(merkki);
        p = new Tpaita(merkki);
    }
    
}
