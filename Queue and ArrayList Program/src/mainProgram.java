import java.util.*;

public class mainProgram {
    public static void main(String[] args) {

        Queue<Person> line = new LinkedList<>();
        ArrayList<Integer> tickets = new ArrayList<>();
        Random random = new Random();

        ArrayList<String> names = new ArrayList<>();
        names.add("Bruna");
        names.add("Isabela");
        names.add("Viviane");
        names.add("Rachel");
        names.add("Sergio");
        names.add("Rodrigo");
        names.add("Romulo");

        Collections.shuffle(names); // random order

        for (String n : names) {
            line.add(new Person(n));
        }

        for (int i = 0; i < 7; i++) {
            tickets.add(random.nextInt(1000));
        }

        int i = 0;
        while (!line.isEmpty()) {
            Person p = line.remove();
            p.ticketNumber = tickets.get(i);
            System.out.println(p.name + " got ticket " + p.ticketNumber);
            i++;
        }
    }
}
