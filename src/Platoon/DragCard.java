package Platoon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DragCard extends JLabel implements MouseListener, MouseMotionListener {

    private int val;
    private String type;

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

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}
