
package facade;

public class Memory {
    public void load(long position, String data) { 
        System.out.println("Ladataan paikalta " + position + " data: " + data);
    }
}
