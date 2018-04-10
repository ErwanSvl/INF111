package app;

/**
 * Product
 */
public class Product {

    private static int numberCreated = 0;
    private String name;
    private int number;

    public Product(String name) {
        setName(name);
        setNumber(++numberCreated);
    }

    public Product(String name, int number) {
        setName(name);
        setNumber(number);
    }

    @Override
    public String toString() {
        return getName() + " id: " + getNumber();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the numberCreated
     */
    public static int getNumberCreated() {
        return numberCreated;
    }

    public boolean equals(Object o) {
        if (o instanceof Product) {
            Product p = (Product) o;
            return p.name.equals(name) && p.number == number;
        }
        return false;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Vélo");
        Product product2 = new Product("Chaise");
        Product product3 = product1;
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println("Il y a " + Product.getNumberCreated() + " produits au total");
    }
}