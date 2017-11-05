package data;

import java.util.List;

public class Suspects {
	private String name;
	private boolean isMove;
	private boolean isClue;
	
	public Suspects(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setClue() {
		isClue = true;
	}
	
	public boolean getSuspect() {
		return isClue;
	}
	
	
	public static final String SCARLETT = "Miss Scarleft";
	public static final String PLUM = "Professor Plum";
	public static final String PEACOCK = "Mrs Peacock";
	public static final String GREEN = "Reverend Mr Green";
	public static final String Mustard = "Colonel Mustard";
	public static final String WHITE = "Mrs White";
	
}
