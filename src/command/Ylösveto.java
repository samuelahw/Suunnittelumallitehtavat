
package command;

public class Ylösveto implements Command{
    Valkokangas kangas;
    
    public Ylösveto(Valkokangas v){
        kangas = v;
    }
    
    @Override
    public void execute() {
        kangas.kangasYlos();
    }
    
}
