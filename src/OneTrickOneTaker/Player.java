package OneTrickOneTaker;

import java.util.concurrent.atomic.AtomicInteger;

public class Player {
    private String name;
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int ID;
    private String hand;
    private Card drawnCard;

    Player() {
        this.setName(name);
        this.ID = count.incrementAndGet();
    }

    public void setName(String name) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public String getID() {
        String id = Integer.toString(ID);
        return id;
    }
}
