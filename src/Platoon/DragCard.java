package Platoon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DragCard extends JLabel implements MouseListener, MouseMotionListener {
	public Component hoverOver;
	private JPanel parent;
	private Point homeP;
	private int val;
	private String type;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setParent(JPanel parent) {
		this.parent = parent;
	}

	public void setHoverOver(Component component) {
		this.hoverOver = component;
//		System.out.println(hoverOver);
	}

	public DragCard(Card c) {
		this.val = c.getVal();
		this.type = c.getType();
		if (c.getType().equals("Pawn")) {
			this.setSize(new Dimension(71, 100));
			ImageIcon img = new ImageIcon("pics/" + c.getVal() + ".png");
			Image myImage = img.getImage();
			Image newImg = myImage.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
			this.setIcon(new ImageIcon(newImg));
		} else if (c.getType().equals("King") || c.getType().equals("Jack") || c.getType().equals("Queen") || c.getType().equals("Joker") || c.getType().equals("Bishop")) {
			this.setSize(new Dimension(71, 100));
			ImageIcon img = new ImageIcon("pics/" + c.getType() + ".png");
			Image myImage = img.getImage();
			Image newImg = myImage.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
			this.setIcon(new ImageIcon(newImg));

		}
	}


	@Override
	public void mouseClicked(MouseEvent mouseEvent) {

	}

	@Override
	public void mousePressed(MouseEvent mouseEvent) {
		homeP = this.getLocation();

		getRootPane().setComponentZOrder(this, 0);

	}

	@Override
	public void mouseReleased(MouseEvent mouseEvent) {


		if (hoverOver instanceof Army) {
			((Army) hoverOver).addCard(this);
			((Army) hoverOver).getAt().updateTracker();
			((Army) hoverOver).refresh();
			getRootPane().remove(this);
		} else {

			parent.add(this);
			this.setLocation(homeP);
			getRootPane().repaint();
			getRootPane().revalidate();

		}
	}

	@Override
	public void mouseEntered(MouseEvent mouseEvent) {
//		System.out.println("Entered!");
//		System.out.println(this);
	}

	@Override
	public void mouseExited(MouseEvent mouseEvent) {

	}

	@Override
	public void mouseDragged(MouseEvent mouseEvent) {
		Component c = mouseEvent.getComponent();
		Component p = c.getParent();

		Point point = p.getMousePosition();

		try {
			this.setLocation(point);
		} catch (Exception e) {

		}
	}

	@Override
	public void mouseMoved(MouseEvent mouseEvent) {

	}

}
