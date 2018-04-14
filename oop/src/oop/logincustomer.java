package oop;
import java.util.Scanner;
import java.util.ArrayList;
public class logincustomer {
    static String UsernameCus ;
    static String PasswordCus ;
    static String UsernameCusStr ;
    static String PasswordCusStr ;
    static String UsernameLogCus ;
    static String PasswordLogCus ;       
    private String UsernameLogCus1 = "Aom" ;
    private String PasswordLogCus1 = "1234" ;
    private String UsernameLogCus2 = "Pota" ;
    private String PasswordLogCus2 = "1234" ;
    static int member;
    
    logincustomer(){
        System.out.println("===========***************************===========");
        System.out.println("====================CUSTOMER=====================");
        System.out.println("===========***************************===========");
    }
    
        public void singinCus(){
        Scanner LoginCustomer = new Scanner(System.in);
        ArrayList log2  = new  ArrayList();
        
        do {
        
        System.out.println("Please Singin");
        System.out.print("Username >>>>> ");
        UsernameCus = LoginCustomer.nextLine();
        log2.add(UsernameCus);
        System.out.print("Password >>>>> ");
        PasswordCus = LoginCustomer.nextLine();
        log2.add(PasswordCus);
        UsernameCusStr = (String) log2.get(0); 
        PasswordCusStr = (String) log2.get(1);
        } while (!(UsernameCus.equals(UsernameCusStr) && PasswordCus.equals(PasswordCusStr)));
        
        }
    
    public void loginCus(){
        Scanner LoginEmployee = new Scanner(System.in);
        do{
        System.out.println("Please Login");
        System.out.print("Username >>>>> ");
        UsernameCus = LoginEmployee.nextLine();
        System.out.print("Password >>>>> ");
        PasswordCus= LoginEmployee.nextLine();
        } while (!(UsernameCus.equals(UsernameCusStr) && PasswordCus.equals(PasswordCusStr)));
    }
    
    public void loginFixCus(){
        Scanner LoginFixCustomer = new Scanner(System.in);
        do{
        System.out.println("Please Login");
        System.out.print("Username >>>>> ");
        UsernameLogCus = LoginFixCustomer.nextLine();
        System.out.print("Password >>>>> ");
        PasswordLogCus = LoginFixCustomer.nextLine();
        }while (!(UsernameLogCus1.equals(UsernameLogCus) && PasswordLogCus1.equals(PasswordLogCus))
             && !(UsernameLogCus2.equals(UsernameLogCus) && PasswordLogCus2.equals(PasswordLogCus)));
        
    }
}
