package cluedo.assets;
/**
 * This class represents a Card holding a Room object.
 * @author linus
 *
 */
public class RoomCard implements Card{
	private Room room;
	
	public RoomCard(Room room){
		this.room = room;
	}
	public String toString(){return "Card: " + this.room.toString();}
	
	@Override
	public String getName(){
		return this.room.toString();
	}
	
}
