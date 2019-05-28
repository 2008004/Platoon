package Platoon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DragCard extends JLabel implements MouseListener, MouseMotionListener {

    public DragCard(Card c){
        if (c.getType().equals("Pawn")){
            this.setSize(new Dimension(71,100));
            ImageIcon img = new ImageIcon("pics/"+c.getVal()+".png");
            Image myImage = img.getImage();
            Image newImg = myImage.getScaledInstance(this.getWidth(),this.getHeight(), Image.SCALE_SMOOTH);
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
