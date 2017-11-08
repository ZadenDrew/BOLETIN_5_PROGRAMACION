package ejer_7;




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
        superficie=(b*l);
    return superficie;
    }
    public int triangulo(int b,int l){
        double h=(b*l)/2;
    return superficie;
    }
    public int circulo(int r){
    return superficie= (int) (PI * (Math.pow(r,2)));
    }

}
