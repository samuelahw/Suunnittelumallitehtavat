
package composite;

public class main {
    public static void main(String[] args){
        Laiteosa prossu = new Prosessori(200);
        Laiteosa näyttis = new Näytönohjain(500);
        Laiteosa verkko = new Verkkokortti(50);
        Laiteosa muistit = new Muistipiiri(100);
        Laiteosa emo = new Emolevy(100);
        Laiteosa kotelo = new Kotelo(200);
        emo.addLaiteosa(prossu);
        emo.addLaiteosa(näyttis);
        emo.addLaiteosa(verkko);
        emo.addLaiteosa(muistit);
        kotelo.addLaiteosa(emo);
        System.out.println(emo.getHinta());
        System.out.println(kotelo.getHinta());
    }
}
