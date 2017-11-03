/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_2;

/**
 *
 * @author acabezaslopez
 */
public class Condicional {
     public Condicional(){
  }
  public void condicion(short n1,short n2){
      short resta,suma;
       suma = (short) (n1+n2);
       resta = (short) (n1-n2);
      if(n1>=n2){
      System.out.println("A resta é :"+ resta);
       System.out.println("A suma é :"+ suma);
      }else{
      System.out.println("A suma é :"+ suma);
      
      }
  }
}
