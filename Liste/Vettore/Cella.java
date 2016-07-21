package Liste.Vettore;

/**
 * Created by daniele on 07/07/16.
 */
public class Cella<T> {

    /**
     * Elemento Di tipo Tipoelem che sarà contenuto nella cella
     */
    T elem;

    /**
     * Costruttore della Cella
     */
    public Cella(){
        creaCella();
    }

    /**
     *  Crea ed inizializza la cella
     */
    public void creaCella(){
        elem = null;
    }

    /**
     * Metodo che controlla se la cella è vuota
     * @return return true se la cella è vuota, false altrimenti
     */
    public boolean Cellavota(){
        return elem == null;
    }

    /**
     * Metodo che consente l'inserimento dell'emnto all'interno della cella
     * @param ele Elemento di tipo Tipoelem che verrà scritto nella cella
     */
    public void insCella(T ele){
        elem = ele;
    }

    /**
     * Metodo che consente la cancelazione di una cella
     */
    public void cancCella(){
        elem = null;
    }

    /**
     * Metodo che restituisce l'elemento contenuto nella cella
     * @return elem = elemento contenuto nella cella
     */
    public T getElem(){
        return elem;
    }



}
