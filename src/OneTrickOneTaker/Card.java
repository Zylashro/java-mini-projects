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

    /*
    * Get the index of each rank and turn that index value into an int value.
    * Since the lowest value in a card deck is 2 instead of 0, increment each rank value by 2.
    */
    public int getValue() {
        int value = (int) rank.ordinal() + 2;
        return value;
    }
}
