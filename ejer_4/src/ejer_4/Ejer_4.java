/*
 * Coñecidos o nome e o peso de dúas persoas, queremos escribir os datos 
 * da que pesa máis e, a diferenza de peso entre elas .
 */
package ejer_4;
/**
 *
 * @author andrea
 */
//Andrea
public class Ejer_4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int persoas;
        Persoa persoa1 = new Persoa("Félix",62);
        Persoa persoa2 = new Persoa("Maria",58);
        Persoa per = new Persoa();
        per.difPeso(persoa1,persoa2);
       System.out.println(per.toString());    
        
    }
    
}
