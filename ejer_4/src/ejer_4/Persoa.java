package ejer_4;
/**
 *
 * @author andrea
 **/
//Andrea
public class Persoa {
    private String nome;
    private int peso;
    private int difpeso;
 public Persoa (){
 }
 public Persoa (String nome,int peso){
    this.nome=nome;
    this.peso=peso;
 }
 public void setNome(String nom){
  nome=nom;
 }
 public void setPeso(int pes){
    peso=pes;
 }
 public String getNome(){
 return nome;
 }
 public int getPeso(){
 return  peso;
  }
 public int difPeso(Persoa p1,Persoa p2){
     int peso1=p1.getPeso();
     int peso2=p2.getPeso();
     if(peso1>peso2){
        difpeso=peso1-peso2;
        peso=peso1;
        nome=p1.getNome();
     }else{
        difpeso =peso2-peso1;
        peso=peso2;
        nome=p2.getNome();
     }
     return difpeso;
 }
    @Override
 public String toString(){
 return ("O nome é :"+nome+" e o seu peso é:"+peso+"\nA diferencia de peso entre"
         + " os dous é :"+difpeso);
 }
}
