package oop;
import java.util.Scanner;
import java.util.ArrayList;
public class loginemployee {
    static String UsernameEmp ;
    static String PasswordEmp ;
    static String UsernameEmpStr ;
    static String PasswordEmpStr ;
    static String UsernameLogEmp ;
    static String PasswordLogEmp ;       
    static String UsernameLogEmp1 = "Aom" ;
    static String PasswordLogEmp1 = "1234" ;
    static String UsernameLogEmp2 = "Pota" ;
    static String PasswordLogEmp2 = "1234" ;
    static int member;
    
    loginemployee(){
        System.out.println("===========***************************===========");
        System.out.println("====================EMPLOYEE=====================");
        System.out.println("===========***************************===========");
    }
    
        public void singinEmp(){
        Scanner LoginEmployee = new Scanner(System.in);
        ArrayList log2  = new  ArrayList();
        
        do {
        
        System.out.println("Please Singin");
        System.out.print("Username >>>>> ");
        UsernameEmp = LoginEmployee.nextLine();
        log2.add(UsernameEmp);
        System.out.print("Password >>>>> ");
        PasswordEmp = LoginEmployee.nextLine();
        log2.add(PasswordEmp);
        UsernameEmpStr = (String) log2.get(0); 
        PasswordEmpStr = (String) log2.get(1);
        } while (!(UsernameEmp.equals(UsernameEmpStr) && PasswordEmp.equals(PasswordEmpStr)));
        
        }
    
    public void loginEmp(){
        Scanner LoginEmployee = new Scanner(System.in);
        do{
        System.out.println("Please Login");
        System.out.print("Username >>>>> ");
        UsernameEmp = LoginEmployee.nextLine();
        System.out.print("Password >>>>> ");
        PasswordEmp= LoginEmployee.nextLine();
        } while (!(UsernameEmp.equals(UsernameEmpStr) && PasswordEmp.equals(PasswordEmpStr)));
    }
    
    public void loginFixEmp(){
        Scanner LoginFixEmployee = new Scanner(System.in);
        do{
        System.out.println("Please Login");
        System.out.print("Username >>>>> ");
        UsernameLogEmp = LoginFixEmployee.nextLine();
        System.out.print("Password >>>>> ");
        PasswordLogEmp = LoginFixEmployee.nextLine();
        }while (!(UsernameLogEmp1.equals(UsernameLogEmp) && PasswordLogEmp1.equals(PasswordLogEmp))
             && !(UsernameLogEmp2.equals(UsernameLogEmp) && PasswordLogEmp2.equals(PasswordLogEmp)));
        
    }
}
