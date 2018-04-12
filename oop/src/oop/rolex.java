package oop;
import java.util.Scanner;
public class rolex extends watch implements gender,qualities{    
    
    public void rolexshow(){
        System.out.println("========================================================");
        System.out.println("                         Rolex                          ");
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
     
    public void goods(){
        
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
            System.out.println("Enter Number : 1 for "+Mrolex1+" Price: "+MProlex1+" >>Inventory " + Mrolexinven1 );
            System.out.println("Enter Number : 2 for "+Mrolex2+" Price: "+MProlex2+" >>Inventory " + Mrolexinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");           
            Mrolex = model.nextInt(); 
            System.out.println("");
          }while(Mrolex != 1 && Mrolex != 2);  
            System.out.print("How many do you want ? >>>>>>>>> ");
            amount = model.nextInt();
            System.out.println("");
            Msum();
            super.loop();           
    }
    
   public void FemaleQualities(){
        Scanner model = new Scanner(System.in);
        do{
            System.out.println("Please select a model Female");
            System.out.println("Enter Number : 1 for "+Frolex1+" Price : "+FProlex1+" >>Inventory : " + Frolexinven1 );
            System.out.println("Enter Number : 2 for "+Frolex2+" Price : "+FProlex2+" >>Inventory : " + Frolexinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");            
            Frolex = model.nextInt(); 
            System.out.println("");
        }while(Frolex != 1 && Frolex != 2);
            System.out.print("How many do you want ? >>>>>>>>> ");
            amount = model.nextInt();  
            System.out.println("");
            Fsum();
            super.loop();                               
    }
   
   public void Msum(){          
            System.out.println("=============================== Show Detail ===============================");                      
            if(Mrolex == 1){           
            sumprice = MProlex1 * amount;
                System.out.println("Male "+Mrolex1+" amount : "+amount+" Price : "+sumprice);
                Mradoinven1 = Mradoinven1-amount;
            }       
            else{           
            sumprice = MProlex2 * amount;
                System.out.println("Male "+Mrolex2+" amount : "+amount+" Price : "+sumprice);
                Mradoinven2 = Mradoinven2-amount;
            }             
            System.out.println("===========================================================================");
            System.out.println("");                   
        }
   public void Fsum(){
            System.out.println("=============================== Show Detail ===============================");
            if(Frolex == 1) {
            sumprice = FProlex1* amount;
                System.out.println("Female "+Frolex1+" amount : "+amount+" Price : "+sumprice);
                Fradoinven1 = Fradoinven1-amount;
            } 
            else{              
            sumprice = FProlex2 * amount;
                System.out.println("Female "+Frolex2+" amount : "+amount+" Price : "+sumprice);
                Fradoinven2 = Fradoinven2-amount;
            } 
            System.out.println("===========================================================================");
            System.out.println("");                   
   }   
}
