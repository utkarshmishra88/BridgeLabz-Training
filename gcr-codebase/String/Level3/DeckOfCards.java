// Java program to create, shuffle and distribute a deck of cards

import java.util.Scanner;

public class DeckOfCards {

    // method to initialize the deck of cards
    public static String[] initializeDeck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;

        // loop through suits and ranks
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        return deck;
    }

    // method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        // iterate over deck
        for (int i = 0; i < n; i++) {

            // generate random card number
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // swap current card with random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    // method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int n, int players) {

        // check if cards can be distributed
        if (n > deck.length || n % players != 0) {
            return null;
        }

        int cardsPerPlayer = n / players;
        String[][] playerCards = new String[players][cardsPerPlayer];

        int cardIndex = 0;

        // distribute cards
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }

        return playerCards;
    }

    // method to print players and their cards
    public static void printPlayers(String[][] players) {

        for (int i = 0; i < players.length; i++) {

            System.out.println("\nPlayer " + (i + 1) + " cards:");

            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // suits and ranks
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = {
            "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King", "Ace"
        };

        // initialize deck
        String[] deck = initializeDeck(suits, ranks);

        // shuffle deck
        deck = shuffleDeck(deck);

        // take input from user
        System.out.print("Enter number of cards to distribute: ");
        int n = input.nextInt();

        System.out.print("Enter number of players: ");
        int players = input.nextInt();

        // distribute cards
        String[][] playerCards = distributeCards(deck, n, players);

        if (playerCards == null) {
            System.out.println("Cards cannot be distributed evenly.");
        } else {
            // print players and their cards
            printPlayers(playerCards);
        }

        // close scanner
        input.close();
    }
}
