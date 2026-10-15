public class Vegetable extends Food {
    public Vegetable(String name, double weight) {
        super(name, weight);
    }
}

class Onion extends Vegetable {
    public Onion(double weight) {
        super("Onion", weight);
    }
}

class Cilantro extends Vegetable {
    public Cilantro(double weight) {
        super("Cilantro", weight);
    }
}

class Tomato extends Vegetable {
    public Tomato(double weight) {
        super("Tomato", weight);
    }
}
