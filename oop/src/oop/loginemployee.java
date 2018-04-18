package oop;
import java.util.Scanner;
public class loginemployee  {    
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
            if((UsernameEmp.equals(UsernameLog)&&PasswordEmp.equals(PasswordLog))){
                System.out.println("You not Employee");
                System.out.println("Prease login for assure");
                for(int i = 0 ; i >= 2 ; i ++){
                    do{
                        System.out.println("Please Login");
                        System.out.print("Username >>>>> ");
                        UsernameLog = LoginEmployee.nextLine();
                        System.out.print("Password >>>>> ");
                        PasswordLog = LoginEmployee.nextLine(); 
                    }while(!(UsernameEmp.equals(UsernameLog)&&PasswordEmp.equals(PasswordLog)));
                } 
            }
            
        }while(!(UsernameEmp.equals(UsernameLog)&&PasswordEmp.equals(PasswordLog))); 
    
        item item = new item();
        System.out.println("");
        item.show();
        login login = new login();
        login.loginstore();
    }
}
