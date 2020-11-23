
package builder;

import java.util.ArrayList;
import java.util.List;

public class McDonaldsBuilder {
    private List<Object> hampurilaisenOsat = new ArrayList();
    private Cheddarjuusto juusto;
    private JäävuoriSalaatti salaatti;
    private McDonaldsMajoneesi majoneesi;
    private Naudanlihapihvi pihvi;
    private Sämpylät sämpylä;
    
    public McDonaldsBuilder(){
        juusto = new Cheddarjuusto();
        salaatti = new JäävuoriSalaatti();
        majoneesi = new McDonaldsMajoneesi();
        pihvi = new Naudanlihapihvi();
        sämpylä = new Sämpylät();
    }
    
    public void luoBurgeri(){
        hampurilaisenOsat.add(juusto);
        hampurilaisenOsat.add(salaatti);
        hampurilaisenOsat.add(majoneesi);
        hampurilaisenOsat.add(pihvi);
        hampurilaisenOsat.add(sämpylä);
    }
    
    public List<Object> getBurger(){
        return hampurilaisenOsat;
    }
}
