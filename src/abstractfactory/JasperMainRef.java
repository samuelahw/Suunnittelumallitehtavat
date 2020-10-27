
package abstractfactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;





public class JasperMainRef {
    
       public static void main(String[] args) {
        
           Class c = null;
           VaateFactory af = null;
           VaateFactory bf = null;
           
           Properties properties = new Properties();
           try{
               properties.load(
                       new FileInputStream("tehdas.properties"));
           } catch(IOException e) {
               e.printStackTrace();
           }
           try{
               c = Class.forName(properties.getProperty("addutehdas"));              
               af = (VaateFactory)c.getDeclaredConstructor().newInstance();
               c = Class.forName(properties.getProperty("bosstehdas"));
               bf = (VaateFactory)c.getDeclaredConstructor().newInstance();
           } catch(Exception e){
               e.printStackTrace();
           }
           af.tulostaVaatteet();
           System.out.println("Valmistuttuani menen Boss liikkeeseen!");
           bf.tulostaVaatteet();
            
    }
    
}
