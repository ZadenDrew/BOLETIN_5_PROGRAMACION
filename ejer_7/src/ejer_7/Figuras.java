package ejer_7;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;
import static java.lang.Math.sqrt;

/**
 *
 * @author andrea
 */
public class Figuras {
    static final double PI=3.14;
    private int superficie;
    public Figuras(){
    }
    public int cuadrado(int b,int l){
        superficie=(b*2)+(l*2);
    return superficie;
    }
    public int triangulo(int b,int l){
        double h=(b^2)+(l^2);
        double hipotenusa=sqrt(h);
        superficie=(int) (b+l+h);
    return superficie;
    }
    public int circulo(int r){
    return superficie= (int) (PI * (power(r,2)));
    }

}
