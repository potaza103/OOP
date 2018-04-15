package oop;
import java.util.Scanner;
//import  java.util.ArrayList;
public class loginemployee  {    
    static String UsernameLog ;
    static String PasswordLog ;
    private String UsernameEmp ;
    private String PasswordEmp ;
    
    loginemployee(){         
        System.out.println("================The service is available online===========");
        System.out.println("  ================+++++++++++++++++++++++++++===========");
    }
    
    loginemployee(String UsernameEmp,String PasswordEmp){
        this();
        this.UsernameEmp = UsernameEmp;
        this.PasswordEmp = PasswordEmp;
    }
    
    public void loginemp(){
//        ArrayList log  = new  ArrayList();
        System.out.println("    ===========***************************===========");
        System.out.println("    ====================EMPLOYEE=====================");
        System.out.println("    ===========***************************===========");
    do{
        Scanner LoginEmployee = new Scanner(System.in);
        System.out.println("Please Login");
        System.out.print("Username >>>>> ");
        UsernameLog = LoginEmployee.nextLine();
//        log.add(UsernameLog);
        System.out.print("Password >>>>> ");
        PasswordLog = LoginEmployee.nextLine();
//        log.add(PasswordLog);
        
//        System.out.println(log.size());
    }while(!(UsernameEmp.equals(UsernameLog)&&PasswordEmp.equals(PasswordLog)));  
    
        item item = new item();
        System.out.println("");
        item.print();
        login login = new login();
        login.loginstore();
    }
    
    
}
