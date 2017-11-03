/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_1;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Ejer_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int num1;
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduce num1");
        num1 = ler.nextInt();
        Positivo pos=new Positivo();
        pos.positivo(num1);
    }
    
}
