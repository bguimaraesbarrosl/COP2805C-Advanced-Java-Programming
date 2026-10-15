public class Main {

    public static void main(String[] args) {
        Automobile auto = new Automobile(1886, 9999.0, "Original car", 'a');
        Corolla corolla = new Corolla();
        Toyota toyota = new Toyota();
        Tundra tundra = new Tundra();
        Highlander highlander = new Highlander();

        // Polymorphism (dynamic binding)
        System.out.println("--- Sounds (Dynamic Binding / Polymorphism) ---");

        Automobile[] cars = {
                auto, toyota, corolla, tundra, highlander
        };

        for (Automobile car : cars) {
            car.sound();
        }

        System.out.println();
        System.out.println("--- Car Information ---");

        for (Automobile car : cars) {
            car.printInfo();
        }

        System.out.println();
        System.out.println("--- Static Binding demonstration (Overloading) ---");

        // Static binding: overloaded method selection
        auto.printInfo("This is the overloaded printInfo(String) method:");

        // Inner class demonstration
        System.out.println();
        System.out.println("--- Inner Class Demo ---");
        Highlander.ThirdRow seats7 = highlander.new ThirdRow(7);
        Highlander.ThirdRow seats8 = highlander.new ThirdRow(8);

        System.out.println("Highlander third row option: " + seats7.getSeats() + " seats");
        System.out.println("Highlander third row option: " + seats8.getSeats() + " seats");

        System.out.println();

        // Wrapper class + Corolla extra method
        System.out.println("--- Corolla extra method ---");
        Integer mpg = corolla.fuelEfficiency();
        System.out.println("Corolla fuel efficiency: " + mpg + " MPG");
        System.out.println("Estimated range for 10 gallons: " + (mpg * 10) + " miles");

        System.out.println();
    }
}
