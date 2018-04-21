package oop;
import java.util.Scanner;
public class Project {    
    public static void main(String[] args) {  
            watchlog watchlog = new watchlog();
            char exit;
            do {
                watchlog.loginstore();  
                
                Scanner put = new Scanner(System.in);
                System.out.print("Do you want to Logout (Y) or Do you want Exits (N) : ");               
                String e = put.nextLine();
                exit = e.toUpperCase().charAt(0);
                
                System.out.println();
                System.out.println("======================= THANK YOU =========================");
                System.out.println("   =====================================================");
                System.out.println("\n\n\n"); 
            }while(exit == 'Y'); 
        }        
    }   

