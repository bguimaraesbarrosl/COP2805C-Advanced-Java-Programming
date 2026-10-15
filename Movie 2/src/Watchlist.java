public class Watchlist {
    private String name;
    private Movie[] items;
    private int count;

    // constructor
    public Watchlist(String name, int maxMovies) {
        this.name = name;
        this.items = new Movie[maxMovies];
        this.count = 0;
    }

    // adds a movie to the list if there is space
    public boolean add(Movie m) {
        if (m == null || count >= items.length) {
            return false;
        }
        items[count] = m;
        count++;
        return true;
    }

    public int getCount() {
        return count;
    }

    // loops through and prints all movies
    public void printAll() {
        System.out.println("Watchlist: " + name + "(" + count + " movies)");
        for (int i = 0; i < count; i++) {
            items[i].printList();
        }
    }

    // loops + condition: prints only even-numbered movies
    public void printEvenMovies() {
        System.out.println("Even-oder movies:");
        for (int i = 0; i < count; i++) {
            if (items[i].isEvenOrder()) {
                items[i].printList();
            }
        }
    }
}