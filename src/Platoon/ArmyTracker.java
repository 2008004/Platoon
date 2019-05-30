package Platoon;

import javax.swing.*;
import java.util.ArrayList;

public class ArmyTracker extends JLabel {

    public ArmyTracker(Army hand) {
        int totalVal = 0;
        ArrayList<String> typeList = new ArrayList<String>();
        for (int i = 0; i < hand.getSize() - 1; i++) {
            DragCard c = hand.getCard(i);
            if (c.getType().equals("Pawn")) {
                totalVal += c.getVal();
            } else {
                typeList.add(c.getType());
                if (c.getType().equals("King") || c.getType().equals("Queen") || c.getType().equals("Jack") || c.getType().equals("Bishop")) {
                    totalVal += c.getVal();
                }

            }
        }




    }

}
