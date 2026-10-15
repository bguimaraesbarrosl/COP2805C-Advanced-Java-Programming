import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Fruit banana = new Banana(0.25);
        Fruit mandarin = new Mandarin(0.20);
        Fruit avocado = new Avocado(0.45);

        Vegetable onion = new Onion(0.35);
        Vegetable cilantro = new Cilantro(0.10);
        Vegetable tomato = new Tomato(0.40);

        Bread white = new WhiteBread(1.10);
        Bread brioche = new Brioche(1.00);
        Bread baguette = new Baguette(0.55);

        ArrayList<Food> mixedList = new ArrayList<>();
        Bucket<Food> bucket = new Bucket<>(mixedList);

        bucket.add(banana);
        bucket.add(mandarin);
        bucket.add(avocado);

        bucket.add(onion);
        bucket.add(cilantro);
        bucket.add(tomato);

        bucket.add(white);
        bucket.add(brioche);
        bucket.add(baguette);

        System.out.println("Items in the bucket:");
        for (Food item : bucket.getList()) {
            System.out.println(item);
        }

    }
}
