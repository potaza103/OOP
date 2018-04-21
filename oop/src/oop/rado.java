package oop;
import java.util.Scanner;
public class rado extends watch implements gender,qualities  {   
//public class rado extends inventory  implements gender,qualities{
    
    public void show(){
        System.out.println("========================================================");
        System.out.println("                          Rado                          ");
        System.out.println("========================================================");
        print();
        //หลุดเเล้ว กลับไป class menu.show(){} บรรทัด 103
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
            System.out.println("Enter Number : 1 for "+rado1+" Price: "+MPrado1+" >>Inventory " + Mradoinven1 );
            System.out.println("Enter Number : 2 for "+rado2+" Price: "+MPrado2+" >>Inventory " + Mradoinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");           
            Mrado = model.nextInt(); 
            
            System.out.println();
        }while(Mrado != 1 && Mrado != 2);
        int i ;
        do{
            i=0;
            System.out.print("How many do you want ? >>>>>>>>> ");
            Radoamount = model.nextInt();
            
            System.out.println();
            if(Mrado == 1){
                    if(Mradoinven1 < Radoamount ){
                        System.out.println("****************************");
                        System.out.println("   The goods was sold-out");
                        System.out.println("****************************");
                        System.out.println("");
                        i++;
                    }
            }
            if(Mrado == 2){
                    if(Mradoinven2 < Radoamount){
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
            System.out.println("Enter Number : 1 for "+rado1+" Price : "+FPrado1+" >>Inventory : " + Fradoinven1 );
            System.out.println("Enter Number : 2 for "+rado2+" Price : "+FPrado2+" >>Inventory : " + Fradoinven2 );
            System.out.print("Enter Number model : >>>>>>>>>> ");            
            Frado = model.nextInt(); 
            
            System.out.println();
        }while(Frado != 1 && Frado != 2);
        int i;
        do{
            i=0;
            System.out.print("How many do you want ? >>>>>>>>> ");
            Radoamount = model.nextInt();  
            
            System.out.println();
            if(Frado == 1){
                    if(Fradoinven1 < Radoamount ){
                        System.out.println("****************************");
                        System.out.println("   The goods was sold-out");
                        System.out.println("****************************");
                        System.out.println("");
                        i++;
                    }
            }
            if(Frado == 2){
                    if(Fradoinven2 < Radoamount){
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
            //หลุดเเล้วกลับไป gender(){}
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
            //หลุดเเล้วกลับไป gender(){}
   } 

    public int getMradoinven1() {                   //เรียก 
        return Mradoinven1;
    }

    public void setMradoinven1(int Mradoinven1) {           //กำหนด
        super.Mradoinven1 = Mradoinven1;
    }

    public int getFradoinven1() {
        return Fradoinven1;
    }

    public void setFradoinven1(int Fradoinven1) {
        super.Fradoinven1 = Fradoinven1;
    }

    public int getMradoinven2() {
        return Mradoinven2;
    }

    public void setMradoinven2(int Mradoinven2) {
        super.Mradoinven2 = Mradoinven2;
    }

    public int getFradoinven2() {
        return Fradoinven2;
    }

    public void setFradoinven2(int Fradoinven2) {
        super.Fradoinven2 = Fradoinven2;
    }
   
}
