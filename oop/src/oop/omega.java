package oop;
import java.util.Scanner;
public class omega extends watch implements gender,qualities {      
//public class omega extends inventory  implements gender,qualities{
    
    
    public void show(){
        System.out.println("========================================================");
        System.out.println("                         Omega                          ");
        System.out.println("========================================================");
        print();
        } 
    
    public void print(){               
        do{
        System.out.println("What products for gender?");
        System.out.println("Enter Number : 1 for Male");
        System.out.println("Enter Number : 2 for Female");
        System.out.print("Enter Number : >>>>>>>>>> ");
        Scanner gender = new Scanner(System.in);
        sex = gender.nextInt();
        System.out.println("");
        }while(sex !=1 && sex !=2);
        gender();             
    }

    public void gender(){ 
        if(sex == 1){
            MaleQualities();
        }
        else {
            FemaleQualities();
        }    
    }
    
    public void MaleQualities(){
        Scanner model = new Scanner(System.in);
         do{
            System.out.println("Please select a model Male");
            System.out.println("Enter Number : 1 for "+omega1+" Price: "+MPomega1+" >>Inventory " + Momegainven1 );
            System.out.println("Enter Number : 2 for "+omega2+" Price: "+MPomega2+" >>Inventory " + Momegainven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");           
            Momega = model.nextInt(); 
            System.out.println("");
          }while(Momega != 1 && Momega != 2);  
            System.out.print("How many do you want ? >>>>>>>>> ");
            amount = model.nextInt();
            System.out.println("");
            Msum();          
    }
    
   public void FemaleQualities(){
        Scanner model = new Scanner(System.in);
        do{
            System.out.println("Please select a model Female");
            System.out.println("Enter Number : 1 for "+omega1+" Price : "+FPomega1+" >>Inventory : " + Fomegainven1 );
            System.out.println("Enter Number : 2 for "+omega2+" Price : "+FPomega2+" >>Inventory : " + Fomegainven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");            
            Fomega = model.nextInt(); 
            System.out.println("");
        }while(Fomega != 1 && Fomega != 2);
            System.out.print("How many do you want ? >>>>>>>>> ");
            amount = model.nextInt();  
            System.out.println("");
            Fsum();                             
    }
   
   public void Msum(){          
            System.out.println("=============================== Show Detail ===============================");                      
            if(Momega == 1){           
            sumprice = MPomega1 * amount;
                System.out.println("Male "+omega1+" amount : "+amount+" Price : "+sumprice);
                Momegainven1 = Momegainven1-amount;
            }       
            else{           
            sumprice = MPomega2 * amount;
                System.out.println("Male "+omega2+" amount : "+amount+" Price : "+sumprice);
                Momegainven2 = Momegainven2-amount;
            }             
            System.out.println("===========================================================================");
            System.out.println("");                   
        }
   
   public void Fsum(){
            System.out.println("=============================== Show Detail ==============================="); 
            if(Fomega == 1) {
            sumprice = FPomega1* amount;
                System.out.println("Female "+omega1+" amount : "+amount+" Price : "+sumprice);
                Fomegainven1 = Fomegainven1-amount;
            } 
            else{              
            sumprice = FPomega2 * amount;
                System.out.println("Female "+omega2+" amount : "+amount+" Price : "+sumprice); 
                Fomegainven2 = Fomegainven2-amount;
            } 
            System.out.println("===========================================================================");
            System.out.println("");                   
   }
}
