import java.util.ArrayList;

// Watchlist stores Movie objects in an array
// Includes overloaded methods and loops + conditionals

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

    // Overloaded methods

    // 1) AddAll using an Array parameter
    public int addAll(Movie[] moreMovies) {
        int added = 0;
        if (moreMovies == null) return 0;

        for (int i = 0; i < moreMovies.length && count < items.length; i++) {
            if (moreMovies[i] != null) {
                items[count] = moreMovies[i];
                count++;
                added++;
            }
        }
        return added;
    }
    // 2) addAll suing an ArrayList parameter
    public int addAll(ArrayList<Movie>list) {
        int added = 0;
        if (list == null) return 0;

        for (Movie m : list) {
            if (m != null && count < items.length) {
                items[count] = m;
                count++;
                added++;
            }
        }
        return added;
    }

    // print methods

    // print all movies using loops
    public void printAll() {
        System.out.println("Watchlist: " + name + " (" + count + " movies)");
        for (int i = 0; i < count; i++) {
            items[i].printInfo();
        }
    }

    // loops + condition: prints only even-number movies
    public void printEvenMovies() {
        for (int i = 0; i < count; i++) {
            if (items[i].isEvenOrder()) {
                items[i].printInfo();
            }
        }
    }
}