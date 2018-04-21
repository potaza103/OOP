package oop;
import java.util.Scanner;
public class rolex extends watch implements gender,qualities{ 
//public class rolex extends inventory  implements gender,qualities{
    
    public void show(){
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
            System.out.println("Enter Number : 1 for "+rolex1+" Price: "+MProlex1+" >>Inventory " +Mrolexinven1 );
            System.out.println("Enter Number : 2 for "+rolex2+" Price: "+MProlex2+" >>Inventory " +Mrolexinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");           
            Mrolex = model.nextInt(); 
            
            System.out.println();
          }while(Mrolex != 1 && Mrolex != 2);
         int i;
         do{
             i=0;
            System.out.print("How many do you want ? >>>>>>>>> ");
            Rolexamount = model.nextInt();
            
            System.out.println();
            if(Mrolex == 1){
                    if(Mrolexinven1 < Rolexamount ){
                        System.out.println("****************************");
                        System.out.println("     Amount not enough");
                        System.out.println("****************************");
                        System.out.println(""); 
                        i++;
                    }
            }
            if(Mrolex == 2){
                    if(Mrolexinven2 < Rolexamount){
                        System.out.println("****************************");
                        System.out.println("     Amount not enough");
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
            System.out.println("Enter Number : 1 for "+rolex1+" Price : "+FProlex1+" >>Inventory : " +Frolexinven1 );
            System.out.println("Enter Number : 2 for "+rolex2+" Price : "+FProlex2+" >>Inventory : " +Frolexinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");            
            Frolex = model.nextInt();
            
            System.out.println();
        }while(Frolex != 1 && Frolex != 2);
        int i;
        do{
            i=0;
            System.out.print("How many do you want ? >>>>>>>>> ");
            Rolexamount = model.nextInt();
            System.out.println();
            
            if(Frolex == 1){
                    if(Frolexinven1 < Rolexamount ){
                        System.out.println("****************************");
                        System.out.println("     Amount not enough");
                        System.out.println("****************************");
                        System.out.println("");  
                        i++;
                    }
            }
            if(Frolex == 2){
                    if(Frolexinven2 < Rolexamount){
                        System.out.println("****************************");
                        System.out.println("     Amount not enough");
                        System.out.println("****************************");
                        System.out.println("");
                        i++;
                    }
            }
        }while(i>0);
        
    }
   
   public void Msum(){          
            System.out.println("=============================== Show Detail ===============================");                      
            if(Mrolex == 1){           
            sumprice = MProlex1 * Rolexamount;
                System.out.println("Male "+rolex1+" amount : "+Rolexamount+" Price : "+sumprice);
                Mrolexinven1 = Mrolexinven1-Rolexamount;
            }       
            else{           
            sumprice = MProlex2 * Rolexamount;
                System.out.println("Male "+rolex2+" amount : "+Rolexamount+" Price : "+sumprice);
                Mrolexinven2 = Mrolexinven2-Rolexamount;
            }             
            System.out.println("===========================================================================");
            System.out.println();  
        }
   public void Fsum(){
            System.out.println("=============================== Show Detail ===============================");
            if(Frolex == 1) {
            sumprice = FProlex1* Rolexamount;
                System.out.println("Female "+rolex1+" amount : "+Rolexamount+" Price : "+sumprice);
                Frolexinven1 = Frolexinven1-Rolexamount;
            } 
            else{              
            sumprice = FProlex2 * Rolexamount;
                System.out.println("Female "+rolex2+" amount : "+Rolexamount+" Price : "+sumprice);
                Frolexinven2 = Frolexinven2-Rolexamount;
            } 
            System.out.println("===========================================================================");
            System.out.println();    
   } 

    public int getMrolexinven1() {
        return Mrolexinven1;
    }

    public void setMrolexinven1(int Mrolexinven1) {
        super.Mrolexinven1 = Mrolexinven1;
    }

    public int getFrolexinven1() {
        return Frolexinven1;
    }

    public void setFrolexinven1(int Frolexinven1) {
        super.Frolexinven1 = Frolexinven1;
    }

    public int getMrolexinven2() {
        return Mrolexinven2;
    }

    public void setMrolexinven2(int Mrolexinven2) {
        super.Mrolexinven2 = Mrolexinven2;
    }

    public int getFrolexinven2() {
        return Frolexinven2;
    }

    public void setFrolexinven2(int Frolexinven2) {
        super.Frolexinven2 = Frolexinven2;
    }
   
}
