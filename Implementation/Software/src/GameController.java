
import java.util.Scanner;

public class GameController
{

	
	Game_Database GDB;
	public Game_Database getGDB() {
		return GDB;
	}


	public void setGDB(Game_Database gDB) {
		GDB = gDB;
	}


 
 
 void PlayTF(TandF tf)
	{	  
		  for (int i=0 ; i<tf.content.size() ; i++)
		  {
			  
			  System.out.println(tf.content.get(i).question);
			  System.out.println("1) True");
			  System.out.println("2) False");
			  
			  int answer;
			  Scanner s = new Scanner(System.in);
			  answer = s.nextInt();
			 
			  
			  for (int j=0 ; j<2 ; j++)
			  {		  
			 if	(tf.content.get(i).correct[answer-1])
			 {
				 System.out.println("Correct answer");
				 tf.score++;
				  System.out.println("Your Score: " + tf.score);
				
				 break;
			 }
			 else
			 { System.out.println("Wrong answer!");
			  System.out.println("Your Score: " + tf.score);
			 break; }
			  }
	  }
		  System.out.println("Your game is over ... Your final score is: " + tf.score);
		  System.out.println("Redirecting to your Homepage");
	}
 
 void PlayMCQ (MCQ mcq)
 {
	  for (int i=0 ; i<mcq.content.size() ; i++)
	  {
		  System.out.println(mcq.content.get(i).question);
		  
		  for (int j=0 ; j<4 ; j++)
		  {
			  System.out.println(j+1 + ") " + mcq.content.get(i).answers[j]);
		  }
		  
		  int answer;
		  Scanner s = new Scanner(System.in);
		  answer = s.nextInt();
		  
		  for (int j=0 ; j<4 ; j++)
		  {
			  
		  if(mcq.content.get(i).correct[answer-1])
		  {
			  System.out.println("Correct answer");
			  mcq.score++;
			  System.out.println("Your Score: " + mcq.score);
			  break;
		  }
		  
		  else
			 { System.out.println("Wrong answer!");
			 System.out.println("Your Score: " + mcq.score);
			   break;}
		  }
		}
	  System.out.println("Your game is over ... Your final score is: " + mcq.score);
	  System.out.println("Redirecting to your Homepage");
	}
 

}

	  	

