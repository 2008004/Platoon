package Platoon;

import java.util.ArrayList;

public class Army {
    ArrayList<DragCard> armyList = new ArrayList<DragCard>();
    public Army(DragCard c) {
        armyList.add(c);
    }

    public void Add(DragCard c){
        armyList.add(c);
    }

    public int getSize(){
        return armyList.size();
    }

    public DragCard getCard(int i){
        return armyList.get(i);
    }

}
