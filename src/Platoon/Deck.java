package Platoon;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<Card>();

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
        return deck.get(0);
    }



}
