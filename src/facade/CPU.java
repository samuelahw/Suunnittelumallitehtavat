
package facade;

public class CPU {
    public void freeze() { 
        System.out.println("CPU paikallaan");
    }
    public void jump(long position) { 
        System.out.println("Hyppää paikkaan " + position);
    }
    public void execute() {
        System.out.println("CPU suorita");
    }
}
