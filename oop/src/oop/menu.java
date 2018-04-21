package oop;
import java.util.Scanner;
public class menu extends watch {
    static int numbermodel ;
    casio casio = new casio();
    rado rado = new rado();
    omega omega = new omega();
    rolex rolex = new rolex();
    swatch swatch = new swatch();
    Scanner a = new Scanner(System.in);
//    char yes = 'y' ;
//    char yes1 = 'Y' ; 
    menu (int Mcasioinven1,int Fcasioinven1 ,int Mcasioinven2,int Fcasioinven2 ,int Momegainven1,int Fomegainven1 ,int Momegainven2 ,int Fomegainven2 ,int Mrolexinven1 ,int Frolexinven1  ,int Mrolexinven2 ,int Frolexinven2  ,int Mswatchinven1 ,int Fswatchinven1 ,int Mswatchinven2 ,int Fswatchinven2 ,int Mradoinven1 ,int Fradoinven1,int Mradoinven2 ,int Fradoinven2 ){
        this.Mcasioinven1 = Mcasioinven1;
        this.Fcasioinven1 = Fcasioinven1 ;
        this.Mcasioinven2 =  Mcasioinven2;
        this.Fcasioinven2 = Fcasioinven2;
        this.Momegainven1 = Momegainven1;
        this.Fomegainven1 = Fomegainven1;
        this.Momegainven2 = Momegainven2;
        this.Fomegainven2 = Fomegainven2;
        this.Mrolexinven1 = Mrolexinven1;
        this.Frolexinven1 = Frolexinven1;
        this.Mrolexinven2 = Mrolexinven2;
        this.Frolexinven2 = Frolexinven2;
        this.Mswatchinven1 = Mswatchinven1;
        this.Fswatchinven1 = Fswatchinven1;
        this.Mswatchinven2 = Mswatchinven2;
        this.Fswatchinven2 = Fswatchinven2;
        this.Mradoinven1 = Mradoinven1 ;
        this.Fradoinven1= Fradoinven1;
        this.Mradoinven2 = Mradoinven2;
        this.Fradoinven2= Fradoinven2 ;    
    }   
      public void show(){
        do{   
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
        if(numbermodel==1){   
            casio.show();
        }else if (numbermodel==2){
            omega.show();   
        }else if (numbermodel==3){             
            rolex.show(); 
        }else if (numbermodel==4){
            swatch.show();              
        }else if (numbermodel==5){          
            rado.show();
        }
        print();
    }
      
    public void print() {  
        int want;
        do{       
            System.out.println("Do you want Watch Store Enter 1");
            System.out.println("Do you want Check bill  Enter 2");
            System.out.print("Enter Number : >>>>>>>>>> ");            
            Scanner want1 = new Scanner(System.in);
            want = want1.nextInt();
            System.out.println("");           
        }while(want !=1 && want !=2);
            if(want == 1){                 
                allsum = allsum+sumprice;          
                show(); 
            }else {  
                allsum = allsum+sumprice;
                System.out.println("============================ Bill ===============================");
                all all = new all();
                all.print();
                System.out.println("\t...........Summary Price : "+allsum+"...........");
                System.out.println("=================================================================");
//                    do{
//                        Scanner put = new Scanner(System.in);
//                        System.out.print("Do you want to exit ? (Y/N)");               
//                        String E = put.nextLine();
//                        char e = E.charAt(0);
//                    }while(!(e.equals(yes)&& e.equals(yes1)));
                super.thank();
            }
    }
    public int getFcasioinven1() {
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
    

