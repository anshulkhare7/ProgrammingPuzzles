package utils;

public class Test {
    public static void main(String[] args) {
        Card[] deck = Deck.shuffle(Deck.getNew());

        System.out.println(deck[0].show());
    }
}