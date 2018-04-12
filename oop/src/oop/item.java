
package oop;
import java.util.Scanner;
public class item extends watch {
   
    public void print() {
        System.out.println("===========***************************===========");
        System.out.println("====================Inventory====================");
        System.out.println("===========***************************===========");
        System.out.println("Please select Product you want to add.");
        System.out.println("Press 1 : Casio ");
        System.out.println("Press 2 : Omega ");
        System.out.println("Press 3 : Rolex ");
        System.out.println("Press 4 : Swatch ");
        System.out.println("Press 5 : Rado ");
        System.out.println("Press Enter Number >>>> ");
        Scanner inven = new Scanner(System.in);
        int product = inven.nextInt();
    }


    
    public void goods() {
        
    }
    
    
}
