package oop;
import java.util.Scanner;
//import  java.util.ArrayList;
public class logincustomer {    
    static String UsernameLog ;
    static String PasswordLog ;
    private String UsernameCus ;
    private String PasswordCus ;
    
    logincustomer(String UsernameCus,String PasswordCus){
        this();
        this.UsernameCus = UsernameCus;
        this.PasswordCus = PasswordCus;
    }
    logincustomer(){         
        System.out.println("===========+++++++++++++++++++++++++++===========");
        System.out.println("==============WELLCOME TO WATCH STORE============");
        System.out.println("===========+++++++++++++++++++++++++++===========");
    }
    public void logincus(){
//        ArrayList log  = new  ArrayList();
        System.out.println("===========***************************===========");
        System.out.println("====================CUSTOMER=====================");
        System.out.println("===========***************************===========");
    do{
        Scanner LoginCustomer = new Scanner(System.in);
        System.out.println("Please Login");
        System.out.print("Username >>>>> ");
        UsernameLog = LoginCustomer.nextLine();
//        log.add(UsernameLog);
        System.out.print("Password >>>>> ");
        PasswordLog = LoginCustomer.nextLine();
//        log.add(PasswordLog);
        
//        System.out.println(log.size());
    }while(!(UsernameCus.equals(UsernameLog)&&PasswordCus.equals(PasswordLog)));   
        item item = new item();
        item.print();
    }
    
    
}
