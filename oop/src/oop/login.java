package oop;
import java.util.ArrayList;
import java.util.Scanner;
public class login { 
    //loginemployee
    int count = 3;
    private String UsernameLog;
    private String PasswordLog;
    private String UsernameEmp;
    private String PasswordEmp;
    //logincustomer 
    private String UsernameCus;
    private String PasswordCus;
    private String UsernameCusStr;
    private String PasswordCusStr;
    private String UsernameLogCus;
    private String PasswordLogCus;       
    private String UsernameLogCus1 = "Aom";
    private String PasswordLogCus1 = "1234";
    private String UsernameLogCus2 = "pota";
    private String PasswordLogCus2 = "1234";
    
    login(){
        for(int i = 1 ; i <=65 ; i++)
        System.out.print("=");           
    }
    
    login(String UsernameEmp,String PasswordEmp){   
        this();
        this.UsernameEmp = UsernameEmp;    //ฟิกค่าตรง class watchlog บรรทัด40
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
            System.out.println();
                if(!(UsernameEmp.equals(UsernameLog)&&PasswordEmp.equals(PasswordLog))&&count!=0){
                    System.out.println();
                    System.out.println("Password is incorrect, system will shutdown if it is wrong "+count+" times.");
                    count--;
                }
                else if(!(UsernameEmp.equals(UsernameLog)&&PasswordEmp.equals(PasswordLog))||count==-1){               
                    System.out.println("====================================================");
                    System.out.println("  You locked more than 3 times the system shutdown  ");
                    System.out.println("    ===========================================     ");
                    System.exit(0);                 
                }
        }while(!(UsernameEmp.equals(UsernameLog)&&PasswordEmp.equals(PasswordLog))&&count!=-1);       
    }
    
    public void logincustomer(){
        System.out.println("    ===========***************************===========");
        System.out.println("    ====================CUSTOMER=====================");
        System.out.println("    ===========***************************===========");
    }
    
    public void signupCus(){
        Scanner LoginCustomer = new Scanner(System.in);
        ArrayList log  = new  ArrayList();
        do {
            System.out.println("Please Signup");
            System.out.print("Username >>>>> ");
            UsernameCus = LoginCustomer.nextLine();
            log.add(UsernameCus);
            System.out.print("Password >>>>> ");
            PasswordCus = LoginCustomer.nextLine();
            log.add(PasswordCus);
            UsernameCusStr = (String)log.get(0); 
            PasswordCusStr = (String)log.get(1);
        } while (!(UsernameCus.equals(UsernameCusStr) && PasswordCus.equals(PasswordCusStr)));
    }
    
    public void signinCus(){
        Scanner LoginEmployee = new Scanner(System.in); 
        do{          
            System.out.println("Please signin");
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
