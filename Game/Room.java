package tarsis.game;

import java.util.HashMap;

public class Room {

	private String desc;
	private HashMap<String, Room> connections;
	private HashMap<String, String> items;

	public Room(){
		desc = "You are in another blank room, identical to where you came in, except for a lack of any players. Email the programmer at penguinpj@gmail.com and tell the lazy bum to stop leaving loose ends everywhere.";
	}

	public Room(String description){

		desc = description;
		connections = new HashMap<String, Room>();
		items = new HashMap<String, String>();

	}

	public void connect(String direction, Room r){
		connections.put(direction, r);
	}

	public void addItem(String name, String body){
		items.put(name, body);
	}

	public void look(){
		System.out.println(desc);
	}

	public void special(String item){
		if(items.containsKey(item)){
			System.out.println(items.get(item));
		}else{
			System.out.println("Not a valid command" + "\n\n");
		}//end else
	}//end special


	public Room move(String direction){
		if(connections.containsKey(direction)){
			return connections.get(direction);
		}else{
			System.out.println("You cant go that direction.");
			return this;
		}//end else

	}//end move

}//end class
