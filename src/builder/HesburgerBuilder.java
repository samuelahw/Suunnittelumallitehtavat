
package builder;

public class HesburgerBuilder {
    private StringBuilder burger = new StringBuilder();
    
    public HesburgerBuilder(){

    } 
    
    public void luoBurgeri(){
        burger.append("Sämpylät, ");
        burger.append("Naudanlihapihvit, ");
        burger.append("Lehtisalaatti, ");
        burger.append("Hesburger Majoneesi, ");
        burger.append("Cheddarjuusto");
    }
    
    public StringBuilder getBurger(){   
        return burger;
    }
}
