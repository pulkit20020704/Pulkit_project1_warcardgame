import java.util.*;

public class WarGame {
    private Player player1;
    private Player player2;
    public WarGame(String name1, String name2) {
        Deck deck = new Deck();
        deck.shuffle();
        player1 = new Player(name1);
        player2 = new Player(name2);
        player1.receiveCards(deck.dealHalf());
        player2.receiveCards(deck.dealOtherHalf());}
public void play() {
    int round = 1;
    int maxRounds = 10;
    while (player1.hasCards() && player2.hasCards() && round <= maxRounds) {
        System.out.println("--- Round " + round + " ---");
        Card c1 = player1.playCard();
        Card c2 = player2.playCard();

        System.out.println(player1.getName() + " plays: " + c1);
        System.out.println(player2.getName() + " plays: " + c2);

        if (c1.getValue() > c2.getValue()) {
            player1.receiveCards(List.of(c1, c2));
            System.out.println(player1.getName() + " wins the round.\n");
        } else if (c2.getValue() > c1.getValue()) {
            player2.receiveCards(List.of(c1, c2));
            System.out.println(player2.getName() + " wins the round.\n");
        } else {
            System.out.println("It's a tie! (War not implemented).\n");
        }
        round++;}
    if (round > maxRounds) {
        System.out.println("Game stopped after " + maxRounds + " rounds (infinite loop prevention).");}
    declareWinner();}
    public void declareWinner() {
    int p1Count = player1.cardCount();
    int p2Count = player2.cardCount();

    if (p1Count > p2Count) {
        System.out.println(player1.getName() + " wins the game with " + p1Count + " cards!");
    } else if (p2Count > p1Count) {
        System.out.println(player2.getName() + " wins the game with " + p2Count + " cards!");
    } else {
        System.out.println("The game is a draw!");
    }
}

    public static void main(String[] args) {
        WarGame game = new WarGame("Alice", "Bob");
        game.play();}} 
