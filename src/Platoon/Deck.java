package Platoon;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>();


    public Deck(int[] vals) {
        for (int i = 1; i < 2; i++) {
            for (int x = 0; x < vals.length; x++) {
                deck.add(new Card(vals[x]));
            }
        }
        }

    public Deck(String[] types){
        for(int i = 1; i<= 2; i++) {
            for (int x = 0; x < types.length; x++) {
                int c = 0;
                if (types[x].equals("King") || types[x].equals("Queen") || types[x].equals("Jack")) {
                    c = 10;
                } else if (types[x].equals("Bishop")) {
                    c = 1;
                }
                deck.add(new Card(types[x], c));

            }
        }
        }





    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Deck(ArrayList<Card> cards){
        for (Card v:cards){
            this.deck.add(v);
        }

    }

    public Card deal(){
        Card c = deck.get(0);
        this.deck.remove(0);
        return c;
    }

    public void selectionShuffle() {
        ArrayList<Card> values = this.deck;
        ArrayList<Card> shuffled = new ArrayList<Card>();
        int size = values.size();
        for(int x = 0; x < values.size(); x++)
        {
            int random = (int) (Math.random() * (values.size() - 1));
            Card tempValue = values.get(random);
            Card newValue = values.get(size-1);
            values.set((size-1), tempValue);
            values.set(random, newValue);
            shuffled.set((size - 1), tempValue);
            System.out.println(random);
        }
        deck = shuffled;
    }


}
