package oop;
import java.util.Scanner;
public class menu extends watch {
    
    casio casio = new casio();
    rado rado = new rado();
    omega omega = new omega();
    rolex rolex = new rolex();
    swatch swatch = new swatch();
    Scanner a = new Scanner(System.in);
    int numbermodel ;
    
    menu (int Mcasioinven1,int Fcasioinven1 ,int Mcasioinven2,int Fcasioinven2 ,int Momegainven1,int Fomegainven1 ,int Momegainven2 ,int Fomegainven2 ,int Mrolexinven1 ,int Frolexinven1  ,int Mrolexinven2 ,int Frolexinven2  ,int Mswatchinven1 ,int Fswatchinven1 ,int Mswatchinven2 ,int Fswatchinven2 ,int Mradoinven1 ,int Fradoinven1,int Mradoinven2 ,int Fradoinven2 ){
        super.Mcasioinven1  = Mcasioinven1;        
        super.Fcasioinven1  = Fcasioinven1;
        super.Mcasioinven2  =  Mcasioinven2;
        super.Fcasioinven2  = Fcasioinven2;
        super.Momegainven1  = Momegainven1;
        super.Fomegainven1  = Fomegainven1;
        super.Momegainven2  = Momegainven2;
        super.Fomegainven2  = Fomegainven2;
        super.Mrolexinven1  = Mrolexinven1;
        super.Frolexinven1  = Frolexinven1;
        super.Mrolexinven2  = Mrolexinven2;
        super.Frolexinven2  = Frolexinven2;
        super.Mswatchinven1 = Mswatchinven1;
        super.Fswatchinven1 = Fswatchinven1;
        super.Mswatchinven2 = Mswatchinven2;
        super.Fswatchinven2 = Fswatchinven2;
        super.Mradoinven1   = Mradoinven1;
        super.Fradoinven1   = Fradoinven1;
        super.Mradoinven2   = Mradoinven2;
        super.Fradoinven2   = Fradoinven2;    
    } 
    
    public void show(){
    int want;
    do{
        do{ 
            System.out.println();
            System.out.println("========================================================");
            System.out.println("\t\t Welcome To Watch Store");
            System.out.println("========================================================");           
            System.out.println("Enter Number 1 : Casio");
            System.out.println("Enter Number 2 : Omega");
            System.out.println("Enter Number 3 : Rolex");
            System.out.println("Enter Number 4 : Swatch");
            System.out.println("Enter Number 5 : Rado");         
            System.out.print("Please Enter to model you are interested in >>>>> ");
            numbermodel = a.nextInt();
        }while(numbermodel != 1&& numbermodel != 2&& numbermodel != 3&& numbermodel != 4&& numbermodel !=5 );
            System.out.println();
          
            if (numbermodel==1){
                casio.setMcasioinven1(super.Mcasioinven1);
                casio.setMcasioinven2(super.Mcasioinven2);
                casio.setFcasioinven1(super.Fcasioinven1);
                casio.setFcasioinven2(super.Fcasioinven2);                        
                casio.show();  //ไปที่เมธอด show ของ casio
                super.Mcasioinven1 = casio.getMcasioinven1();
                super.Mcasioinven2 = casio.getMcasioinven2();
                super.Fcasioinven1 = casio.getFcasioinven1();
                super.Fcasioinven2 = casio.getFcasioinven2(); 
                           
            }else if (numbermodel==2){
                omega.setMomegainven1(super.Momegainven1);
                omega.setMomegainven2(super.Momegainven2);
                omega.setFomegainven1(super.Fomegainven1);
                omega.setFomegainven2(super.Fomegainven2);
                omega.show();  //ไปที่เมธอด show ของ omega
                super.Momegainven1=omega.getMomegainven1();
                super.Momegainven2=omega.getMomegainven2();
                super.Fomegainven1=omega.getFomegainven1();
                super.Fomegainven2=omega.getFomegainven2();
            
            }else if (numbermodel==3){ 
                rolex.setMrolexinven1(super.Mrolexinven1);
                rolex.setMrolexinven2(super.Mrolexinven2);
                rolex.setFrolexinven1(super.Frolexinven1);
                rolex.setFrolexinven2(super.Frolexinven2);
                rolex.show();  //ไปที่เมธอด show ของ rolex
                super.Mrolexinven1=rolex.getMrolexinven1();
                super.Mrolexinven2=rolex.getMrolexinven2();
                super.Frolexinven1=rolex.getFrolexinven1();
                super.Frolexinven2=rolex.getFrolexinven2();
            
            }else if (numbermodel==4){
                swatch.setMswatchinven1(super.Mswatchinven1);
                swatch.setMswatchinven2(super.Mswatchinven2);
                swatch.setFswatchinven1(super.Fswatchinven1);
                swatch.setFswatchinven2(super.Fswatchinven2);
                swatch.show();  //ไปที่เมธอด show ของ swatch 
                super.Mswatchinven1=swatch.getMswatchinven1();
                super.Mswatchinven2=swatch.getMswatchinven2();
                super.Fswatchinven1=swatch.getFswatchinven1();
                super.Fswatchinven2=swatch.getFswatchinven2();
            
            }else if (numbermodel==5){ 
                rado.setMradoinven1(super.Mradoinven1);
                rado.setMradoinven2(super.Mradoinven2);
                rado.setFradoinven1(super.Fradoinven1);
                rado.setFradoinven2(super.Fradoinven2);
                rado.show();  //ไปที่เมธอด show ของ rado
                super.Mradoinven1=rado.getMradoinven1();
                super.Mradoinven2=rado.getMradoinven2();
                super.Fradoinven1=rado.getFradoinven1();
                super.Fradoinven2=rado.getFradoinven2();
            }
            
        allsum = allsum + sumprice; 
        
        do{ 
            System.out.println("Do you want Watch Store Enter 1");
            System.out.println("Do you want Check bill  Enter 2");
            System.out.print("Enter Number : >>>>>>>>>> ");            
            Scanner want1 = new Scanner(System.in);
            want = want1.nextInt();
            System.out.println("");     
        }while(want !=1 && want !=2); 
        
    }while(want == 1); //วนไปที่ บรรทัด 38
        print();
    }
      
    public void print() { 
        System.out.println("============================ Bill ===============================");
        System.out.println("\t...........Summary Price : "+allsum+"...........");
        System.out.println("=================================================================");
        allsum = 0;  //เคลียราคา
        //เสร็จ กลับไปที่ class project 'main' บรรทัด 10
    }
    
    public int getFcasioinven1() {      //เรียก
        return Fcasioinven1;
    }

    public int getFcasioinven2() {
        return Fcasioinven2;
    }

    public int getFomegainven1() {
        return Fomegainven1;
    }

    public int getFomegainven2() {
        return Fomegainven2;
    }

    public int getFrolexinven1() {
        return Frolexinven1;
    }

    public int getFrolexinven2() {
        return Frolexinven2;
    }

    public int getFswatchinven1() {
        return Fswatchinven1;
    }

    public int getFswatchinven2() {
        return Fswatchinven2;
    }

    public int getFradoinven1() {
        return Fradoinven1;
    }

    public int getFradoinven2() {
        return Fradoinven2;
    }

    public int getMcasioinven1() {
        return Mcasioinven1;
    }

    public int getMcasioinven2() {
        return Mcasioinven2;
    }

    public int getMomegainven1() {
        return Momegainven1;
    }

    public int getMomegainven2() {
        return Momegainven2;
    }

    public int getMrolexinven1() {
        return Mrolexinven1;
    }

    public int getMrolexinven2() {
        return Mrolexinven2;
    }

    public int getMswatchinven1() {
        return Mswatchinven1;
    }

    public int getMswatchinven2() {
        return Mswatchinven2;
    }

    public int getMradoinven1() {
        return Mradoinven1;
    }

    public int getMradoinven2() {
        return Mradoinven2;
    }
    
    
}
    

