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

        Player player = new Player();
        for (int i = 0; i < players; i++) {
            System.out.print("Enter player " + (i + 1) + "'s name: ");
            String playerName = scanner.next().trim();
            player.setName(playerName);
        }

        String[] playerNames = new String[players];
        for (int i = 0; i < players; i++) {
            playerNames[i] = player.getName();
        }

        scanner.close();
        DeckOfCards deck = new DeckOfCards();

        Integer[] cards = new Integer[players];
        for (int i = 0; i < players; i++) {
            Card drawnCard = deck.drawCard();
            cards[i] = deck.getCardValue();
            player.setHand(drawnCard);
            player.calcHand();
            System.out.println(player.printHand());
        }

        Game.calcWinner(players, playerNames, cards);
        System.out.println(Game.getWinner());
    }
}
