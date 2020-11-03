
package singleton;

public class main {
    public static void main(String[] args) {
        Infotaulu taulu;
        taulu = Infotaulu.getInstance();
        System.out.println(taulu.getInfo());
    }
}
