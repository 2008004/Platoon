package Platoon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    int[] vals = {2, 3, 4, 5, 6, 7, 8, 9, 10};
    String[] types = {"King", "Queen", "Jack", "Joker", "Bishop"};
    Deck numDeck = new Deck(vals);
    Deck faceDeck = new Deck(types);

    public static void main(String args[]) {





        //shuffle

        //debug print deck

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
        root.setSize(700, 500);
        root.setVisible(true);

        boolean gameOver = false;

        while (!gameOver){


            //debug
            gameOver = true;
        }



    }

}
