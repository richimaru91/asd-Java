package Liste.Vettore;

import java.util.Vector;

/**
 * Created by daniele on 07/07/16.
 */

public class Lista<T>{
    /**
     *  Numero di elementi massimo che compongono la lista
     */
    static final int MAX_ELEM = 100; //numero massimo di elementi

    /**
     * Vettore di celle di tipo Tipoeleme(generco) che comporranno la nostra lista
     */
    Vector<Cella<T>> elem;

    /**
     * Costruttore della classe Lista
     */
    public Lista(){
        creaLista();
    }

    /**
     *  Crea la lista ed inizializza il vettore della lista
     */
    public void creaLista(){
        elem = new Vector<>(MAX_ELEM);
    }


    /**
     * Metodo che controlla se la lista è vuota o meno
     * @return true se il vettore è vuoto, false altrimenti
     */
    public boolean listaVuota(){
        return elem.isEmpty();
    }


    /**
     *
     * Metodo che consente l'inserimento di nuovi elementi nella lista
     *
     * @param pos Intero che indica la posizione in cui andare ad inserire l'elemento nella lista
     * @param el Elemento di tipo T(generico) che andremo ad inserire nella lista
     *
     *
     */
    public void inisLista(int pos,T el){
        if(pos < MAX_ELEM && pos > -1) {
            Cella<T> tmp = new Cella();
            tmp.insCella(el);
            elem.add(pos, tmp);
        } else if(pos == -1){
            System.out.println("E' finito lo spazio");
        }
    }


    /**
     * Metodo che ritorna la posizione del primo elemento della lista
     * @return 0
     */
    public int primoLista(){
        return 0;
    }


    /**
     * Metodo che controlla se l'elemento in pos(i) e l'ultimo elemento della lista
     * @param pos posizione dell'elemento da controllare
     * @return true se è l'ultimo elemento della lista o se pos è uguale a -1, false altrimenti
     */
    public boolean fineLista(int pos){
        if(pos == elem.size()||pos == -1)
            return true;
        else
            return false;
    }

    /**
     * Metodo che restituisce la posizione successiva dell'elemento attuale
     * @param pos intero che indica la posizione attuale nella lista
     * @return pos(i)+1 se non sono alla fine della lista o se i != -1, -1 altrimenti
     */
    public int succLista(int pos){
        if(pos < MAX_ELEM && pos > -1) {
            return pos + 1;
        } else {
            return -1;
        }
    }

    /**
     * Metodo che restituisce la posizione dell'elemento precedente a quello attuale
     * @param pos intero che indica la posizione attuale nella lista
     * @return pos(i)-1
     */
    public int precLista(int pos){
        return pos-1;
    }

    /**
     * Metodo che consente l'eliminazione dell'elemento nella posizione pos(i) nella lista
     * @param pos intero che indica la posizione dell'elemento da eliminare
     */
    public void cancLista(int pos){
        elem.remove(pos);
    }

    /**
     * Metodo che consente la lettura del'elemento della lista nella poszione pos(i)
     * @param pos intero che indica la posizione attuale nella lista
     * @return T, dove T e l'elemento generico defimnito nella creazione della lista nella posizione pos(i)
     */
    public T leggiLista(int pos){
        return elem.elementAt(pos).getElem();
    }

    /**
     * Metodo che consente la modifica dell'elemento nella posizione pos(i)
     * @param pos intero che indica la posizione attuale nella lista
     * @param el elemento con il quale sovrascriveremo l'elemento nella posizione pos(i)
     */
    public void scriviLista(int pos,T el){
        Cella<T> cella = new Cella<T>();
        cella = elem.elementAt(pos);
        cella.insCella(el);
        elem.set(pos,cella);
    }


}
