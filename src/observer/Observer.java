package observer;

/**
 *
 * @author note_dedi
 */
public interface Observer {
    
    /**
     * Metodo que faz a notificação e recebe atualizações;
     * @param obj 
     */
    public void update(Object obj);

}
