package data;

import java.util.List;

public class Pawns {
	private String name;
	private boolean isMove;
	private boolean isSuspect;
	private List<Cards> cardsHold;
	private int initX;
	private int initY;
	
	public Pawns(String name, int x, int y) {
		this.name = name;
		this.initX = x;
		this.initY = y;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isMove() {
		return isMove;
	}
	
	public void setSuspect() {
		isSuspect = true;
	}
	
	public boolean getSuspect() {
		return isSuspect;
	}
	
	public void setCard(Cards cardA, Cards cardB, Cards cardC) {
		this.cardsHold.add(cardA);
		this.cardsHold.add(cardB);
		this.cardsHold.add(cardC);
	}
}
