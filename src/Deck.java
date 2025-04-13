import java.util.*;

public class Deck {
    private List<Card> cards;
    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        cards = new ArrayList<>();
        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new Card(suit, ranks[i], values[i]));}}}
    public void shuffle() {
        Collections.shuffle(cards);}
    public List<Card> dealHalf() {
        return new ArrayList<>(cards.subList(0, 26));
    }
    public List<Card> dealOtherHalf() {
        return new ArrayList<>(cards.subList(26, 52));}}
