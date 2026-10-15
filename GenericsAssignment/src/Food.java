public class Food {
    private String name;
    private double weight; // pounds

    public Food(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " lb)";
    }
}
