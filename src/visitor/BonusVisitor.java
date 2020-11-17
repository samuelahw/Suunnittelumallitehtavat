
package visitor;

public class BonusVisitor implements BonusVisitorI{

    @Override
    public void visit(Charizard chari) {
        chari.annaBonuksia(100);
    }

    @Override
    public void visit(Charmeleon charme) {
        charme.annaBonuksia(50);
    }

    @Override
    public void visit(Charmander charma) {
        charma.annaBonuksia(25);
    }
    
}
