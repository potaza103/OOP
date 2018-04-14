package oop;
import java.util.Scanner;
public class rado extends watch implements gender,qualities  {   
    
    public void radoshow(){
        System.out.println("========================================================");
        System.out.println("                          Rado                          ");
        System.out.println("========================================================");
        print();
        }
    
    public void print() {              
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
            System.out.println("Enter Number : 1 for "+rado1+" Price: "+MPrado1+" >>Inventory " + Mradoinven1 );
            System.out.println("Enter Number : 2 for "+rado2+" Price: "+MPrado2+" >>Inventory " + Mradoinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");           
            Mrado = model.nextInt(); 
            System.out.println("");
          }while(Mrado != 1 && Mrado != 2);  
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
            System.out.println("Enter Number : 1 for "+rado1+" Price : "+FPrado1+" >>Inventory : " + Fradoinven1 );
            System.out.println("Enter Number : 2 for "+rado2+" Price : "+FPrado2+" >>Inventory : " + Fradoinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");            
            Frado = model.nextInt(); 
            System.out.println("");
        }while(Frado != 1 && Frado != 2);
            System.out.print("How many do you want ? >>>>>>>>> ");
            amount = model.nextInt();  
            System.out.println("");
            Fsum();
            super.loop();                               
    }
   
   public void Msum(){
            Scanner show = new Scanner(System.in);
            System.out.println("=============================== Show Detail ===============================");                      
            if(Mrado == 1){           
            sumprice = MPrado1 * amount;
                System.out.println("Male "+rado1+" amount : "+amount+" Price : "+sumprice);
                
            }       
            else{           
            sumprice = MPrado2 * amount;
                System.out.println("Male "+rado2+" amount : "+amount+" Price : "+sumprice);              
            }           
            System.out.println("===========================================================================");
            System.out.println("");                   
        }
   public void Fsum(){
            System.out.println("=============================== Show Detail ===============================");
            if(Frado == 1) {
            sumprice = FPrado1* amount;
                System.out.println("Female "+rado1+" amount : "+amount+" Price : "+sumprice);              
            } 
            else{              
            sumprice = FPrado2 * amount;
                System.out.println("Female "+rado2+" amount : "+amount+" Price : "+sumprice);              
            } 
            System.out.println("===========================================================================");
            System.out.println("");                   
   }   
}
