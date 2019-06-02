package Platoon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Army extends JLabel implements MouseListener {

	ArmyTracker at;
	public Component component;

	private ArrayList<DragCard> armyDeck = new ArrayList<DragCard>();

	public Army() {
		this.setMaximumSize(new Dimension(71,100));
		this.setSize(new Dimension(71, 100));
		if (armyDeck.size() > 0) {
			ImageIcon img = new ImageIcon("pics/facedown.png");
			Image myImg = img.getImage();
			Image newImg = myImg.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
			this.setIcon(new ImageIcon(newImg));
		}else{
			this.setIcon(new ImageIcon("pics/blank.png"));
		}
	}


	public void refresh() {
		if (armyDeck.size() > 0) {
			ImageIcon img = new ImageIcon("pics/facedown.png");
			Image myImg = img.getImage();
			Image newImg = myImg.getScaledInstance(71, 100, Image.SCALE_SMOOTH);
			this.setIcon(new ImageIcon(newImg));
		}
		this.repaint();
		this.revalidate();
	}

	public void addCard(DragCard d){
		this.armyDeck.add(d);
	}

	public ArrayList<DragCard> getArmyDeck() {
		return armyDeck;
	}

	public void setArmyDeck(ArrayList<DragCard> armyDeck) {
		this.armyDeck = armyDeck;
	}

	public ArmyTracker getAt() {
		return at;
	}

	public void setAt(ArmyTracker at) {
		this.at = at;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println(e.getSource());

		try{
			DragCard d = (DragCard)	getRootPane().getComponentAt(e.getXOnScreen()+50,e.getYOnScreen()+50)	;
			d.setHoverOver(this);
//			System.out.println(d);
		}catch(Exception ex){

		}


	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
}
