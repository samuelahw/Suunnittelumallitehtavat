
package factorymethodi;


public class Opiskelija extends AterioivaOtus {

    public Juoma createJuoma() {
        return new Kaakao();
    };

}
