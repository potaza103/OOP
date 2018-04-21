package oop;
import java.util.Scanner;
public class omega extends watch implements gender,qualities {    
    
    public void show(){
        System.out.println("========================================================");
        System.out.println("                         Omega                          ");
        System.out.println("========================================================");
        print();
        //หลุดเเล้ว กลับไป class menu.show(){} บรรทัด 70
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
        //หลุดเเล้ว กลับไป show(){}
    }

    public void gender(){     
        if(sex == 1){
            MaleQualities();
            Msum(); 
            //หลุดเเล้ว กลับไป print(){}
        }
        else {
            FemaleQualities();
            Fsum(); 
            //หลุดเเล้ว กลับไป print(){}
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
            
            System.out.println();
          }while(Momega != 1 && Momega != 2);
         int i;
         do{
             i=0;
            System.out.print("How many do you want ? >>>>>>>>> ");
            Omegaamount = model.nextInt();
            
            System.out.println();
            if(Momega == 1){
                    if(Momegainven1 < Omegaamount ){
                        System.out.println("****************************");
                        System.out.println("   The goods was sold-out");
                        System.out.println("****************************");
                        System.out.println("");
                        i++;
                    }
            }
            if(Momega == 2){
                    if(Momegainven2 < Omegaamount){
                        System.out.println("****************************");
                        System.out.println("   The goods was sold-out");
                        System.out.println("****************************");
                        System.out.println("");
                        i++;
                    }
            }
         }while(i>0);
         //หลุดเเล้วกลับไป gender(){} ทำ Msum
    } 
   
   public void FemaleQualities(){
        Scanner model = new Scanner(System.in);
        do{
            System.out.println("Please select a model Female");
            System.out.println("Enter Number : 1 for "+omega1+" Price : "+FPomega1+" >>Inventory : " + Fomegainven1 );
            System.out.println("Enter Number : 2 for "+omega2+" Price : "+FPomega2+" >>Inventory : " + Fomegainven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");            
            Fomega = model.nextInt(); 
            
            System.out.println();
        }while(Fomega != 1 && Fomega != 2);
        int i;
        do{
            i=0;
            System.out.print("How many do you want ? >>>>>>>>> ");
            Omegaamount = model.nextInt();  
            
            System.out.println();
            if(Fomega == 1){
                    if(Fomegainven1 < Omegaamount ){
                        System.out.println("****************************");
                        System.out.println("   The goods was sold-out");
                        System.out.println("****************************");
                        System.out.println("");
                        i++;
                    }
            }
            if(Fomega == 2){
                    if(Fomegainven2 < Omegaamount){
                        System.out.println("****************************");
                        System.out.println("   The goods was sold-out");
                        System.out.println("****************************");
                        System.out.println("");
                        i++;
                    }
            }
        }while(i>0);
        //หลุดเเล้วกลับไป gender(){} ทำ Fsum
    }
   
   public void Msum(){          
            System.out.println("=============================== Show Detail ===============================");                      
            if(Momega == 1){           
            sumprice = MPomega1 * Omegaamount;
                System.out.println("Male "+omega1+" amount : "+Omegaamount+" Price : "+sumprice);
                Momegainven1 = Momegainven1-Omegaamount;
            }       
            else{           
            sumprice = MPomega2 * Omegaamount;
                System.out.println("Male "+omega2+" amount : "+Omegaamount+" Price : "+sumprice);
                Momegainven2 = Momegainven2-Omegaamount;
            }             
            System.out.println("===========================================================================");
            System.out.println();
            //หลุดเเล้วกลับไป gender(){}
        }
   
   public void Fsum(){
            System.out.println("=============================== Show Detail ==============================="); 
            if(Fomega == 1) {
            sumprice = FPomega1* Omegaamount;
                System.out.println("Female "+omega1+" amount : "+Omegaamount+" Price : "+sumprice);
                Fomegainven1 = Fomegainven1-Omegaamount;
            } 
            else{              
            sumprice = FPomega2 * Omegaamount;
                System.out.println("Female "+omega2+" amount : "+Omegaamount+" Price : "+sumprice); 
                Fomegainven2 = Fomegainven2-Omegaamount;
            } 
            System.out.println("===========================================================================");
            System.out.println(); 
            //หลุดเเล้วกลับไป gender(){}
   }

    public int getMomegainven1() {                  //เรียก
        return Momegainven1;
    }

    public void setMomegainven1(int Momegainven1) {     //กำหนด
        super.Momegainven1 = Momegainven1;
    }

    public int getFomegainven1() {
        return Fomegainven1;
    }

    public void setFomegainven1(int Fomegainven1) {
        super.Fomegainven1 = Fomegainven1;
    }

    public int getMomegainven2() {
        return Momegainven2;
    }

    public void setMomegainven2(int Momegainven2) {
        super.Momegainven2 = Momegainven2;
    }

    public int getFomegainven2() {
        return Fomegainven2;
    }

    public void setFomegainven2(int Fomegainven2) {
        super.Fomegainven2 = Fomegainven2;
    }
   
}
