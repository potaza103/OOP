package oop;
import java.util.Scanner;
public class watchlog extends login {
    static int member;
    static int select;
    login login ;
    //    Casio
    int Mcasioinven1 ;
    int Fcasioinven1 ;
    int Mcasioinven2  ; 
    int Fcasioinven2 ;
//    Omega
    int Momegainven1 ;
    int Fomegainven1 ;
    int Momegainven2 ;
    int Fomegainven2 ;
//    Rolex
    int Mrolexinven1 ;
    int Frolexinven1 ;
    int Mrolexinven2 ;
    int Frolexinven2 ;
//    Swatch
    int Mswatchinven1 ;
    int Fswatchinven1 ;
    int Mswatchinven2 ;
    int Fswatchinven2 ;
//    Rado
    int Mradoinven1 ;
    int Fradoinven1;
    int Mradoinven2 ;
    int Fradoinven2 ;
    
    watchlog(){
        super();
        System.out.println();
        System.out.println("====================WELLCOME TO WATCH STORE===============");
        System.out.println("================The service is available online===========");
    }
    
    public void loginstore(){
        login = new login("admin","1234");      
        do{
            System.out.println("Please select your identity");
            System.out.println("Press 1 : Customer   ");
            System.out.println("Press 2 : Employee  ");
            System.out.print("Press Enter Number  >>>>> ");
            Scanner are_member = new Scanner(System.in);
            select = are_member.nextInt();
        }while (select != 1 && select != 2);
            System.out.println("");
        
            if(select == 1){
                login.logincustomer();
                do{
                    System.out.println("Are you a member");
                    System.out.println("Press 1 to login   ");
                    System.out.println("Press 2 to singup  ");
                    System.out.print("Press Enter Number  >>>>> ");
                    Scanner are_member = new Scanner(System.in);
                    member = are_member.nextInt();
                }while (member != 1 && member != 2);
               
                System.out.println("");
        
                    if(member ==1){
                        login.loginFixCus();
        
                    }else if(member ==2) {
                        login.signupCus();
                        System.out.println("********Again, to confirm yourself.*********");
                        login.loginCus();
                    }
                    menu menu = new menu( Mcasioinven1
    , Fcasioinven1 
    , Mcasioinven2   
    , Fcasioinven2 
    ,Momegainven1 
    ,Fomegainven1 
    , Momegainven2 
    , Fomegainven2 
    , Mrolexinven1 
    , Frolexinven1 
    , Mrolexinven2 
    , Frolexinven2 
    , Mswatchinven1 
    , Fswatchinven1 
    , Mswatchinven2 
    , Fswatchinven2 
    , Mradoinven1 
    ,Fradoinven1
    , Mradoinven2 
    , Fradoinven2 ); 
//                    menu.print();  
//    Casio
     Mcasioinven1 = menu.getMcasioinven1();  
     Fcasioinven1 = menu.getFcasioinven1();
     Mcasioinven2 = menu.getMcasioinven2();   
     Fcasioinven2 = menu.getFcasioinven2(); 
    
//    Omega
    Momegainven1 = menu.getMomegainven1();
     Fomegainven1 = menu.getFomegainven1();
     Momegainven2 = menu.getMomegainven2();
     Fomegainven2 = menu.getFomegainven2();
    
    
//    Rolex
     Mrolexinven1 = menu.getMrolexinven1();
    Frolexinven1 = menu.getFrolexinven1();
     Mrolexinven2 = menu.getMrolexinven2();
     Frolexinven2 = menu.getFrolexinven2();
    
    
//    Swatch
     Mswatchinven1 = menu.getMswatchinven1();
   Fswatchinven1 = menu.getFswatchinven1();
     Mswatchinven2 = menu.getMswatchinven2();
     Fswatchinven2 = menu.getFswatchinven2();
    
    
//    Rado
     Mradoinven1 = menu.getMradoinven1();
     Fradoinven1 = menu.getFradoinven1();
     Mradoinven2 = menu.getMradoinven2();
     Fradoinven2 = menu.getFradoinven2();
    
                System.out.println("******************************************************************"); 
        
            }else if(select == 2) { 
                login.loginemp();
                item item = new item( Mcasioinven1
    , Fcasioinven1 
    , Mcasioinven2   
    , Fcasioinven2 
    ,Momegainven1 
    ,Fomegainven1 
    , Momegainven2 
    , Fomegainven2 
    , Mrolexinven1 
    , Frolexinven1 
    , Mrolexinven2 
    , Frolexinven2 
    , Mswatchinven1 
    , Fswatchinven1 
    , Mswatchinven2 
    , Fswatchinven2 
    , Mradoinven1 
    ,Fradoinven1
    , Mradoinven2 
    , Fradoinven2 );
                System.out.println("");
                item.show();
       //    Casio
     Mcasioinven1 = item.getMcasioinven1();  
     Fcasioinven1 = item.getFcasioinven1();
     Mcasioinven2 = item.getMcasioinven2();   
     Fcasioinven2 = item.getFcasioinven2(); 
    
//    Omega
    Momegainven1 = item.getMomegainven1();
     Fomegainven1 = item.getFomegainven1();
     Momegainven2 = item.getMomegainven2();
     Fomegainven2 = item.getFomegainven2();
    
    
//    Rolex
     Mrolexinven1 = item.getMrolexinven1();
    Frolexinven1 = item.getFrolexinven1();
     Mrolexinven2 = item.getMrolexinven2();
     Frolexinven2 = item.getFrolexinven2();
    
    
//    Swatch
     Mswatchinven1 = item.getMswatchinven1();
       Fswatchinven1 = item.getFswatchinven1();
     Mswatchinven2 = item.getMswatchinven2();
     Fswatchinven2 = item.getFswatchinven2();
    
    
//    Rado
     Mradoinven1 = item.getMradoinven1();
     Fradoinven1 = item.getFradoinven1();
     Mradoinven2 = item.getMradoinven2();
     Fradoinven2 = item.getFradoinven2();
    
            }
    }
}