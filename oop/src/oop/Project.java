package oop;
import java.util.Scanner;

public class Project {
    static int member;
    static int select;
    
    public static void main(String[] args) {  
        
        logincustomer logincustomer = new logincustomer("admin","1234");      
        do{
            System.out.println("Please select your identity");
            System.out.println("Press 1 : employee   ");
            System.out.println("Press 2 : customer  ");
            System.out.print("Press Enter Number  >>>>> ");
            Scanner are_member = new Scanner(System.in);
            select = are_member.nextInt();
        }while (select != 1 && select != 2);
            System.out.println("--------------------------");
        
        if(select == 1){
            loginemployee loginemployee = new loginemployee();
            do{
                System.out.println("Are you a member");
                System.out.println("Press 1 to login   ");
                System.out.println("Press 2 to singin  ");
                System.out.print("Press Enter Number  >>>>> ");
                Scanner are_member = new Scanner(System.in);
                member = are_member.nextInt();
            }while (member != 1 && member != 2);
                System.out.println("--------------------------");
        
            if(member ==1){
                loginemployee.loginFixEmp();
                menu menu = new menu(); 
                menu.print();                
            }else if(member ==2) {
                loginemployee.singinEmp();
                System.out.println("********Again, to confirm yourself.*********");
                loginemployee.loginEmp();
                menu menu = new menu(); 
                menu.print();  
            }
                System.out.println("******************************************************************"); 
        }else if(select == 2){
                logincustomer.logincus();
            }
    
    }
}
