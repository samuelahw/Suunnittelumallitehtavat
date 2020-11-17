
package visitor;

public class Charmeleon implements PokemonTila{

    @Override
    public void kerroTila() {
        System.out.println("Olen nyt Charmeleon");
    }   

    @Override
    public void accept(BonusVisitorI visitor) {
        visitor.visit(this);
    }

    @Override
    public void annaBonuksia(int i) {
        System.out.println("Sain bonuspisteitä: " + i);
    }
}
