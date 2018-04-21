package oop;
import java.util.Scanner;
public class casio extends watch implements gender,qualities {       
    
    public void show(){
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
        System.out.println();
        }while(sex !=1 && sex !=2);
        gender();             
    }
    
    public void gender(){     
        if(sex == 1){
            MaleQualities();
            Msum();  
        }
        else {
            FemaleQualities();
            Fsum(); 
        }             
    }
    
    public void MaleQualities(){
        Scanner model = new Scanner(System.in);            
         do{
            System.out.println("Please select a model Male");
            System.out.println("Enter Number : 1 for "+casio1+" Price : "+MPcasio1+" >>Inventory : "+Mcasioinven1 ); //รุ่น ราคา คลังสินค้า
            System.out.println("Enter Number : 2 for "+casio2+" Price : "+MPcasio2+" >>Inventory : "+Mcasioinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");           
            Mcasio = model.nextInt(); 
            System.out.println();          
        }while(Mcasio != 1 && Mcasio != 2); 
         int i;
            do{
                i=0;
            System.out.print("How many do you want ? >>>>>>>>> ");
            Casioamount = model.nextInt();          
            System.out.println();
            if(Mcasio == 1){
                    if(Mcasioinven1 < Casioamount){
                        System.out.println("****************************");
                        System.out.println("     Amount not enough");
                        System.out.println("****************************");
                        System.out.println();
                        i++;
                    }
            }  
            if(Mcasio == 2){
                    if(Mcasioinven2 < Casioamount){
                        System.out.println("****************************");
                        System.out.println("     Amount not enough");
                        System.out.println("****************************");
                        System.out.println();
                        i++;
                    }
                }
            }while(i>0);
    }
    
   public void FemaleQualities(){
        Scanner model = new Scanner(System.in);          
            do{                       
            System.out.println("Please select a model Female");
            System.out.println("Enter Number : 1 for "+casio1+" Price : "+FPcasio1+" >>Inventory : "+Fcasioinven1 );
            System.out.println("Enter Number : 2 for "+casio2+" Price : "+FPcasio2+" >>Inventory : "+Fcasioinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");            
            Fcasio = model.nextInt(); 
            System.out.println();                      
        }while(Fcasio != 1 && Fcasio != 2);
        int i;
          do{
            i=0;
            System.out.print("How many do you want ? >>>>>>>>> ");
            Casioamount = model.nextInt();          
            System.out.println();
            if(Fcasio == 1){
                    if(Fcasioinven1 < Casioamount){
                        System.out.println("****************************");
                        System.out.println("     Amount not enough");
                        System.out.println("****************************");
                        System.out.println("");
                        i++;
                    }
            }  
            if(Fcasio == 2){
                    if(Fcasioinven2 < Casioamount){
                        System.out.println("****************************");
                        System.out.println("     Amount not enough");
                        System.out.println("****************************");
                        System.out.println();
                        i++;
                    }
                }
            }while(i>0);                                       
    }       
    
    public void Msum(){          
            System.out.println("=============================== Show Detail ===============================");                      
            if(Mcasio == 1){            
                sumprice = MPcasio1 * Casioamount;                 
                System.out.println("Male "+casio1+" amount : "+Casioamount+" Price : "+sumprice);                
                Mcasioinven1 = Mcasioinven1 - Casioamount;
            }
            else{            
            sumprice = MPcasio2 * Casioamount;
                System.out.println("Male "+casio2+" amount : "+Casioamount+" Price : "+sumprice);
                Mcasioinven2 = Mcasioinven2 - Casioamount;
            }              
            System.out.println("===========================================================================");
            System.out.println("");
        }
    
    public void Fsum(){
            System.out.println("=============================== Show Detail ===============================");  
            if(Fcasio == 1) {           
            sumprice = FPcasio1 * Casioamount;
                System.out.println("Female "+casio1+" amount : "+Casioamount+" Price : "+sumprice);  
                Fcasioinven1 = Fcasioinven1 - Casioamount;
            } 
            else{              
            sumprice = FPcasio2 * Casioamount;
                System.out.println("Female "+casio2+" amount : "+Casioamount+" Price : "+sumprice);
                Fcasioinven2 = Fcasioinven2 - Casioamount;
            }
            System.out.println("===========================================================================");
            System.out.println();      
    }

    public int getMcasioinven1() {
        return Mcasioinven1;
    }

    public void setMcasioinven1(int Mcasioinven1) {
        super.Mcasioinven1 = Mcasioinven1;      
    }

    public int getFcasioinven1() {
        return Fcasioinven1;
    }

    public void setFcasioinven1(int Fcasioinven1) {
        super.Fcasioinven1 = Fcasioinven1;
    }

    public int getMcasioinven2() {
        return Mcasioinven2;
    }

    public void setMcasioinven2(int Mcasioinven2) {
        super.Mcasioinven2 = Mcasioinven2;
    }

    public int getFcasioinven2() {
        return Fcasioinven2;
    }

    public void setFcasioinven2(int Fcasioinven2) {
        super.Fcasioinven2 = Fcasioinven2;
    }
    
}
