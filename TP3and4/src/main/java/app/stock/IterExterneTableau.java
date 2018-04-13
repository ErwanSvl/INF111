package app.stock;

import java.util.Iterator;
import java.util.NoSuchElementException;

import app.produit.Produit;

/**
 * IterExterneTableau
 */
public class IterExterneTableau implements Iterator<Produit> {

    private Produit[] content;
    private int size;
    int i = 0;

    public IterExterneTableau(Produit[] content, int size) {
        this.content = content;
        this.size = size;
    }

    public Produit next() {
        if (i >= size)
            throw new NoSuchElementException();
        return content[i++];
    }

    public boolean hasNext() {
        return i < size;
    }
}