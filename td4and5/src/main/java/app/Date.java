package app;

/**
 * Date
 * 
 */
public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public Date() {
        setDay(9);
        setMonth(4);
        setYear(2018);
    }

    public boolean before(Date date) {
        if (date.year <= year)
            if (date.month <= month)
                if (date.day <= day)
                    return true;

        return false;
    }

    public boolean after(Date date) {
        if (date.year >= year)
            if (date.month >= month)
                if (date.day > day)
                    return true;

        return false;
    }

    public String toString() {
        return year + "/" + month + "/" + day;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
}