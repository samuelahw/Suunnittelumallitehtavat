
package templatemethod;

import java.util.Scanner;

public class Coinflip extends Game {
        private Scanner scanner = new Scanner(System.in);
        private int coin;
        private String choice;
        private boolean end = false;
        
     /* Implementation of necessary concrete methods */
        
     void initializeGame() {
         System.out.println("Lets do a coinflip!");
     }
 
     void makePlay(int player) {
         coin = (int) ( Math.random() * 2 + 1);
         System.out.println("Choose between\n 1. Heads\n 2. Tails");
         choice = scanner.nextLine();
         end = true; 
     }
 
     boolean endOfGame() {
         return end;
     }
 
     void printWinner() {
         if(coin == Integer.parseInt(choice)){
             System.out.println("You won!");
         } else {
             System.out.println("You lost");
         }
     }
 
     /* Specific declarations for the Monopoly game. */
 
     // ...
 
 }

    

