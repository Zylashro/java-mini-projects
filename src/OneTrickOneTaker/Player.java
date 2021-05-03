package OneTrickOneTaker;

public class Player {
    private String name;
    private String hand;
    private Card drawnCard;

    Player() {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHand(Card drawnCard) {
        this.drawnCard = drawnCard;
    }

    public void calcHand() {
        DeckOfCards.Ranks cardRank = drawnCard.getRank();
        DeckOfCards.Suits cardSuit = drawnCard.getSuit();
        hand = cardRank + " of " + cardSuit;
    }

    public String printHand() {
        String announce = name + " drew the " + hand;
        return announce;
    }
}
