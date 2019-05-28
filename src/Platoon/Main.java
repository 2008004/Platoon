package Platoon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String args[]) {

        int[] vals = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] types = {"King", "Queen", "Jack", "Joker", "Bishop"};
        ArrayList<Card> deck = new ArrayList<Card>();


        //make cards
        //run twice
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < vals.length; j++) {
                Card c = new Card(vals[j]);
                deck.add(c);
            }

            for (int k = 0; k < types.length; k++){
                Card c = new Card(types[k]);
                if (types[k].equals("King") || types[k].equals("Queen") || types[k].equals("Jack")){
                    c.setVal(10);
                }else if (types[k].equals("Bishop")){
                    c.setVal(1);
                }
                deck.add(c);
            }

        }

        //shuffle
        Collections.shuffle(deck);



        //debug print deck
        System.out.println(deck);

        JFrame root = new JFrame();
        root.setLayout(new GridLayout(5, 1));


        JPanel winCount = new JPanel();
        winCount.setBorder(BorderFactory.createEtchedBorder());
        winCount.setLayout(new GridLayout(1, 5));
        root.add(winCount);


        JPanel cpuDeck = new JPanel();
        cpuDeck.setBorder(BorderFactory.createEtchedBorder());
        cpuDeck.setLayout(new GridLayout(1, 5));
        root.add(cpuDeck);


        JPanel playArea = new JPanel();
        playArea.setBorder(BorderFactory.createEtchedBorder());
        playArea.setLayout(new GridLayout(1, 5));
        root.add(playArea);


        JPanel playerDeck = new JPanel();
        playerDeck.setBorder(BorderFactory.createEtchedBorder());
        playerDeck.setLayout(new GridLayout(1, 5));
        root.add(playerDeck);


        JPanel playerCreation = new JPanel();
        playerCreation.setBorder(BorderFactory.createEtchedBorder());
        playerCreation.setLayout(new GridLayout(1, 10));
        root.add(playerCreation);

        root.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        root.setSize(700, 600);




        root.setVisible(true);

    }

}
