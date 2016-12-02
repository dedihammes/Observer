package observer;

/**
 *
 * @author note_dedi
 */
public class Principal {
    
    public static void main(String args []){
        Jornal j = new Jornal();
        Assinante u1 = new Assinante("Severino Linoz");
        j.addObserver(u1);
        Assinante u2 = new Assinante("Bete Correa");
        j.addObserver(u2);
        Assinante u3 = new Assinante("Felipe Jorginho");
        j.addObserver(u3);
        j.setNoticia("A nova era do FUMO");
        
        j.delObserver(u2);
        
        j.setNoticia("Afundou o Inter");
        
    }
}
