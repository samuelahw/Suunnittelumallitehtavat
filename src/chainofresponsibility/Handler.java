
package chainofresponsibility;

public abstract class Handler {
    private Handler seuraava;
    public Handler(Handler s){
        seuraava = s;
    }
    
    public void handle(){
        if(seuraava != null){
            seuraava.handle();
        }
    }
}
