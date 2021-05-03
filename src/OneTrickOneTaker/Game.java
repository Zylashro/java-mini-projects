package OneTrickOneTaker;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Game {
    private static String winner;
    private int players;
    private String[] playerNames;
    private Integer[] cards;

    Game() {
        this.calcWinner(players, playerNames, cards);
        this.getWinner();
    }

    public static void calcWinner(int players, String[] playerNames, Integer[] cards) {
        // Create a new hash map, add both the players names and the card they drew as a key, value pair.
        HashMap<String, Integer> playerHands = new HashMap<String, Integer>();
        for (int i = 0; i < players; i++) {
            playerHands.put(playerNames[i], cards[i]);
        }

        // Get the highest value number from all the cards the players drew.
        // Iterate over hash map, assign the key of the highest value to the winner string.
        int maxValue = Collections.max(playerHands.values());
        for (Map.Entry<String, Integer> value : playerHands.entrySet()) {
            if (value.getValue() == maxValue) {
                winner = value.getKey();
            }
        }
    }

    public static String getWinner() {
        winner = winner + " has won!";
        return winner;
    }
}
