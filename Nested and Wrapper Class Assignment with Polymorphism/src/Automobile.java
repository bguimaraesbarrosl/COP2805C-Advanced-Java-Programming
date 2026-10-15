public class Automobile {

    // Wrapper classes
    private Integer establishedYear;
    private Double price;
    private String slogan;
    private Character type;

    public Automobile(Integer establishedYear, Double price, String slogan, Character type) {
        this.establishedYear = establishedYear;
        this.price = price;
        this.slogan = slogan;
        this.type = type;
    }

    // Getters and Setters
    public Integer getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(Integer establishedYear) {
        this.establishedYear = establishedYear;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    // sound method
    public void sound() {
        System.out.println("Automobile sound: vrooom");
    }

    // Method to print all information
    public void printInfo() {
        String name = this.getClass().getSimpleName();
        String typeText = (type == null) ? "na" : type.toString();

        System.out.println(
            name +
            " -> Year: " + establishedYear +
            ", Price: $" + price +
            ", Slogan: " + slogan +
            ", Type: " + typeText
            );
        }

        // Overloaded method
        public void printInfo(String label) {
            System.out.println(label);
            printInfo();
    }
}


