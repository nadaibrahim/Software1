
public class Game {
   String name;
   float score;
   String owner;
   String maincat;
   String category;


public String getName() {
	return name;
}



public Game(String name, float score, String owner , String category , String maincat) {
	super();
	this.name = name;
	this.score = score;
	this.owner = owner;
	this.category = category;
	this.maincat = maincat;
	
}
public Game() {
	super();
}


public Game(String name, float score, String owner) {
	super();
	this.name = name;
	this.score = score;
	this.owner = owner;
}


public void setName(String name) {
	this.name = name;
}
public float getScore() {
	return score;
}
public void setScore(float score) {
	this.score = score;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}


public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}


//display score
public void display_score(float s)
{
	System.out.println("Your score is " + s);
}

}


	


