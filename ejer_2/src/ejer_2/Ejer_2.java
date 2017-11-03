/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_2;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Ejer_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       short num1,num2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduce num1");
        num1 = ler.nextShort();
        System.out.println("Introduce num2");
        num2 = ler.nextShort();
        Condicional cond=new Condicional();
        cond.condicion(num1,num2);
    }
    
}
