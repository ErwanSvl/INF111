package app;

/**
 * PerishableProduct
 */
public class PerishableProduct extends Product{

    private Date bestBeforeDate;

    public PerishableProduct(String name, Date date) {
        super(name);
        setBestBeforeDate(date);
    }

    public boolean isOutOfDate() {
        Date today = new Date();
        return bestBeforeDate.before(today);
    }

    public String toString() {
        return super.toString() + " Date de péremption : " + getBestBeforeDate();
    }

    /**
     * @return the bestBeforeDate
     */
    public Date getBestBeforeDate() {
        return bestBeforeDate;
    }

    /**
     * @param bestBeforeDate the bestBeforeDate to set
     */
    public void setBestBeforeDate(Date bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }
}