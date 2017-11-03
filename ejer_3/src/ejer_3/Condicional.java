/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_3;

/**
 *
 * @author acabezaslopez
 */
public class Condicional {
    Condicional(){      
    }
    public void condanidado(int n1){
      if(n1>0){
      System.out.println("+");
      }else if(n1<0){
          System.out.println("-");
      }else{
          System.out.println("0");
      }
    }
}