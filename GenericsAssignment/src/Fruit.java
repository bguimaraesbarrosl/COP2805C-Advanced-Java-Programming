public class Fruit extends Food {
    public Fruit(String name, double weight) {
        super(name, weight);
    }
}

class Banana extends Fruit {
    public Banana(double weight) {
        super("Banana", weight);
    }
}

class Mandarin extends Fruit {
    public Mandarin(double weight) {
        super("Mandarin", weight);
    }
}

class Avocado extends Fruit {
    public Avocado(double weight) {
        super("Avocado", weight);
    }
}
