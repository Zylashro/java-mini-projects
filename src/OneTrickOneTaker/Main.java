package OneTrickOneTaker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int players = 0;

        System.out.print("How many players are participating? Requires at least two players!: ");

        try {
            players = scanner.nextInt();
            if (players <= 1) {
                System.out.println("Not enough players are present to play.");
                scanner.close();
                System.exit(0);
            }
        } catch (InputMismatchException e) {
            System.out.println("Input is not valid!");
        }

        String[] playerNames = new String[players];
        for (int i = 0; i < players; i++) {
            System.out.print("Enter player " + (i + 1) + "'s name: ");
            playerNames[i] = scanner.next().trim();
        }

        scanner.close();
        DeckOfCards deck = new DeckOfCards();

        for (int i = 0; i < players; i++) {
            deck.drawCard();
            System.out.println(playerNames[i] + " drew the " + deck.printCard());
        }
        deck.calcWinner(players, playerNames);
        System.out.println(deck.getWinner());
    }
}
