
package oop;
import java.util.Scanner;
public  class item extends watch {
    int product ;
    Scanner inven = new Scanner(System.in);
    
    item (int Mcasioinven1,int Fcasioinven1 ,int Mcasioinven2   ,int Fcasioinven2  ,int Momegainven1,int Fomegainven1 ,int Momegainven2 ,int Fomegainven2  ,int Mrolexinven1 ,int Frolexinven1  ,int Mrolexinven2 ,int Frolexinven2 ,int Mswatchinven1  ,int Fswatchinven1  ,int Mswatchinven2  ,int Fswatchinven2  ,int Mradoinven1 ,int Fradoinven1,int Mradoinven2 ,int Fradoinven2 ){
        super.Mcasioinven1 = Mcasioinven1;
        super.Fcasioinven1 = Fcasioinven1;
        super.Mcasioinven2 = Mcasioinven2;
        super.Fcasioinven2 = Fcasioinven2;
        super.Momegainven1 = Momegainven1;
        super.Fomegainven1 = Fomegainven1;
        super.Momegainven2 = Momegainven2;
        super.Fomegainven2 = Fomegainven2;
        super.Mrolexinven1 = Mrolexinven1;
        super.Frolexinven1 = Frolexinven1;
        super.Mrolexinven2 = Mrolexinven2;
        super.Frolexinven2 = Frolexinven2;
        super.Mswatchinven1 = Mswatchinven1;
        super.Fswatchinven1 = Fswatchinven1;
        super.Mswatchinven2 = Mswatchinven2;
        super.Fswatchinven2 = Fswatchinven2;
        super.Mradoinven1 = Mradoinven1;
        super.Fradoinven1 = Fradoinven1;
        super.Mradoinven2 = Mradoinven2;
        super.Fradoinven2 = Fradoinven2;  
    }
    
    public void show() {
        System.out.println("    ===========***************************===========");
        System.out.println("    =================Inventory Status================");
        System.out.println("    ===========***************************===========");     
        System.out.println();
        System.out.println("Press 1 : Casio ");
        System.out.println("======================== Status ========================");
        System.out.println(""+casio1+" //Male: "+Mcasioinven1+" //Female: "+Fcasioinven1);
        System.out.println(""+casio2+" //Male: "+Mcasioinven2+" //Female: "+Fcasioinven2); 
        System.out.println("    =================================================");
        System.out.println();
        System.out.println("Press 2 : Omega ");
        System.out.println("======================== Status ========================");
        System.out.println(""+omega1+" //Male: "+Momegainven1+" //Female: "+Fomegainven1);
        System.out.println(""+omega2+" //Male: "+Momegainven2+" //Female: "+Fomegainven2);
        System.out.println("    =================================================");
        System.out.println();
        System.out.println("Press 3 : Rolex ");
        System.out.println("======================== Status ========================");
        System.out.println(""+rolex1+" //Male: "+Mrolexinven1+" //Female: "+Frolexinven1);
        System.out.println(""+rolex2+" //Male: "+Mrolexinven2+" //Female: "+Frolexinven2);
        System.out.println("    =================================================");
        System.out.println();
        System.out.println("Press 4 : Swatch ");
        System.out.println("======================== Status ========================");
        System.out.println(""+swatch1+" //Male: "+Mswatchinven1+" //Female: "+Fswatchinven1);
        System.out.println(""+swatch2+" //Male: "+Mswatchinven2+" //Female: "+Fswatchinven2);
        System.out.println("    =================================================");
        System.out.println();
        System.out.println("Press 5 : Rado ");
        System.out.println("======================== Status ========================");
        System.out.println(""+rado1+" //Male: "+Mradoinven1+" //Female: "+Fradoinven1);
        System.out.println(""+rado2+" //Male: "+Mradoinven2+" //Female: "+Fradoinven2);
        System.out.println("    ================================================="); 
        System.out.print("\n Please select Product you want to add : ");  
        product = inven.nextInt();
        print();       
    }
    
    public void print(){       
        do{
            if(product == 1){
                System.out.println(); 
                System.out.println("======================== Casio ========================");
                System.out.println(""+casio1+" //Male: "+Mcasioinven1+" //Female: "+Fcasioinven1);
                System.out.println(""+casio2+" //Male: "+Mcasioinven2+" //Female: "+Fcasioinven2); 
                System.out.println("    ==============================================");
                System.out.println();
                System.out.println("How many do you want to add ");
                System.out.print(""+casio1+" Add Male : ");
                int mcasio1 = inven.nextInt();
                Mcasioinven1 = Mcasioinven1+mcasio1;
                System.out.print(""+casio1+" Add Female : ");
                int fcasio1 = inven.nextInt();
                Fcasioinven1 = Fcasioinven1+fcasio1;
                System.out.print(""+casio2+" Add Male : ");
                int mcasio2 = inven.nextInt();
                Mcasioinven2 = Mcasioinven2+mcasio2;
                System.out.print(""+casio2+" Add Female : ");
                int fcasio2 = inven.nextInt();
                Fcasioinven2 = Fcasioinven2+fcasio2;
                System.out.println("");
                System.out.println("====================== Now Status =====================");
                System.out.println(""+casio1+" //Male: "+Mcasioinven1+" //Female: "+Fcasioinven1);
                System.out.println(""+casio2+" //Male: "+Mcasioinven2+" //Female: "+Fcasioinven2); 
                System.out.println("=======================================================");   
            }
            else if(product == 2){
                System.out.println("\n");
                System.out.println("======================== Omega ========================");
                System.out.println(""+omega1+" //Male: "+Momegainven1+" //Female: "+Fomegainven1);
                System.out.println(""+omega2+" //Male: "+Momegainven2+" //Female: "+Fomegainven2);
                System.out.println("    ===============================================");
                System.out.println("How many do you want to add ");
                System.out.print(""+omega1+" Add Male : ");
                int momega1 = inven.nextInt();
                Momegainven1 = Momegainven1+momega1;
                System.out.print(""+omega1+" Add Female : ");
                int fomega1 = inven.nextInt();
                Fomegainven1 = Fomegainven1+fomega1;
                System.out.print(""+omega2+" Add Male : ");
                int momega2 = inven.nextInt();
                Momegainven2 = Momegainven2+momega2;
                System.out.print(""+omega2+" Add Female : ");
                int fomega2 = inven.nextInt();
                Fomegainven2 = Fomegainven2+fomega2;
                System.out.println();
                System.out.println("====================== Now Status =====================");
                System.out.println(""+omega1+" //Male: "+Momegainven1+" //Female: "+Fomegainven1);
                System.out.println(""+omega2+" //Male: "+Momegainven2+" //Female: "+Fomegainven2); 
                System.out.println("=======================================================");
            }
            else if(product == 3){
                System.out.println("\n");
                System.out.println("======================== Rolex ========================");
                System.out.println(""+rolex1+" //Male: "+Mrolexinven1+" //Female: "+Frolexinven1);
                System.out.println(""+rolex2+" //Male: "+Mrolexinven2+" //Female: "+Frolexinven2);
                System.out.println("    ================================================");
                System.out.println("How many do you want to add ");
                System.out.print(""+rolex1+" Add Male : ");
                int mrolex1 = inven.nextInt();
                Mrolexinven1 = Mrolexinven1+mrolex1;
                System.out.print(""+rolex1+" Add Female : ");
                int frolex1 = inven.nextInt();
                Frolexinven1 = Frolexinven1+frolex1;
                System.out.print(""+rolex2+" Add Male : ");
                int mrolex2 = inven.nextInt();
                Mrolexinven2 = Mrolexinven2+mrolex2;
                System.out.print(""+rolex2+" Add Female : ");
                int frolex2 = inven.nextInt();
                Frolexinven2 = Frolexinven2+frolex2;
                System.out.println();
                System.out.println("====================== Now Status =====================");
                System.out.println(""+rolex1+" //Male: "+Mrolexinven1+" //Female: "+Frolexinven1);
                System.out.println(""+rolex2+" //Male: "+Mrolexinven2+" //Female: "+Frolexinven2); 
                System.out.println("=======================================================");
            }
            else if(product == 4){
                System.out.println("\n");
                System.out.println("======================== Swatch ========================");
                System.out.println(""+swatch1+" //Male: "+Mswatchinven1+" //Female: "+Fswatchinven1);
                System.out.println(""+swatch2+" //Male: "+Mswatchinven2+" //Female: "+Fswatchinven2);
                System.out.println("    ===============================================");
                System.out.println("How many do you want to add ");
                System.out.print(""+swatch1+" Add Male : ");
                int mswatch1 = inven.nextInt();
                Mswatchinven1 = Mswatchinven1+mswatch1;
                System.out.print(""+swatch1+" Add Female : ");
                int fswatch1 = inven.nextInt();
                Fswatchinven1 = Fswatchinven1+fswatch1;
                System.out.print(""+swatch2+" Add Male : ");
                int mswatch2 = inven.nextInt();
                Mswatchinven2 = Mswatchinven2+mswatch2;
                System.out.print(""+swatch2+" Add Female : ");
                int fswatch2 = inven.nextInt();
                Fswatchinven2 = Fswatchinven2+fswatch2;
                System.out.println();
                System.out.println("====================== Now Status =====================");
                System.out.println(""+swatch1+" //Male: "+Mswatchinven1+" //Female: "+Fswatchinven1);
                System.out.println(""+swatch2+" //Male: "+Mswatchinven2+" //Female: "+Fswatchinven2); 
                System.out.println("=======================================================");          
            }
            else if(product == 5){
                System.out.println("\n");
                System.out.println("======================== Rado ========================");
                System.out.println(""+rado1+" //Male: "+Mradoinven1+" //Female: "+Fradoinven1);
                System.out.println(""+rado2+" //Male: "+Mradoinven2+" //Female: "+Fradoinven2);
                System.out.println("    ==============================================");
                System.out.println("How many do you want to add ");
                System.out.print(""+rado1+" Add Male : ");
                int mrado1 = inven.nextInt();
                Mradoinven1 = Mradoinven1+mrado1;
                System.out.print(""+rado1+" Add Female : ");
                int frado1 = inven.nextInt();
                Fradoinven1 = Fradoinven1+frado1;
                System.out.print(""+rado2+" Add Male : ");
                int mrado2 = inven.nextInt();
                Mradoinven2 = Mradoinven2+mrado2;
                System.out.print(""+rado2+" Add Female : ");
                int frado2 = inven.nextInt();
                Fradoinven2 = Fradoinven2+frado2;
                System.out.println();
                System.out.println("====================== Now Status ======================");
                System.out.println(""+rado1+" //Male: "+Mradoinven1+" //Female: "+Fradoinven1);
                System.out.println(""+rado2+" //Male: "+Mradoinven2+" //Female: "+Fradoinven2); 
                System.out.println("========================================================"); 
            }
        }while(product != 1 && product != 2 && product != 3 && product != 4 && product != 5);
        
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Do you want to add item(Y/N): ");
        String D = input.nextLine();
        
        while("Y".equals(D)||"y".equals(D)){
           System.out.println();
           show(); break;
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
