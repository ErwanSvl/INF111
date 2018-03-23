/**
 * Mark
 */
public class Mark {

    private String name;
    private int mark;

    public Mark(String name, int mark) {
        this.setName(name);
        this.setMark(mark);
    }

    /**
     * @return the mark
     */
    public int getMark() {
        return mark;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(int mark) {
        this.mark = mark;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}