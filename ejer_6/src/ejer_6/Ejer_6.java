/*
* Un almacen clasifica os seus productos según a seguinte táboa  de vendas anuais :
* Vendas anuais			artigo de consumo 
*< = 100 productos				baixo
* >100 e < = 500				medio
* > 500 e < = 100 				alto
* > 1000 					primeira necesidade
*   Coñecido o nome do artigo e as vendas anuais . Indicar de que tipo é
*/
package ejer_6;
/**
 *
 * @author andrea
 */
public class Ejer_6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vendas_an=550;
        Productos producto = new Productos(vendas_an);
        producto.compVendas(vendas_an);
        System.out.println(producto.toString());
    }
    
}
