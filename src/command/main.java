
package command;

public class main {
    public static void main (String[] args){
        
        Valkokangas valkokangas = new Valkokangas();
        Command ylös = new Ylösveto(valkokangas);
        Command alas = new Alasveto(valkokangas);
        Seinäpainike nappi1 = new Seinäpainike(ylös);
        Seinäpainike nappi2 = new Seinäpainike(alas);
        
        nappi1.push();
        nappi2.push();
    }
}
