package Platoon;

import java.util.ArrayList;

public class Player {
    ArrayList<ArrayList<Card>> hands = new ArrayList<ArrayList<Card>>();


    public Player(Deck numDeck, Deck faceDeck) {
        makeDeck(numDeck, faceDeck);

    }

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

    public ArrayList<ArrayList<Card>> getArmies() {

        return hands;
    }

    public void printHand(int hand){

        for(int x= 0; x < hands.get(hand).size(); x++) {

         if(!hands.get(hand).get(x).getType().equals("pawn")){
            System.out.println(hands.get(hand).get(x).getType());}
         else{
            System.out.println(hands.get(hand).get(x).getVal());}
        }
    }

    public Boolean compareHands(ArrayList<Card> hand1, ArrayList<Card> hand2) {
        int hand1Value = 0;
        int hand2Value = 0;
        Boolean King1 = false;
        Boolean King2 = false;
        Boolean Bishop1 = false;
        Boolean Bishop2 = false;
        Boolean Joker1 = false;
        Boolean Joker2 = false;
        for (int x = 0; x < hand1.size(); x++) {
            hand1Value += hand1.get(x).getVal();
            if (hand1.get(x).getType() == "King") {
                King1 = true;
            }
            if (hand1.get(x).getType() == "Bishop") {
                Bishop1 = true;
            }
            if (hand1.get(x).getType() == "Joker") {
                Joker1 = true;
            }

        }
        for (int x = 0; x < hand2.size(); x++) {
            hand2Value += hand2.get(x).getVal();
            if (hand2.get(x).getType() == "King") {
                King2 = true;
            }
            if (hand2.get(x).getType() == "Bishop") {
                Bishop2 = true;
            }
            if (hand2.get(x).getType() == "Joker") {
                Joker2 = true;
            }

        }
        if (King1 && !King2 && !Bishop2) {
            if (!Joker1 && !Joker2) {
                return true;
            } else if (Joker1 && !Joker2) {
                return false;
            } else if (Joker2 && !Joker1) {
                return false;
            }
        }
        if (Bishop1 && King2) {
            if (!Joker1 && !Joker2) {
                return true;
            } else if (Joker1 && !Joker2) {
                return false;
            } else if (Joker2 && !Joker1) {
                return false;
            }
        }
        if (King2 && !King1 && !Bishop1) {
            if (!Joker1 && !Joker2) {
                return false;
            } else if (Joker1 && !Joker2) {
                return true;
            } else if (Joker2 && !Joker1) {
                return true;
            }
        }
        if (Bishop2 && King1) {
            if (!Joker1 && !Joker2) {
                return false;
            } else if (Joker1 && !Joker2) {
                return true;
            } else if (Joker2 && !Joker1) {
                return true;
            }
        }
        if (hand1Value >= hand2Value) {
            if (!Joker1 && !Joker2) {
                return true;
            } else if (Joker1 && !Joker2) {
                return false;
            } else if (Joker2 && !Joker1) {
                return false;
            }
        }
        return true;
    }


}
    
    





