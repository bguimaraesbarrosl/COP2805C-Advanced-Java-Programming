public class Toyota extends Automobile {

    public Toyota() {
        // type = na → represented as null
        super(1937, 0.0, "Let's Go Places", null);
    }

    @Override
    public void sound() {
        System.out.println("Toyota sound: hummm");
    }
}
