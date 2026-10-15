// Harry Potter movie class (child of MediaItem)
public class Movie extends MediaItem {
    private Integer order; //wrapper class

    // empty constructor
    public Movie () {
        super(); // calls MediaItem()
    }

    // constructor with title and order
    public Movie(String title, int order) {
        super(title);
        this.order = order;
    }

    // Overloaded constructor
    public Movie(String title) {
        super(title);
        this.order = null;
    }

    // setters and getters

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    // check if the order number is even
    public boolean isEvenOrder() {
        return order != null && order % 2 == 0;
    }

    // override parent's printInfo()
    @Override
    public void printInfo() {
        System.out.println("Harry Potter Movie #" + order + ": " + getTitle());
    }

    // Override equals() from Object class
    @Override
    public boolean equals(Object obj) {
        //if not a Movie object, return false
        if (!(obj instanceof Movie)) {
            return false;
        }

        // cast Object to Movie
        Movie other = (Movie) obj;

        // compare title AND order
        return this.getTitle().equals(other.getTitle()) &&
        this.order.equals(other.getOrder());
    }

    @Override
    public String toString() {
        return "HP Movie  #" + order + ": " + getTitle();
    }
}
