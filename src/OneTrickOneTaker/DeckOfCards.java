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
