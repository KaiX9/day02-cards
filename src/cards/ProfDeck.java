package cards;

public class ProfDeck {
    
    public String[] SUIT = {"Diamond", "Heart", "Spade", "Clubs"};
    public String[] NAME = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public int[] RANK = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};


    private Card[] cards = new Card[52];

    public ProfDeck() {
        int offset = 0;
        for (int s = 0; s < SUIT.length; s++) {
            for (int j = 0; j < NAME.length; j++) {
                Card c = new Card(SUIT[s], NAME[j], RANK[j]);
                cards[offset + j] = c;
            }
            offset += NAME.length;
        }
        /*int s = 0;
        int j = 0;
        while (s < SUIT.length) {
            j = 0;
            while (j < NAME.length) {
                Card c = new Card(SUIT[s], NAME[j], RANK[j]);
                System.out.printf(">> card: %s\n", c);
                j++;
            }
            s++;
        }*/

    }
}
