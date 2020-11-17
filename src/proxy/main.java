
package proxy;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
       public static void main(final String[] arguments) {
         
        Scanner scanner = new Scanner(System.in);
           
        ArrayList<Image> valokuvaKansio = new ArrayList<>();
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3");

        valokuvaKansio.add(image1);
        valokuvaKansio.add(image2);
        valokuvaKansio.add(image3);
        
        System.out.println("Kuvien nimet käydään läpi:\n");
        for(Image i : valokuvaKansio){
            i.showData();
        }
        
        System.out.println("\nKatsotaan kuvat ensimmäisen kerran\n");
        for(Image i : valokuvaKansio){
            i.displayImage();
        }
        
        System.out.println("\nKatsotaan kuvat toisen kerran\n");
        for(Image i : valokuvaKansio){
            i.displayImage();
        }

    }
}
