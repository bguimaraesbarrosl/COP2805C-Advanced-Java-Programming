public class Corolla extends Toyota {

    public Corolla() {
        setEstablishedYear(2023);
        setPrice(21700.0);
        setType('c');
    }

    @Override
    public void sound() {
        System.out.println("Corolla sound: brrrrrr");
    }

    // Extra method
    public Integer fuelEfficiency() {
        return 32; // miles per gallon
    }
}

