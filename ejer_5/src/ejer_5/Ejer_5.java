/*
 * Dados 3 números que se supon distintos , indicar cal é o maior
 */
package ejer_5;

import java.util.Scanner;

/**
 *
 * @author andrea
 */
public class Ejer_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num1,num2,num3,maior;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el numero1 :");
        num1=sc.nextInt();
        System.out.println("Introduce el numero2 :");
        num2=sc.nextInt();
        System.out.println("Introduce el numero3 :");
        num3=sc.nextInt();
        Maior maior1=new Maior();
        System.out.println(maior1.comparaNum(num1,num2,num3));
    }
    
}
