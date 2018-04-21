package oop;
import java.util.Scanner;
public class Project {    
    public static void main(String[] args) {  
        
//        int round;
//        System.out.println("========================================================"); 
//        System.out.print("Enter Number of service >>>>>>>>>>> "); 
//        Scanner r = new Scanner(System.in);
//        round = r.nextInt();
//        System.out.println("========================================================"); 
//        
//        for(int i = 1 ; i <= round ; i++){
//            System.out.println("\n\n"); 
//            System.out.println("round >>>>>>>>>>>"+ i );
//            System.out.println(); 
//           
            char ex;
            do {
            watchlog watchlog = new watchlog();
            watchlog.loginstore();
                        Scanner put = new Scanner(System.in);
                        System.out.print("Do you want to Logout ? (Y/N) : ");               
                        String e = put.nextLine();
                        ex = e.toUpperCase().charAt(0);
            }while(ex == 'Y');
           
                //super.thank();
        }        
    }
//}    

