
import java.util.ArrayList;
import java.util.Scanner;

public class Game_Database {
	
ArrayList <Game> Games = new ArrayList <Game>();


public int Search (String game){
	
	int index=0;
	boolean found = false;
	for (int i=0 ; i<Games.size(); i++)
	{
		if (game.equals(Games.get(i).name)  )
		{
			found = true;
			index = i;			
		}
	}
	
	if (found==false)
	{
		System.out.println("Game " + game + " is not found ");
	}
		return index;
}

public void  AddTF() 
{
	Scanner s = new Scanner(System.in);
	
	System.out.println("Game name: ");
	String n;
	n = s.nextLine();
	
	System.out.println("Your name: ");
	String on;
	on = s.nextLine();
	
	System.out.println("Game category: ");
	String mc;
	mc = s.nextLine();
	
	TandF tf = new TandF(n,0,on,"T/F",mc);
	
	System.out.println("How many questions will be in your game?");
	  int numques; 
	  Scanner ss = new Scanner(System.in);
	  numques = ss.nextInt();
	  
	for (int i=0 ; i<numques ; i++)
	{
		TrueAndFalseContent tfc = new TrueAndFalseContent();
		System.out.println("Enter question " + (i+1));
		  String q;
		 //Scanner s = new Scanner(System.in);
		  q = s.nextLine();
		  tfc.question=q;
		  
		  System.out.println("True or False ?");
		  String choice;
		  choice = s.nextLine();
		  
		
		  if (choice.equals("true"))
		  { 
			  boolean an[] = {true,false};
			  tfc.correct=an;
		    
		  }
		  else  if (choice.equals("false"))
		  {
			  { 
				  boolean an[] = {false,true};
				  tfc.correct=an;
			    
			  }
		  }
		  tf.content.add(tfc);
		  
	}
	
	Games.add(tf);
	System.out.println("Your game is successfully added");
}


public void AddMCQ (){
Scanner s = new Scanner(System.in);
	
	System.out.println("Game name: ");
	String n;
	n = s.nextLine();
	
	System.out.println("Your name: ");
	String on;
	on = s.nextLine();
	
	System.out.println("Game category: ");
	String mc;
	mc = s.nextLine();
	
	MCQ mcq = new MCQ (n,0,on,"MCQ",mc);
	System.out.println("How many questions will be in your game?");
	  int numques; 
	  Scanner ss = new Scanner(System.in);
	  numques = ss.nextInt();
	  
	  for (int i=0 ; i<numques ; i++)
		{
			MCQContent mcq1 = new MCQContent();
			System.out.println("Enter question " + (i+1));
			  String q;
			  Scanner a = new Scanner(System.in);
			  q = a.nextLine();
			  mcq1.question=q;
		
			  for (int k=0 ; k<4 ; k++)
			  {
				  System.out.println("Enter answers: " + (k+1));
				  String an;
				  Scanner b = new Scanner(System.in);
				  an = b.nextLine();
				  mcq1.answers[k]=an;
			  }
			  
			  System.out.println("which choice is correct ?");
			  int  choice;
			  Scanner c = new Scanner(System.in);
			  choice = c.nextInt();
			  
			  if (choice == 1){
				  boolean answers []= {true,false,false,false};
				  mcq1.correct = answers;
			  }
			  else if (choice == 2){
				  boolean answers []= {false,true,false,false};
				  mcq1.correct = answers;
			  }
			  else if (choice == 3){
				  boolean answers []= {false,false,true,false};
				  mcq1.correct = answers;
			  }
	  
			  else {
				  boolean answers []= {false,false,false,true};
				  mcq1.correct = answers;
				 }
	          
			  mcq.content.add(mcq1);
	
}
	  Games.add(mcq);
		System.out.println("Your game is successfully added");
}


//Game retrive_game(){
//	return null;   // we must return variable of type game
//	
//}

}
