// TwoPartMovie extends Movie
// Used for Deathly Hallows Part 1 and Part 2
public class TwoPartMovie extends Movie {

    private int part; // 1 or 2

    // empty constructor
    public TwoPartMovie() {
        super();
    }

    // constructor with title, order, and part number
    public TwoPartMovie(String title, int order, int part) {
        super(title, order);
        this.part = part;
    }

    public int getPart() {
        return part;
    }

    public void setPart(int part) {
        this.part = part;
    }

    // override printInfo again to include "Part"
    @Override
    public void printInfo(){
        System.out.println("Harry Potter Movie #" + getOrder() + ": "
                + getTitle() + " - Part " + part);
    }
}
