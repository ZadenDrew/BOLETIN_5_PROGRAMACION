package ejer_6;
/**
 *
 * @author andrea
 */
public class Productos {
    private int vendas_anuais;
    private String artigo_consumo;
    public Productos(){
    }
    public Productos(int vendas_anuais){
    this.vendas_anuais = vendas_anuais;
    }
    public void setArtigo_consumo(String artigo_consumo){
    this.artigo_consumo=artigo_consumo;
    }
    public int compVendas(int vendas){
        if(vendas<=100)
            setArtigo_consumo("baixo");
           if ((vendas>100)&&(vendas<500))
               setArtigo_consumo("medio");
               if((vendas>500)&&(vendas<=1000))
                   setArtigo_consumo("alto");
                    if(vendas>1000)
                        setArtigo_consumo("primeira necesidade");
        return vendas_anuais=vendas;
    }
    @Override
    public String toString(){
    return("Numero de vendas anuais :" + vendas_anuais +" artigo de consumo: " + artigo_consumo);
    }
}
