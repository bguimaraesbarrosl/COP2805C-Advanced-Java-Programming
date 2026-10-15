import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// Helper class to save and load movies from a text file.
public class MovieFileManager {

    // Save all movies from a Watchlist to a file
    public static void saveWatchlistToFile(Watchlist list, String filename) throws IOException {
        // automatically closes the writer
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < list.getCount(); i++) {
                Movie m = list.getMovieAt(i);

                if (m instanceof TwoPartMovie) {
                    TwoPartMovie tp = (TwoPartMovie) m;
                    // Format: PART;order;title;part
                    writer.write("PART;" + tp.getOrder() + ";" + tp.getTitle() + ";" + tp.getPart());
                } else {
                    // Format: MOVIE;order;title
                    writer.write("MOVIE;" + m.getOrder() + ";" + m.getTitle());
                }
                writer.newLine();
            }
        }
    }

    // Load movies from a file into an ArrayList<Movie>
    public static ArrayList<Movie> loadMoviesFromFile(String filename) throws IOException {
        ArrayList<Movie> movies = new ArrayList<>();

        // automatically closes the reader
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) {
                    continue; // skip empty lines
                }

                String[] parts = line.split(";");
                String type = parts[0];

                try {
                    if (type.equals("MOVIE") && parts.length >= 3) {
                        int order = Integer.parseInt(parts[1]);
                        String title = parts[2];
                        movies.add(new Movie(title, order));
                    } else if (type.equals("PART") && parts.length >= 4) {
                        int order = Integer.parseInt(parts[1]);
                        String title = parts[2];
                        int part = Integer.parseInt(parts[3]);
                        movies.add(new TwoPartMovie(title, order, part));
                    } else {
                        // line format not recognized, just skip it
                        System.out.println("Skipping invalid line: " + line);
                    }
                } catch (NumberFormatException e) {
                    // If we can't parse numbers, skip that line
                    System.out.println("Number format problem on line: " + line);
                }
            }
        }

        return movies;
    }
}
