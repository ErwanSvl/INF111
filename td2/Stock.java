/**
 * Stock
 */
public class Stock {

    private int size = 0;
    private Product[] content;

    public Stock(int size) {
        content = new Product[size];
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    public void add(Product product) {
        if (product != null && !isFull()) {
            content[size++] = product;
        }
    }

    public Product remove() {
        if (!isEmpty()) {
            Product temp = content[size - 1];
            content[--size] = null;
            return temp;
        }
        return null;
    }

    public boolean isEmpty() {
        return content.length == 0;
    }

    public boolean isFull() {
        return content.length == size;
    }

    @Override
    public String toString() {
        String stock = "La taille du stock est " + size;
        stock += "\nLe stock contient : ";
        for (int i = 0; i < size; i++) {
            stock += "\n - " + content[i];
        }
        return stock;
    }

    public static void main(String[] args) {
        Stock s = new Stock(3);
        Product p = new Product("Chaise");
        s.add(p);
        System.out.println(s);
    }
}