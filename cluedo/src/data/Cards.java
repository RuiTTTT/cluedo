package data;

public abstract class Cards {
	public enum cardType {SUSPECTS, WEAPONS, ROOMS}
	public static final  String[] WEAPONS = {Weapon.CANDLESTICK, Weapon.KNIFE, Weapon.LEADPIPE, Weapon.POISON, Weapon.REVOLVER, Weapon.ROPE};
	public static final String[] SUSPECTS = {Suspects.GREEN, Suspects.Mustard, Suspects.PEACOCK, Suspects.PLUM, Suspects.SCARLETT, Suspects.WHITE};
	public static final String[] ROOMS = {Room.BALLROOM, Room.BILLIARD, Room.CONSERVATORY, Room.DININGROOM, Room.HALL, Room.KITCHEN, Room.LIBRARY, Room.LOUNGE, Room.STUDY};
	
	
}
