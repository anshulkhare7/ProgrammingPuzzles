package utils;

import java.util.Random;

class Deck {
    
    private static final Random random = new Random();

    static Card[] getNew() {
        Card[] deck = new Card[52];
        int index = 0;
        for (Suit suit : new Suit[]{Suit.HEART, Suit.DIAMOND, Suit.SPADE, Suit.CLUB}) {
            for (Rank rank : Rank.values()) {
                deck[index] = new Card(suit, rank, index);
                index++;
            }
        }
        return deck;
    }

    public static Card[] shuffle(Card[] d) {
        for (int i = d.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap d[i] and d[j]
            Card temp = d[i];
            d[i] = d[j];
            d[j] = temp;
        }
        return d;
    }
}


