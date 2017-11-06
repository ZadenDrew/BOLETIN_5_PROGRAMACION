/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_5;

/**
 *
 * @author andrea
 */
public class Maior {
    private int maior;
    private int num;
    public Maior(){
    }
    public int comparaNum(int n1,int n2,int n3){
        if((n1>n2)&&(n2>n3)){
            num=n1;
        }else if((n2>n1)&&(n2>n3)){
            num= n2;
        }else if((n3>n1)&&(n3>n2)){
            num= n3;
        }
        return num;
    }
    public int getMaior(){
    return maior;
    }
}
