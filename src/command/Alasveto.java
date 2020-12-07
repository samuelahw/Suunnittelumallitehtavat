
package command;

public class Alasveto implements Command{

    Valkokangas kangas;
    
    public Alasveto(Valkokangas v){
        kangas = v;
    }
    
    @Override
    public void execute() {
        kangas.kangasAlas();
    }
    
}
