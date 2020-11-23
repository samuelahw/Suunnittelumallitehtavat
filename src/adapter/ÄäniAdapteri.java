
package adapter;

public class ÄäniAdapteri implements Äänite{

    private Video video;
    
    public ÄäniAdapteri(Video v){
        this.video = v;
    }
    
    @Override
    public void soitaÄänite() {
        video.soitaÄäniraita();
    }
    
}
