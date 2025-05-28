package card;

import java.util.Scanner;
/*
Name: Harsh Barot
Student id : 991775979
Date : 27-05-2025
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13 + 1)); // Values 1-13
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]); // Suits 0-3
            magicHand[i] = c;
            System.out.println(c.getSuit() + " " + c.getValue()); // Optional: show magic hand
        }

        Scanner k = new Scanner(System.in);

        System.out.print("\nEnter your card value (1-13): ");
        int userValue = k.nextInt();

        System.out.println("Choose your suit:");
        System.out.println("1. Hearts 2.Diamonds 3. Clubs 4. Spades");
        System.out.print("Enter suit number (1-4): ");
        int suitNum = k.nextInt();

      while (suitNum < 1 || suitNum > 4) {
            System.out.print("Invalid input. Enter a number between 1 and 4: ");
            suitNum = k.nextInt();
        }

        String userSuit = Card.SUITS[suitNum - 1];

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        int i;
        for (i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == userCard.getValue()
                    && magicHand[i].getSuit().equalsIgnoreCase(userCard.getSuit())) {
            }
        }

        if (i < magicHand.length) {
            System.out.println("\nCongrats your card is in the magic hand!");
        } else {
            System.out.println("\Sorry your card was not found in the magic hand.");
        }

        if (userCard.getValue() == luckyCard.getValue()
                && userCard.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
            System.out.println("You picked the lucky card: 2 of Clubs!");
        }
    }
}
