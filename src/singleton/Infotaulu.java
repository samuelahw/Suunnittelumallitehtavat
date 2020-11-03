
package singleton;

public final class Infotaulu {
    
    private static Infotaulu INSTANCE;
    private String info = "Sisällän tärkeää infoa";
    private Infotaulu() {}
    
    public static Infotaulu getInstance() {
        if (INSTANCE == null) INSTANCE = new Infotaulu();
            return INSTANCE;              
    }
    
    public String getInfo(){
        return info;
    }
}
