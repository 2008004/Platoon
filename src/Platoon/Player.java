package Platoon;

import java.util.ArrayList;

public class Player {
    ArrayList<ArrayList<Card>> hands = new ArrayList<ArrayList<Card>>();

    public void makeDeck(Deck numDeck, Deck faceDeck) {

        ArrayList<Card> hand1 = new ArrayList<Card>();
        hand1.add(numDeck.deal());
        hand1.add(faceDeck.deal());
        hands.add(hand1);

        ArrayList<Card> hand2 = new ArrayList<Card>();
        hand2.add(numDeck.deal());
        hand2.add(numDeck.deal());
        hand2.add(faceDeck.deal());
        hands.add(hand2);

        ArrayList<Card> hand3 = new ArrayList<Card>();
        hand3.add(faceDeck.deal());

        ArrayList<Card> hand4 = new ArrayList<Card>();
        hand4.add(numDeck.deal());
        hand4.add(numDeck.deal());
        hands.add(hand4);

        ArrayList<Card> hand5 = new ArrayList<Card>();
        hand5.add(numDeck.deal());
        hand5.add(faceDeck.deal());
    }

}
