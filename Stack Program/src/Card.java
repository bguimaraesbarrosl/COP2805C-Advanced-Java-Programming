public class Card {
    String name;
    String suit;

    public Card (String name, String suit) {
        this.name = name;
        this.suit = suit;
    }

    public String toString() {
        return name + " of " + suit;
    }
}
