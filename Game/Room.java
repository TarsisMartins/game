package tarsis.game;

import java.util.HashMap;

public class Room {

	private String desc;
	private HashMap<String, Room> connections;
	//private HashMap items;

	public Room(){
		desc = "You are in another blank room, identical to where you came in, except for a lack of any players. Email the programmer at penguinpj@gmail.com and tell the lazy bum to stop leaving loose ends everywhere.";
	}

	public Room(String description){

		desc = description;
		connections = new HashMap<String, Room>();

	}

	public void connect(String direction, Room r){
		connections.put(direction, r);
	}

	public void look(){
		System.out.println(desc);
	}

	//public void look(String item){}

	//public boolean addItem(String name, String body){}

	public Room move(String direction){
		if(connections.containsKey(direction)){
			return connections.get(direction);
		}else{
			System.out.println("You cant go that direction.");
			return this;
		}//end else

	}//end move

}//end class
