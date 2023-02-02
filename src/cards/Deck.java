package cards;

import java.util.Random;

public class Deck {
    private String[] suit = new String[] {"Spades", "Hearts", "Diamonds", "Clubs"};
    private String[] numofcards = new String[] {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

public Deck() {

}

public String[] getSuit() {
    return suit;
}

public void setSuit(String[] suit) {
    this.suit = suit;
}

public String[] getNumofcards() {
    return numofcards;
}

public void setNumofcards(String[] numofcards) {
    this.numofcards = numofcards;
}

public void shuffle() {
    Random rand = new Random();
    int i = rand.nextInt(4);
    this.suit[i] = suit[i];
    System.out.printf("The suit is %s\n", suit[i]);

    int j = rand.nextInt(13);
    this.numofcards[j] = numofcards[j];
    System.out.printf("The number of card is %s\n", numofcards[j]);
}
}