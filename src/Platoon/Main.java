package Platoon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static boolean playerSelected = false;
	public static boolean aiSelected = false;

	public static void main(String args[]) {


		int armyCount = 1;

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


		for (int i = 0; i < 5; i++) {
			Army a = new Army();
//			a.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			game.playerDeckPane.add(a);
			a.addMouseListener(a);
			ArmyTracker at = new ArmyTracker(a);
			at.setBorder(BorderFactory.createEtchedBorder());
			game.playerDeckPane.add(at);
			a.setId(armyCount++);
			System.out.println(a.getId());
		}


		//player hand
		for (int i = 0; i < 6; i++) {
			DragCard d = new DragCard(numDeck.deal());
			game.playerHandPane.add(d);
			d.addMouseListener(d);
			d.addMouseMotionListener(d);
			d.setParent(game.playerHandPane);


		}

		for (int i = 0; i < 4; i++) {
			DragCard d = new DragCard(faceDeck.deal());
			game.playerHandPane.add(d);
			d.addMouseListener(d);
			d.addMouseMotionListener(d);
			d.setParent(game.playerHandPane);


		}


		frame.setVisible(true);


	}


}
