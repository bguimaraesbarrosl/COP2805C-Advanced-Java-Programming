public class Bread extends Food {
    public Bread(String name, double weight) {
        super(name, weight);
    }
}

class WhiteBread extends Bread {
    public WhiteBread(double weight) {
        super("White Bread", weight);
    }
}

class Brioche extends Bread {
    public Brioche(double weight) {
        super("Brioche", weight);
    }
}

class Baguette extends Bread {
    public Baguette(double weight) {
        super("Baguette", weight);
    }
}
