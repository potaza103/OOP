package oop;
import java.util.Scanner;
public class casio extends watch implements gender,qualities {    
    
    
    public void casioshow(){
       System.out.println("========================================================");
       System.out.println("                         Casio                          ");
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
            System.out.println("Enter Number : 1 for "+Mcasio1+" Price : "+MPcasio1+" >>Inventory : "+Mcasioinven1 ); //รุ่น ราคา คลังสินค้า
            System.out.println("Enter Number : 2 for "+Mcasio2+" Price : "+MPcasio2+" >>Inventory : "+Mcasioinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");           
            Mcasio = model.nextInt(); 
            System.out.println("");          
        }while(Fcasio != 1 && Fcasio != 2);
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
            System.out.println("Enter Number : 1 for "+Fcasio1+" Price : "+FPcasio1+" >>Inventory : "+Fcasioinven1 );
            System.out.println("Enter Number : 2 for "+Fcasio2+" Price : "+FPcasio2+" >>Inventory : "+Fcasioinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");            
            Fcasio = model.nextInt(); 
            System.out.println("");                      
        }while(Fcasio != 1 && Fcasio != 2);
        System.out.print("How many do you want ? >>>>>>>>> ");
            amount = model.nextInt();  
            System.out.println("");
            Fsum();
            super.loop();                                
    }       
    
    public void Msum(){          
            System.out.println("=============================== Show Detail ===============================");                      
            if(Mcasio == 1){            
            sumprice = MPcasio1 * amount;
                System.out.println("Male "+Mcasio1+" amount : "+amount+" Price : "+sumprice);
                //Mcasioinven1 = Mcasioinven1-amount;
            }
            else{            
            sumprice = MPcasio2 * amount;
                System.out.println("Male "+Mcasio2+" amount : "+amount+" Price : "+sumprice);
               // Mcasioinven2 = Mcasioinven2-amount;
            }              
            System.out.println("===========================================================================");
            System.out.println("");
            
        }
    
    public void Fsum(){
            System.out.println("=============================== Show Detail ===============================");  
            if(Fcasio == 1) {           
            sumprice = FPcasio1 * amount;
                System.out.println("Female "+Fcasio1+" amount : "+amount+" Price : "+sumprice);               
                //Fcasioinven1 = Fcasioinven1-amount;
            } 
            else{              
            sumprice = FPcasio2 * amount;
                System.out.println("Female "+Fcasio2+" amount : "+amount+" Price : "+sumprice);
               // Fcasioinven2 = Fcasioinven2-amount;
            }
            System.out.println("===========================================================================");
            System.out.println(""); 
                   
    }
}
