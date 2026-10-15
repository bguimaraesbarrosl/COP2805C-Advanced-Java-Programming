import java.util.Random;
import java.util.Stack;

public class mainProgram {

    public static void main(String[] args) {

        // Deck of 14 cards
        Card[] deck = new Card[14];

        String[] names = {
                "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten",
                "Jack", "Queen", "King", "Ace"
        };

        String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs" };

        // Create the deck
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(names[i], suits[i % 4]);
        }

        // Create stack
        Stack<Card> stack = new Stack<>();
        Random random = new Random();

        // Push 5 random cards
        System.out.println("Pushing cards:\n");
        for (int i = 0; i < 5; i++) {
            Card randomCard = deck[random.nextInt(deck.length)];
            stack.push(randomCard);
            System.out.println(randomCard);
        }

        // Pop cards from stack
        System.out.println("\nPopping cards:\n");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
