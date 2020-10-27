/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;


public class JasperMain {
    
        

    
    public static void main(String[] args) {
       
        VaatteetIf alku = new Vaatteet(new BossVaatteetFactory());
        VaatteetIf vf = new Vaatteet(new AdidasVaatteetFactory());
        vf.tulostus();
        System.out.println("Valmistuttuani menen Boss liikkeeseen");
        alku.tulostus();
        
    }
    
    
}
