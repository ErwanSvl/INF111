package app;

import java.util.LinkedList;

/**
 * Ensemble
 */
public class Ensemble<E> extends LinkedList<E> {

    public boolean add(E elem) {
        if (this.contains(elem))
            return false;
        super.add(elem);
        return true;
    }

    public static void main(String[] args) {
        Aleatoire a = new Aleatoire(7);
        Ensemble<Integer> ensemble = new Ensemble<Integer>();
        for (int i = 0; i < 100; i++) {
            try {
                Integer myint = new Integer(a.unEntier(1, 2012));
                ensemble.add(myint);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}