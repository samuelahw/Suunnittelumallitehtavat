
package adapter;

public class Musiikkivideo implements Video{

    @Override
    public void näytäVideo() {
        System.out.println("Toistetaan musiikkivideon videota...");
    }

    @Override
    public void soitaÄäniraita() {
        System.out.println("Soitetaan musiikkivideon ääniraitaa...");
    }
    
}
