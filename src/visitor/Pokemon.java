
package visitor;

public class Pokemon implements PokemonTila{
    
    private int pisteet = 0;
    private int bonukset = 0;
    private PokemonTila tila;
    private PokemonTila chari = new Charizard();
    private PokemonTila charma = new Charmander();
    private PokemonTila charme = new Charmeleon();
    
    
    public Pokemon(){
        
    }
    
    public void asetaTila(PokemonTila tila){
        this.tila = tila;
    }

    private void Taistele() {
        pisteet+=2;
    }
    

    private void Juokse() {
        pisteet--;
    }

    @Override
    public void kerroTila() {
        int toinen = (int) ( Math.random() * 2 + 1);
        if(toinen == 1){
            Taistele();
        } else {
            Juokse();
        }
        
        if(pisteet < 2){
            asetaTila(charma);
        }
        else if(pisteet > 4){
            asetaTila(chari);
        }
        else{
            asetaTila(charme);
        }
        System.out.println(pisteet);
        tila.kerroTila();
    }   

    @Override
    public void accept(BonusVisitorI visitor) {
        tila.accept(visitor);
    }

    @Override
    public void annaBonuksia(int i) {
        System.out.println("Sain bonuspisteitä: " + i);
    }
}
