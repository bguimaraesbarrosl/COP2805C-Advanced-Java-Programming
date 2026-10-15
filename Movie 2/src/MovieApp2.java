// Creates movies, stores them in arrays, and uses loops + conditionals
public class MovieApp2 {
    public static void main(String[] args) {
        Movie m1 = new Movie("Harry Potter and the Sorcerer's Stone", 1);
        Movie m2 = new Movie("Harry Potter and the Chamber of Secrets", 2);
        Movie m3 = new Movie("Harry Potter and the Prisoner of Azkaban", 3);
        Movie m4 = new Movie("Harry Potter and the Chamber of Secrets", 4);

        Movie m5 = new Movie();
        m5.setTitle("Harry Potter and the Order of the Phoenix");
        m5.setOrder(5);

        Movie m6 = new Movie();
        m6.setTitle("Harry Potter and the Half-Blood Prince");
        m6.setOrder(6);

        Movie m7 = new Movie();
        m7.setTitle("Harry Potter and the Deathly Hallows - Part 1");
        m7.setOrder(7);

        Movie m8 = new Movie();
        m8.setTitle("Harry Potter and the Deathly Hallows - Part 2");
        m8.setOrder(8);

        // store movies in an array
        Movie[] movies = {m1, m2, m3, m4, m5, m6, m7, m8};

        // loop to print all movies
        System.out.println("All Movies");
        for (int i = 0; i < movies.length; i++) {
            movies[i].printList();
        }

        // loop + conditional: print even-order movies
        System.out.println("Even-order Only");
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].isEvenOrder()) {
                System.out.println(movies[i].getTitle());
            }
        }

        // create a Watchlist
        Watchlist hpList = new Watchlist("Harry Potter Marathon", 8);

        // add all movies to the Watchlist
        for (int i = 0; i < movies.length; i++) {
            hpList.add(movies[i]);
        }

        // print the Watchlist
        System.out.println();
        hpList.printAll();

        // print only even-order movies from the Watchlist
        System.out.println();
        hpList.printEvenMovies();

        // example of condition
        if (hpList.getCount() > 3) {
            System.out.println("More than 3 movies in the watchlist.");
        } else {
            System.out.println("3 or fewer movies in the watchlist.");
        }
    }
}