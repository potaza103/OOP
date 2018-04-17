package oop;
import java.util.Scanner;
public class menu extends watch {
    
    casio casio = new casio();
    rado rado = new rado();
    omega omega = new omega();
    rolex rolex = new rolex();
    swatch swatch = new swatch();
    Scanner a = new Scanner(System.in);
    
    public void print() {       
        do{          
            System.out.println("========================================================");
            System.out.println("                 Welcome To Watch Store                 ");
            System.out.println("========================================================");           
            System.out.println("Enter Number 1 : Casio");
            System.out.println("Enter Number 2 : Omega");
            System.out.println("Enter Number 3 : Rolex");
            System.out.println("Enter Number 4 : Swatch");
            System.out.println("Enter Number 5 : Rado");         
            System.out.print("Please Enter to model you are interested in >>>>> ");
            numbermodel = a.nextInt();
        }while(numbermodel != 1&& numbermodel != 2&& numbermodel != 3&& numbermodel != 4&& numbermodel !=5 );
            System.out.println("");
            
        if(numbermodel==1){                 
            casio.show();
        }else if (numbermodel==2){
            omega.show();   
        }else if (numbermodel==3){             
            rolex.show(); 
        }else if (numbermodel==4){
            swatch.show();              
        }else if (numbermodel==5){          
            rado.show();
        }
           
        do{       
            System.out.println("Do you want Watch Store Enter 1");
            System.out.println("Do you want Check bill  Enter 2");
            System.out.print("Enter Number : >>>>>>>>>> ");            
            Scanner want1 = new Scanner(System.in);
            want = want1.nextInt();
            System.out.println("");           
        }while(want !=1 && want !=2);
            if(want == 1){                 
//                count++;
                allsum =allsum+sumprice;          
                print();         
            }
            else {  
                allsum = allsum+sumprice;
                System.out.println("==================== Bill ======================");
                all all = new all();
                all.print();
                System.out.println("...........Summary Price : "+allsum+"...........");
                System.out.println("================================================");
            }
    }
    public  void show(){}
  
}
    

