package OneTrickOneTaker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int players = 0;

        System.out.print("How many players are participating? Requires at least two players!: ");

        // Try to acquire the exact number of players participating. Only accepts numbers between 2 and 52.
        try {
            players = scanner.nextInt();
            if (players <= 1) {
                System.out.println("Not enough players are present to play.");
                scanner.close();
                System.exit(1);
            } else if (players > 52) {
                System.out.println("Not enough cards to support that many players!");
                scanner.close();
                System.exit(1);
            }
        } catch (InputMismatchException e) {
            System.out.println("Input is not valid!");
            scanner.close();
            System.exit(1);
        }

        /*
        * Loop over the number of players, creating a new player object with each iteration.
        * In the process, set each one a name before adding them to the array of all players.
        */
        Player[] player = new Player[players];
        for (int i = 0; i < players; i++) {
            Player makePlayer = new Player();
            System.out.print("Enter player " + (i + 1) + "'s name: ");
            String playerName = scanner.next().trim();
            makePlayer.setName(playerName);
            player[i] = makePlayer;
        }
        scanner.close();

        // Get the name of each individual player and save said name into an array.
        // Is needed for the calcWinner function.
        String[] playerNames = new String[players];
        for (int i = 0; i < players; i++) {
            playerNames[i] = player[i].getName();
        }

        DeckOfCards deck = new DeckOfCards();

        // Create an array which will host the value of each card pulled by the players.
        // Each players hand will be set with the card they drew. Before calculating the cards rank and suit.
        // Finally, print out each players hand.
        Integer[] cards = new Integer[players];
        for (int i = 0; i < players; i++) {
            Card drawnCard = deck.drawCard();
            cards[i] = deck.getCardValue();
            player[i].setHand(drawnCard);
            player[i].calcHand();
            System.out.println(player[i].printHand());
        }

        // Find the highest number value from the cards drawn by the players and print out who won.
        // At the moment, there are no ties. If two players have the same value, the first one wins.
        Game.calcWinner(players, playerNames, cards);
        System.out.println(Game.getWinner());
    }
}
