package utils;

public class EntryPoint {
    public static void main(String[] args) {
        Card[] deck = Deck.shuffle(Deck.getNew());

        System.out.println(deck[0].show());
    }
}
