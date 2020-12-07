
package command;

public class Seinäpainike {
    Command cmd;
    public Seinäpainike(Command cmd){
        this.cmd = cmd;
    }
    
    public void push(){
        cmd.execute();
    }
}
