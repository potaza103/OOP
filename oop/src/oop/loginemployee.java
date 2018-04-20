package oop;
import java.util.Scanner;
public class loginemployee  { 
    int count=3;
    static String UsernameLog ;
    static String PasswordLog ;
    private String UsernameEmp ;
    private String PasswordEmp ;
    
    loginemployee(){
        System.out.println("  ================+++++++++++++++++++++++++++===========");      
    }
    
    loginemployee(String UsernameEmp,String PasswordEmp){
        this();
        this.UsernameEmp = UsernameEmp;
        this.PasswordEmp = PasswordEmp;
    }
    
    public void loginemp(){
        System.out.println("    ===========***************************===========");
        System.out.println("    ====================EMPLOYEE=====================");
        System.out.println("    ===========***************************===========");
                                       
                do{
            Scanner LoginEmployee = new Scanner(System.in);
            System.out.println("Please Login");            
            System.out.print("Username >>>>> ");
            UsernameLog = LoginEmployee.nextLine();
            System.out.print("Password >>>>> ");
            PasswordLog = LoginEmployee.nextLine();
            if(!(UsernameEmp.equals(UsernameLog)&&PasswordEmp.equals(PasswordLog))&&count!=0){
            System.out.println();
            System.out.println("Password is incorrect, system will shutdown if it is wrong "+count+" times.");           
            count--;
            }
            else if(count==0){
            System.out.println();
            System.out.println("====================================================");
            System.out.println("  You locked more than 3 times the system shutdown");
            System.out.println("    ===========================================");
                 System.exit(0);              
            }
          }while(!(UsernameEmp.equals(UsernameLog)&&PasswordEmp.equals(PasswordLog)));              
        item item = new item();
        System.out.println("");
        item.show();
        login login = new login();
        login.loginstore();
    }
}
