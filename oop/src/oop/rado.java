package oop;
import java.util.Scanner;
public class rado extends watch implements gender,qualities  {   
//public class rado extends inventory  implements gender,qualities{
    
    public void show(){
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
            System.out.println("Enter Number : 1 for "+rado1+" Price: "+MPrado1+" >>Inventory " + Mradoinven1 );
            System.out.println("Enter Number : 2 for "+rado2+" Price: "+MPrado2+" >>Inventory " + Mradoinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");           
            Mrado = model.nextInt(); 
            System.out.println("");
        }while(Mrado != 1 && Mrado != 2);  
            System.out.print("How many do you want ? >>>>>>>>> ");
            Radoamount = model.nextInt();
            System.out.println("");
            if(Mrado == 1){
                    if(Mradoinven1 < Radoamount ){
                        System.out.println("****************************");
                        System.out.println("     Amount not enough");
                        System.out.println("****************************");
                        System.out.println("");
                        print();
                    }
            }
            if(Mrado == 2){
                    if(Mradoinven2 < Radoamount){
                        System.out.println("****************************");
                        System.out.println("     Amount not enough");
                        System.out.println("****************************");
                        System.out.println("");
                        print();
                    }
            }            
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
            Radoamount = model.nextInt();  
            System.out.println("");
            if(Frado == 1){
                    if(Fradoinven1 < Radoamount ){
                        System.out.println("****************************");
                        System.out.println("     Amount not enough");
                        System.out.println("****************************");
                        System.out.println("");
                        print();
                    }
            }
            if(Frado == 2){
                    if(Fradoinven2 < Radoamount){
                        System.out.println("****************************");
                        System.out.println("     Amount not enough");
                        System.out.println("****************************");
                        System.out.println("");
                        print();
                    }
            }                               
    }
   
   public void Msum(){
            Scanner show = new Scanner(System.in);
            System.out.println("=============================== Show Detail ===============================");                      
            if(Mrado == 1){           
            sumprice = MPrado1 * Radoamount;
                System.out.println("Male "+rado1+" amount : "+Radoamount+" Price : "+sumprice);
            Mradoinven1 = Mradoinven1 - Radoamount;    
            }       
            else{           
            sumprice = MPrado2 * Radoamount;
                System.out.println("Male "+rado2+" amount : "+Radoamount+" Price : "+sumprice); 
            Mradoinven2 = Mradoinven2 - Radoamount;
            }           
            System.out.println("===========================================================================");
            System.out.println(); 
        }
   public void Fsum(){
            System.out.println("=============================== Show Detail ===============================");
            if(Frado == 1) {
            sumprice = FPrado1* Radoamount;
                System.out.println("Female "+rado1+" amount : "+Radoamount+" Price : "+sumprice);
            Fradoinven1 = Fradoinven1 - Radoamount;
            } 
            else{              
            sumprice = FPrado2 * Radoamount;
                System.out.println("Female "+rado2+" amount : "+Radoamount+" Price : "+sumprice);
            Fradoinven2 = Fradoinven2 - Radoamount;
            } 
            System.out.println("===========================================================================");
            System.out.println();
   }   
}
