
package observer;

public class Assinante implements Observer {
    private String nome;

    public Assinante(String nome) {
        this.nome = nome;
    }
    
    public void update(Object obj){
         System.out.println("Caro assinante " + this.nome + ", você recebeu seguinte noticia"
                 + " : " + (String)obj);
     }
}
