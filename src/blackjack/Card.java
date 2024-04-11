package blackjack;

public class Card {
    private final String rank;
    private final String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public int getValue() {
    if (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")) {
        return 10;
    } else if (rank.equals("Ace")) {
        return 11;
    } else {
        return Integer.parseInt(rank);
    }
}

}

