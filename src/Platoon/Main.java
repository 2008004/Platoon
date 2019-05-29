package Platoon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String args[]) {

        //deck setup
        int[] vals = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] types = {"King", "Queen", "Jack", "Joker", "Bishop"};
        Deck numDeck = new Deck(vals);
        Deck faceDeck = new Deck(types);
        //deck setup end


        //GUI setup
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
        //GUI setup end


        boolean gameOver = false;
        numDeck.easyShuffle();
        faceDeck.easyShuffle();

        while (!gameOver) {

            for (int i = 0; i < 6; i++) {
                DragCard dragCard = new DragCard(numDeck.deal());
                playerCreation.add(dragCard);
            }
            for (int i = 0; i < 4; i++) {
                DragCard dragCard = new DragCard(faceDeck.deal());
                playerCreation.add(dragCard);
            }


            for (int i = 0; i < 5; i++){
                JPanel cardPanel = new JPanel();
                cardPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                cardPanel.setSize(71, 100);

                JPanel valPanel = new JPanel();
                valPanel.setBorder(BorderFactory.createEtchedBorder());


                playerDeck.add(cardPanel);
                playerDeck.add(valPanel);
            }

            root.repaint();
            root.revalidate();
            //debug
            gameOver = true;
        }


    }

}
