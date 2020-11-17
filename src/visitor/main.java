
package visitor;

public class main {
    public static void main(String[] arg){
        
        BonusVisitorI visitor = new BonusVisitor();
        PokemonTila pokemon1 = new Pokemon();
        PokemonTila pokemon2 = new Pokemon();
        PokemonTila pokemon3 = new Pokemon();
        
        
        for(int i=0; i<5; i++){
            pokemon1.kerroTila();
        }
        
        System.out.println("ensimmäisen pokemonin bonukset");
        pokemon1.accept(visitor);
        
        for(int i=0; i<5; i++){
            pokemon2.kerroTila();
        }
        
        System.out.println("toisen pokemonin bonukset");
        pokemon2.accept(visitor);
        
        for(int i=0; i<5; i++){
            pokemon3.kerroTila();
        }
        
        System.out.println("kolmannen pokemonin bonukset");
        pokemon3.accept(visitor);
        
    }
}
