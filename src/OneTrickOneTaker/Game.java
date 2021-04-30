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
        HashMap<String, Integer> playerHand = new HashMap<String, Integer>();
        // int[] values = new int[players];

        // Integer[] point = (Integer[]) output.get(0);
        for (int i = 0; i < players; i++) {
            playerHand.put(playerNames[i], cards[i]);
            System.out.println(cards[i]);
        }

        int maxValue = Collections.max(playerHand.values());
        // Map.Entry<String, Integer> maxValue = null;
        for (Map.Entry<String, Integer> value : playerHand.entrySet()) {
            if (value.getValue() == maxValue) {
                // maxValue = value;
                winner = value.getKey();
            }
        }

        // winner = maxValue.getKey();
    }


    public static String getWinner() {
        winner = winner + " has won!";
        return winner;
    }
}
