package Platoon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public Point p;

    public static void main(String args[]) {

        //deck setup
        int[] vals = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] types = {"King", "Queen", "Jack", "Joker", "Bishop"};
        Deck numDeck = new Deck(vals);
        Deck faceDeck = new Deck(types);
        //deck setup end

        //GUI setup
        JFrame frame = new JFrame();
        Game game = new Game();
        frame.setContentPane(game.root);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(frame.getContentPane().getPreferredSize());

        //player hand
        for (int i = 0; i < 6; i++){
            DragCard d = new DragCard(numDeck.deal());
            game.playerHandPane.add(d);
            d.addMouseListener(d);
            d.addMouseMotionListener(d);
        }


        frame.setVisible(true);


    }


}
