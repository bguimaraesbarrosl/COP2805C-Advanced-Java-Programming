public class Car {
    // instance variables
    private int year;
    private String make;
    private String model;
    private float mileage;

    // methods
    // constructors -> help us create (instantiate0 objects
    // explicit 0-argument constructor
    public Car() {

    }
    public Car(int year, String make, String model, float mileage) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }
    public Car(int year) {
        this.year = year;
    }

    // accessors and mutators a.k.a. getters and setters
    public int getYear() {
        return year;
    }
    public void setYear(int y) {
        year = y;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public float getMileage() {
        return mileage;
    }
    public void setMileage(float mileage) {
        this.mileage = mileage; // this -> implicit parameter
    }

    // instance methods
    // drive, honk
    public void drive(float milesDriven) {
        mileage += milesDriven; //mileage = mileage + milesDriven
    }

    public void honk(String sound) {
        System.out.println(sound);
    }
}

