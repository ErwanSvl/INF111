package app;

/**
 * ArrayStock
 */
public class ArrayStock extends Stock {
    private Product[] content;

    public ArrayStock(int taille) {
        content = new Product[taille];
        size = 0;
    }

    @Override
    public void add(Product p) throws ProductNull, StockFull {
        if (p == null)
            throw new ProductNull();
        if (isFull())
            throw new StockFull();
        content[size++] = p;
    }

    @Override
    public Product remove() throws StockEmpty {
        if (isEmpty())
            throw new StockEmpty();
        Product temp = content[size - 1];
        content[--size] = null;
        return temp;
    }

    @Override
    public boolean remove(Product p) throws ProductNull {
        if (p == null)
            throw new ProductNull();
        if (isEmpty())
            return false;
        int i = 0;
        while (i < size && !p.equals(content[i])) {
            i++;
        }
        if (i < size) {
            content[i] = content[size - 1];
            content[--size] = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        return size == content.length;
    }

    @Override
    public String toString() {
        String stock = new String();
        stock = super.toString();
        for (int i = 0; i < size; i++) {
            stock += "\n - " + content[i];
        }
        return stock;
    }
}