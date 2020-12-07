
package facade;

public class HardDrive {
    
    
    public String read(long lba, int size) {   
        String data = "'Jotain dataa sektorilta " + lba + ", jonka koko on " + size + "'";
        return data;
    }
}
