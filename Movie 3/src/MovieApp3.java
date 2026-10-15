import java.util.ArrayList;
// Creates Movie and TwoPartMovie objects, uses arrays, ArrayLists,
// loops, conditionals, overloaded methods, overridden methods...
public class MovieApp3 {
    public static void main(String[] args) {
        // Movie class
        Movie m1 = new Movie("Harry Potter and the Sorcerer's Stone", 1);
        Movie m2 = new Movie("Harry Potter and the Chamber of Secrets", 2);
        Movie m3 = new Movie("Harry Potter and the Prisoner of Azkaban", 3);
        Movie m4 = new Movie("Harry Potter and the Goblet of Fire", 4);
        Movie m5 = new Movie("Harry Potter and the Order of the Phoenix", 5);
        Movie m6 = new Movie("Harry Potter and the Half-Blood Prince", 6);

        // TwoPartMovie class
        Movie m7 = new TwoPartMovie("Harry Potter and the Deathly Hallows", 7, 1);
        Movie m8 = new TwoPartMovie("Harry Potter and the Deathly Hallows", 8, 2);

        // store some movies in an array
        Movie[] arrayGroup = {m1, m2, m3, m4};

        // store some movies in an ArrayList
        ArrayList<Movie> listGroup = new ArrayList<>();
        listGroup.add(m5);
        listGroup.add(m6);
        listGroup.add(m7);
        listGroup.add(m8);

        // create a Watchlist
        Watchlist hpList = new Watchlist("Harry Potter Marathon", 8);

        // overloaded methods:
        hpList.addAll(arrayGroup); // uses method with array parameter
        hpList.addAll(listGroup); // uses method with ArrayList parameter

        // print the Watchlist
        System.out.println("-- All Movies --");
        hpList.printAll();

        // print only even-order movies from the Watchlist
        System.out.println("-- Even-Order Movies --");
        hpList.printEvenMovies();

        System.out.println();

        // Demonstrate equals (Object)
        Movie copy = new Movie("Harry Potter and the Sorcerer's Stone", 1);
        System.out.println("m1 equals copy? " + m1.equals(copy));
    }
}