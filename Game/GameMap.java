package tarsis.game;

public class GameMap{

//For legibility, the constructor has been placed at the bottom of the class. 

	private Room here;

	//this method will get more complex when 
	//you are able to look at specific items
	//or characters	
	public void look(){
		here.look();
	}

	public void move(String direction){
		here = here.move(direction);
		here.look();
	}

	public GameMap(){

		Room entrance = new Room("You are in a blank room. The walls are bare and white, without even a window." + 
		"The floors are linoleum, and the lighting is a pair of flourescent ceiling lights. There is one door on" + 
		"the EAST wall. Around you, blank bodies appear like dolls. After a few minutes of staring into space," + 
		"they take on true shapes: clothing, faces, expressions. Once clothed, they walk through the door. To" + 
		"walk with them, type east. To read this again, type look. To exit the game at any time, type quit.");

		Room southVillage = new Room("Congrats! You leave the blank room and enter a quaint island village." + 
		"The streets are more like wide sidewalks; there isn't enough room to drive a car. The buildings are small," + 
		"one or two stories, with siding and window shutters. It's summer, and heat rises off the distant pavement." + 
		"You can hear people chatting, the sea off in the distance, and the breeze whispering through the wild grasses.");

		entrance.connect("east", southVillage);
		southVillage.connect("west", entrance);
		here = entrance;

	}

}
