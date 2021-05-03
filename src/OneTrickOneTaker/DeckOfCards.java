package OneTrickOneTaker;

import java.util.*;

public class DeckOfCards {
    private List<Card> cards = new ArrayList<Card>(52);
    private Random random;
    private Card drawnCard;
    private int cardValue;

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
        // Create a regular 52 card deck from the ranks and suits. Duplicate cards won't be made.
        for (Suits s : Suits.values()) {
            for (Ranks r : Ranks.values()) {
                Card card = new Card(s, r);
                this.cards.add(card);
            }
        }
        random = new Random();
    }

    // Get random number value.
    private int randomInt(int min, int max) {
        int randomNum = random.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    // Get a random card from the cards array, removing it from the array in the process.
    public Card drawCard() {
        drawnCard = cards.get(randomInt(0, cards.size() - 1));
        return drawnCard;
    }

    // Get the numeric value, which determines the winner, of the drawn card.
    public int getCardValue() {
        cardValue = drawnCard.getValue();
        return cardValue;
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card.getRank() + "(" + card.getValue() + ")" + " of " + card.getSuit());
        }
    }
}
