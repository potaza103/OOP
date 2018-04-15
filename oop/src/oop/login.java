package oop;
import java.util.Scanner;
public class login {
    static int member;
    static int select;
    
    login(){
        System.out.println("  ================+++++++++++++++++++++++++++===========");
        System.out.println("====================WELLCOME TO WATCH STORE===============");
       
    }
    
    public void loginstore(){
        loginemployee loginemployee = new loginemployee("admin","1234");      
        do{
            System.out.println("Please select your identity");
            System.out.println("Press 1 : Customer   ");
            System.out.println("Press 2 : Employee  ");
            System.out.print("Press Enter Number  >>>>> ");
            Scanner are_member = new Scanner(System.in);
            select = are_member.nextInt();
        }while (select != 1 && select != 2);
            System.out.println("--------------------------");
        
        if(select == 1){
            logincustomer logincustomer = new logincustomer();
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
                logincustomer.loginFixCus();
                menu menu = new menu(); 
                menu.print();                
            }else if(member ==2) {
                logincustomer.singinCus();
                System.out.println("********Again, to confirm yourself.*********");
                logincustomer.loginCus();
                menu menu = new menu(); 
                menu.print();  
            }
                System.out.println("******************************************************************"); 
        }else if(select == 2){ 
                loginemployee.loginemp();
            }
    
}
}
