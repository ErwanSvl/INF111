package app;

/**
 * Stock
 */
public abstract class Stock {
    protected int size;

    public abstract void add(Product p) throws ProductNull, StockFull;

    public abstract Product remove() throws StockEmpty;

    public abstract boolean remove(Product p) throws ProductNull;

    public boolean isEmpty() {
        return size == 0;
    }

    public abstract boolean isFull();

    public int getSize() {
        return size;
    }

    public String toString() {
        return "Taille du stock : " + size;
    }
}