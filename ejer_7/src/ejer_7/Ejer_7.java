/*
*Codifica un programa que, utilizando un menú de opcións, calcule a superficie 
* de distintas figuras . 
* O usuario premerá a opción desexada .Según esta o programa pediralle os datos
* precisos e, utilizando un switch…case visualizará o resultado .
* No caso de premer unha opción que non teña o menú visualizar unha mensaxe de
* “ opción incorrecta “.
* 1…. Cadrado
* 2…. Triangulo
* 3…. Circulo
 */
package ejer_7;

import java.util.Scanner;

/**
 *
 * @author andrea
 */
public class Ejer_7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu,lado,base,radio;
        Figuras fig = new Figuras();
        System.out.println("Introduzca su opción : \n1) Cuadrado \n4) Triángulo \n3) Círculo");
        Scanner sc = new Scanner(System.in);
        menu=sc.nextInt();
        switch(menu){
             case 1:
                  System.out.println("Introduce valor de lado1 :");
                  base=sc.nextInt();
                  System.out.println("Introduce valor de lado2 :");
                  lado=sc.nextInt();
                  System.out.println(fig.cuadrado(base,lado));
                break;
            case 2:
                  System.out.println("Introduce el valor de la base :");
                  base=sc.nextInt();
                  System.out.println("Introduce valor de lado :");
                  lado=sc.nextInt();
                  System.out.println(fig.triangulo(base,lado));
                break;
            case 3:
                  System.out.println("Introduce el radio :");
                   radio=sc.nextInt();
                   System.out.println(fig.circulo(radio));
                 break;
     }
    }
    
}
