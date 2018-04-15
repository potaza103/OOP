package oop;
import java.util.Scanner;
public class Project {    
    public static void main(String[] args) {  
        
        int round;
        System.out.println("========================================================"); 
        System.out.print("Enter Number of service >>>>>>>>>>>"); 
        Scanner r = new Scanner(System.in);
        round = r.nextInt();
        System.out.println("========================================================"); 
        
        for(int i = 1 ; i <= round ; i++){
            login login = new login();
            login.loginstore();
        }
        
    
    }
}
