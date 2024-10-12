package utils;

public record Card(Suit suit, Rank rank, int seq) {
    public String show() {
        return suit.name() + " | " + rank.name() + " | " + seq;
    }
}

enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

enum Suit {
    SPADE, CLUB, DIAMOND, HEART
}