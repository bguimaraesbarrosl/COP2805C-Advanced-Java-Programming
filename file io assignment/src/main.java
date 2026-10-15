import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        File file = new File("example.txt");

        try {
            // Create file only once
            if (file.createNewFile()) {

                FileWriter writer = new FileWriter(file);
                writer.write("Sergio\n");
                writer.write("Bruna\n");
                writer.write("Rachel\n");
                writer.write("Isabela\n");
                writer.write("Viviane\n");
                writer.close();

            }
        } catch (IOException e) {
            System.out.println("Error writing the file.");
        }

        // Read and print names
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}

