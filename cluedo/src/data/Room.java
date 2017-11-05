package data;

public class Room {
	private String name;
	private boolean isClue;
	
	public Room(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setClue() {
		isClue = true;
	}
	
	public boolean isClue() {
		return isClue;
	}
	
	public static final String KITCHEN = "Kitchen";
	public static final String BALLROOM = "Ballroom";
	public static final String CONSERVATORY = "conservatory";
	public static final String DININGROOM = "Dining Room";
	public static final String LOUNGE = "Lounge";
	public static final String HALL = "Hall";
	public static final String STUDY = "Study";
	public static final String BILLIARD = "Billiard Room";
	public static final String LIBRARY = "Library";
	
}
