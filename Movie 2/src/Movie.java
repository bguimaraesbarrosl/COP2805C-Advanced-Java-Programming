public class Movie {
    // instance variables
    private String title;
    private int order;

    // constructors
    public Movie () {
    }

    public Movie(String title, int order) {
        this.order = order;
        this.title = title;
    }

    //setters and getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    // extra method
    public void printList() {
        System.out.println("Harry Potter Movie #" + this.order + ": " + this.title);
    }

    // check if movie number is even
    public boolean isEvenOrder() {
        return this.order % 2 == 0;
    }
}
