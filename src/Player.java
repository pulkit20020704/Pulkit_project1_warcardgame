import java.util.*;

public class Player {
    private String name;
    private Queue<Card> hand = new LinkedList<>();
    public Player(String name) {
        this.name = name;}
    public void receiveCards(List<Card> cards) {
        hand.addAll(cards);}
    public Card playCard() {
        return hand.poll();}
    public boolean hasCards() {
        return !hand.isEmpty();}
    public String getName() {
        return name;}
    public int cardCount() {
        return hand.size();}}