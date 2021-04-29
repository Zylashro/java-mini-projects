package OneTrickOneTaker;

public class Card {
    private DeckOfCards.Suits suit;
    private DeckOfCards.Ranks rank;

    Card(DeckOfCards.Suits suit, DeckOfCards.Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public DeckOfCards.Suits getSuit() {
        return suit;
    }

    public DeckOfCards.Ranks getRank() {
        return rank;
    }

    public int getValue() {
        int value = (int) rank.ordinal() + 2;
        return value;
    }
}
