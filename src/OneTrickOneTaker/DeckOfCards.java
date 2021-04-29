package OneTrickOneTaker;

import java.util.*;

public class DeckOfCards {
    private List<Card> cards = new ArrayList<Card>(52);
    private Random random;
    private Card drawnCard;
    private Object output; // [] output = new Object[2];
    private String winner;

    enum Suits {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS;
    }

    enum Ranks {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE;
    }

    DeckOfCards() {
        this.cards = cards;
        for (Suits s : Suits.values()) {
            for (Ranks r : Ranks.values()) {
                Card card = new Card(s, r);
                this.cards.add(card);
            }
        }
        random = new Random();
    }

    private int randomInt(int min, int max) {
        int randomNum = random.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public Card drawCard() {
        drawnCard = cards.get(randomInt(0, cards.size() - 1));
        return drawnCard;
    }

    public Object printCard() {
        // int cardValue = drawnCard.getValue();
        Ranks cardRank = drawnCard.getRank();
        Suits cardSuit = drawnCard.getSuit();
        String announce = cardRank + " of " + cardSuit;
        // output[0] = cardValue;
        output = announce;
        return output;
    }

    public void calcWinner(int players, String[] playerNames) {
        int[] values = new int[players];
        for (int i = 0; i < players; i++) {
            values[i] = drawnCard.getValue();
            System.out.println(values[i]);
        }
        int MAZ = Arrays.stream(values).max().getAsInt();
        System.out.println(MAZ);
    }


    public String getWinner() {
        winner = "name";
        winner = winner + " has won!";
        return winner;
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card.getRank() + "(" + card.getValue() + ")" + " of " + card.getSuit());
        }
    }
}
