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
		System.out.println(" ");
		here.look();
	}

	public GameMap(){

		Room entrance = new Room("You are in a blank room. The walls are bare and white, without even a window. " + 
		"The floors are linoleum, and the lighting is a pair of flourescent ceiling lights. There is one door on " + 
		"the EAST wall. Around you, blank bodies appear like dolls. After a few minutes of staring into space, " + 
		"they take on true shapes: clothing, faces, expressions. Once clothed, they walk through the door. To " + 
		"walk with them, type east. To read this again, type look. To exit the game at any time, type quit. ");

		Room southVillage = new Room("You leave the blank room and enter a quaint island village. " + 
		"The streets are more like wide sidewalks; there isn't enough room to drive a car. The buildings are small, " + 
		"one or two stories, with siding and window shutters. It's summer, and heat rises off the distant pavement. " + 
		"You can hear people chatting, the sea off in the distance, and the breeze whispering through the wild grasses. "
		+ "To the north there seems to be a plaza.");

		entrance.connect("east", southVillage);
		southVillage.connect("west", entrance);
		here = entrance;

		Room centerVillage = new Room("The center of the village is a bustling plaza. A group of residents is chatting " + 
		"next to a bulletein board. There are other groups of two or three, each woman more outlandish than the " + 
		"last. Bunny ears, bikini tops, cat ears, and space suits intermingle with more familiar clothing. From " + 
		"here, you can travel in all four directions, but most of the women seem to go north.");

		centerVillage.connect("south", southVillage);
		southVillage.connect("north", centerVillage);

		Room northVillage = new Room("Amongst the neat rows of houses you see two anomalies of note. To the east " + 
		"there is a sign for a hot springs next to a dirt path. To the west lies a huge building called " +  
		"Transportation Hub. To the north is a wood, and you see a woman with a pack setting off for what looks " + 
		"like a hike. ");

		northVillage.connect("south", centerVillage);
		centerVillage.connect("north", northVillage);

		Room hotSprings = new Room("The hot spring is a natural pool with warm, clear water. You can see the " + 
		"large, smooth rocks that make up the bottom. Women are using some rocks as natural chairs as they chat. " + 
		"Around the spring is a set of cubbies that are used to hold clothes and towels. Around the spring and " + 
		"cubbies are a well-curated garden of bamboo and juniper.");

		hotSprings.connect("west", northVillage);
		northVillage.connect("east", hotSprings);

		Room farNorth = new Room("The woods are expansive, but well-marked paths make it easy to find your " + 
		"way. You keep seeing signs for various magical springs, each with the supposed power of transforming you " + 
		"into an animal of some sort. More interestingly, there are houses hidden amongst the trees. They are small " +
		"but very unique.");

		farNorth.connect("south", northVillage);
		northVillage.connect("north", farNorth);

		Room transHub = new Room("You walk into a room with 8 stone arches and a small, circular stone " + 
		"platform in the middle. There are magical inscriptions and signs above each arch, but none seem to be active. ");

		transHub.connect("east", northVillage);
		northVillage.connect("west", transHub);

		Room eastVillage = new Room("Here you see the sidewalk drift into sand. Beyond that is the coast, with " + 
		"tropical sun beating downon white sands. There are vert few people here, though you think you may see one " + 
		"lonely figure on the railing of the lighthouse. The lighthouse is a simple affair, not overly tall, white " + 
		"stucco with horizontal black stripes. there are no dunes, just a relaxing slope into the flat of the " + 
		"shore, with the forest making up the rest of your horizon. ");

		eastVillage.connect("west", centerVillage);
		centerVillage.connect("east", eastVillage);

		Room westVillage = new Room("This side of the village is an orderly set of side streets off the main " + 
		"walkway. You see signs: a hotel, coffee shop, and even a resteraunt. The decor on this side of town " + 
		"is completel askew. CLearly, there is no planning comittee. Women travel in and out of the buildings, " + 
		"mostly alone, but they are especially drawn to a bar at the south end of a far street.");

		westVillage.connect("east", centerVillage);
		centerVillage.connect("west", westVillage);

		Room bar = new Room("What roleplay experience is complete without a bar? The floor is fairly open, " + 
		"with booths and pool tables. The players here are less flirtatious, but only because they all seem to " + 
		"be old friends. An angel hugs a devil. An ex-marine hops behind the bar to replace the robot that had " + 
		"been serving. Players are able to walk directly through you, confirming that what you see are truly " + 
		"ghosts of a long gone place.");

		bar.connect("north", westVillage);
		westVillage.connect("south", bar);


	}

}
