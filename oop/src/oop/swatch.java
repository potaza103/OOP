package oop;
import java.util.Scanner;
public class swatch extends watch  implements gender,qualities{
//public class swatch extends inventory  implements gender,qualities{
    
    public void show(){
        System.out.println("========================================================");
        System.out.println("                         Swatch                         ");
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
            System.out.println("Enter Number : 1 for "+swatch1+" Price: "+MPswatch1+" >>Inventory " + Mswatchinven1 );
            System.out.println("Enter Number : 2 for "+swatch2+" Price: "+MPswatch2+" >>Inventory " + Mswatchinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");           
            Mswatch = model.nextInt(); 
            
            System.out.println();
          }while(Mswatch != 1 && Mswatch != 2);
         int i;
         do{
             i=0;
            System.out.print("How many do you want ? >>>>>>>>> ");
            Swatchamount = model.nextInt();
            
            System.out.println("");
            if(Mswatch == 1){
                    if(Mswatchinven1 < Swatchamount ){
                        System.out.println("****************************");
                        System.out.println("   The goods was sold-out");
                        System.out.println("****************************");
                        System.out.println("");
                        i++;
                    }
            }
            if(Mswatch == 2){
                    if(Mswatchinven2 < Swatchamount){
                        System.out.println("****************************");
                        System.out.println("   The goods was sold-out");
                        System.out.println("****************************");
                        System.out.println("");
                        i++;
                    }
            }
         }while(i>0);
    }
    
   public void FemaleQualities(){
        Scanner model = new Scanner(System.in);
        do{
            System.out.println("Please select a model Female");
            System.out.println("Enter Number : 1 for "+swatch1+" Price : "+FPswatch1+" >>Inventory : " + Fswatchinven1 );
            System.out.println("Enter Number : 2 for "+swatch2+" Price : "+FPswatch2+" >>Inventory : " + Fswatchinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");            
            Fswatch = model.nextInt();
            System.out.println();
        }while(Fswatch != 1 && Fswatch != 2);
        int i;
        do{
            i=0;
            System.out.print("How many do you want ? >>>>>>>>> ");
            Swatchamount = model.nextInt();  
            System.out.println();
            if(Fswatch == 1){
                    if(Fswatchinven1 < Swatchamount ){
                        System.out.println("****************************");
                        System.out.println("   The goods was sold-out");
                        System.out.println("****************************");
                        System.out.println("");
                        i++;
                    }
            }
            if(Fswatch == 2){
                    if(Fswatchinven2 < Swatchamount){
                        System.out.println("****************************");
                        System.out.println("   The goods was sold-out");
                        System.out.println("****************************");
                        System.out.println("");
                        i++;
                    }
            }
        }while(i>0);
    }
   
   public void Msum(){          
            System.out.println("=============================== Show Detail ===============================");                      
            if(Mswatch == 1){           
            sumprice = MPswatch1 * Swatchamount;
                System.out.println("Male "+swatch1+" amount : "+Swatchamount+" Price : "+sumprice);
                Mswatchinven1 = Mswatchinven1-Swatchamount;
            }       
            else{           
            sumprice = MPswatch2 * Swatchamount;
                System.out.println("Male "+swatch2+" amount : "+Swatchamount+" Price : "+sumprice);
                Mswatchinven2 = Mswatchinven2-Swatchamount;
            }             
            System.out.println("===========================================================================");
            System.out.println(); 
        }
   public void Fsum(){
            System.out.println("============================== Show Detail ================================");
            if(Fswatch == 1) {
            sumprice = FPswatch1* Swatchamount;
                System.out.println("Female "+swatch1+" amount : "+Swatchamount+" Price : "+sumprice);
                Fswatchinven1 = Fswatchinven1-Swatchamount;
            } 
            else{              
            sumprice = FPswatch2 * Swatchamount;
                System.out.println("Female "+swatch2+" amount : "+Swatchamount+" Price : "+sumprice);
                Fswatchinven2 = Fswatchinven2-Swatchamount;
            } 
            System.out.println("===========================================================================");
            System.out.println();
   }     

    public int getMswatchinven1() {
        return Mswatchinven1;
    }

    public void setMswatchinven1(int Mswatchinven1) {
        super.Mswatchinven1 = Mswatchinven1;
    }

    public int getFswatchinven1() {
        return Fswatchinven1;
    }

    public void setFswatchinven1(int Fswatchinven1) {
        super.Fswatchinven1 = Fswatchinven1;
    }

    public int getMswatchinven2() {
        return Mswatchinven2;
    }

    public void setMswatchinven2(int Mswatchinven2) {
        super.Mswatchinven2 = Mswatchinven2;
    }

    public int getFswatchinven2() {
        return Fswatchinven2;
    }

    public void setFswatchinven2(int Fswatchinven2) {
        super.Fswatchinven2 = Fswatchinven2;
    }
   

}
