
package visitor;

public interface PokemonTila {
    public abstract void kerroTila();
    public abstract void annaBonuksia(int i);
    public abstract void accept(BonusVisitorI visitor);
}