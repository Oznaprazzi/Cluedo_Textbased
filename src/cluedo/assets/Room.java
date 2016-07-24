package cluedo.assets;
/**
 * Room Class. Stores the name of the room, and the weapon it is currently holding.
 * @author linus
 *
 */
public class Room {
	
	/**
	 * The name of the Room.
	 */
	private String name;
	
	/**
	 * The weapon that the room is in.
	 */
	private Weapon weapon = null;
	
	/**
	 * The x position of this room.
	 */
	private int x;
	
	/**
	 * The y position of this room.
	 */
	private int y;
	
	/**
	 * The width of this room.
	 */
	private int width;
	
	/**
	 * The height of this room.
	 */
	private int height;
	
	/**
	 * Determines whether this room has stairs or not
	 */
	private boolean hasStairs;
	
	/**
	 * Construct a Room.
	 */
	public Room(String n){
		this.name = n;
	}
	
	
	/**
	 * Construct a Room with x, y coordinates, its width and height and whether it has stairs or not.
	 */
	public Room(String n, int x, int y, int width, int height, boolean hasStairs){
		this.name = n;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.hasStairs = hasStairs;
	}
	
	/**
	 * Add weapon to room
	 * @param w
	 */
	public void addWeapon(Weapon w){
		this.weapon = w;
	}
	
	/**
	 * Gets the weapon being held in this current room.
	 * @return
	 */
	public Weapon getWeapon(){
		return this.weapon;
	}
	
	/**
	 * Returns a toString representation of this Room.
	 */
	@Override
	public String toString(){
		if(this.weapon != null){
			return "[Room: " + name + " | Weapon: " + weapon.weaponName() + "]";
		}
		return "[Room: " + name + " | Weapon: null]";
	}
	
	public String stringName(){
		return "[Room: " + name + "]";
	}
}
