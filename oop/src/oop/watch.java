package oop;
import java.util.Scanner;
public abstract class watch extends inventory {  
        
    static int Mcasio;   
    static int Fcasio;
    static int Momega;
    static int Fomega;
    static int Mrolex;
    static int Frolex;
    static int Mswatch;
    static int Fswatch;
    static int Mrado;
    static int Frado;
    static double allsum;
    static double sumprice;   
    static int amount;
//    int numbermodel;
    static int sex;
//    static int want;
    static int A,B,C;
    static int count=1;
    static String E;
    public void thank(){      
        System.out.println("   ======================= THANK YOU  ========================");      
    }
    public abstract void print();
}

