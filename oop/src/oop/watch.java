package oop;
import java.util.Scanner;
public abstract class watch extends inventory {      
    static int Mcasio;   
    static int Fcasio;
    static int Momega;
    static int Fomega;
    static int Mrolex;
    static int Frolex;
    static int Mswatch;
    static int Fswatch;
    static int Mrado;
    static int Frado;
    static double allsum;
    static double sumprice;   
    static int amount;
    int numbermodel;
    static int sex;
    static int want;
    private String a;
    
    watch(){
        System.out.println("                 Welcome To Watch Store                 ");
    }
    
    public void loop(){
        do{       
            System.out.println("Do you want Watch Store Enter 1");
            System.out.println("Do you want Check bill  Enter 2");
            System.out.print("Enter Number : >>>>>>>>>> ");            
            Scanner want1 = new Scanner(System.in);
            want = want1.nextInt();
            System.out.println("");           
        }while(want !=1 && want !=2);   
        if(want == 1){           
            allsum =allsum+sumprice;          
            menu menu = new menu();
            menu.print();         
        }
        else {           
        allsum = allsum+sumprice;
        System.out.println("============================ Bill ================================");
        all all = new all();
        all.print();
        System.out.println(""+Mrado);
        System.out.println("...................Summary Price : "+allsum+".....................");
        System.out.println("==================================================================");   
    }
        
 }
     
    public abstract void print();

    
       
}

