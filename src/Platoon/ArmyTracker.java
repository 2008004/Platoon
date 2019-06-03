package Platoon;

import javax.swing.*;
import java.util.ArrayList;

public class ArmyTracker extends JLabel {
	String info = "";
	Army a;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Army getA() {
		return a;
	}

	public void setA(Army a) {
		this.a = a;
	}

	public ArrayList<DragCard> getTroopList() {
		return troopList;
	}

	public void setTroopList(ArrayList<DragCard> troopList) {
		this.troopList = troopList;
	}

	public int getVals() {
		return vals;
	}

	public void setVals(int vals) {
		this.vals = vals;
	}

	public ArrayList<String> getFaceList() {
		return faceList;
	}

	public void setFaceList(ArrayList<String> faceList) {
		this.faceList = faceList;
	}

	ArrayList<DragCard> troopList = new ArrayList<DragCard>();
	int vals = 0;
	ArrayList<String> faceList = new ArrayList<String>();

	public ArmyTracker(Army a) {
		this.a = a;
		a.setAt(this);
		troopList = a.getArmyDeck();
		for (int i = 0; i < troopList.size(); i++) {
			if (troopList.get(i).getType().equals("Pawn")) {
				vals += troopList.get(i).getVal();
			} else {
				faceList.add(troopList.get(i).getType());
			}
		}
		String info = "";
		info = Integer.toString(vals);
		for (int i = 0; i < faceList.size(); i++) {
			info += "\n" + faceList.get(i);
//			System.out.println(info);
		}

	}

	public void updateTracker() {
		info = "";
		vals = 0;
		this.troopList = a.getArmyDeck();
		faceList = new ArrayList<String>();

		for (int i = 0; i < troopList.size(); i++) {
			if (troopList.get(i).getType().equals("Pawn")) {
				vals += troopList.get(i).getVal();
			} else {
				faceList.add(troopList.get(i).getType());
			}
		}
		String infoP2 = "";
		info = Integer.toString(vals);
		for (int i = 0; i < faceList.size(); i++) {
			if (faceList.get(i).equals("King") || faceList.get(i).equals("Queen") || faceList.get(i).equals("Jack")) {
				vals += 10;
			}
			infoP2 += "<br/>" + faceList.get(i);
//			System.out.println(info);

		}

		String disp = "<html>" + Integer.toString(vals) + infoP2 + "<html/>";

		this.setText(disp);
		getRootPane().repaint();
		getRootPane().revalidate();

	}



}
