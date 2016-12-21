import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		

            	Adminstartion adm = new Adminstartion ();

           	
           	Account a = new Account();
           	a.setEmail("marwa@hotmail.com");
           	a.setPassword("123a");
           	a.setUsername("marwa11");
           	a.setUserType("student");
           	User u = new User(a);
           	
           	Account aa = new Account();
        	aa.setEmail("marwa@hotmail.com");
           	aa.setPassword("123a");
           	aa.setUsername("marwa112");
           	aa.setUserType("teacher");
           	User uu = new User(aa);
           	
           	adm.udb.users.add(u);
           	adm.udb.users.add(uu);
           	
            MCQ g = new MCQ("MCQ-Adding",0 , "nada","MCQ","Math");
            String ans1[] = {"1","2","3","4"};
            boolean correct1[] = {false,true,false,false};
            MCQContent mc1 = new MCQContent();
            mc1.question= " 1+1 ="; 
            mc1.answers = ans1;  
            mc1.correct = correct1;
            
            g.content.add(mc1);
            Game_Database gdb = new Game_Database();
            gdb.Games.add(g);
            GameController gc = new GameController();
            
            //gc.PlayMCQ(g);
           
            TandF t = new TandF("T/F-Adding", 0 , "nada","T/F" , "Math");
            boolean an[] = {true,false};
            
            TrueAndFalseContent tt = new TrueAndFalseContent();
            tt.correct=an;
            tt.question=" 1 + 1 = 2 ?";
            
            t.content.add(tt);
            gdb.Games.add(t);
            
           	
           	while (true)
           	{
           	    boolean logged = false;
           	    boolean exit = false;
           		System.out.println("1- Signup");
           		System.out.println("2- Login");
           		System.out.println("3- Exit");
           		
           		int choice1;
           		Scanner s = new Scanner(System.in);
           		choice1 = s.nextInt();
           		
           		 if (choice1==3)
           		{
           			System.out.println("System is shutting down");
           			return;
           		}
           		 else if(choice1==1)
           		{
           			adm.signUp();
           			
           			logged = true;
           		}
           		else if (choice1==2)
           		{
           			String acc = adm.login();
           			
           			logged = true;
           			
           			
                    while (logged && !exit)  // as long as the user is logged in the system is operating
                    {  
                    	System.out.println();
                    	System.out.println("Homepage:");
                    	System.out.println();
           			for (int i=0 ; i< adm.udb.users.size() ; i++)
           			{
           				
           			if(acc.equals(adm.udb.users.get(i).a.username))
           			{
           				if(adm.udb.users.get(i).a.userType.equals("student"))
           				{
           					System.out.println("1- Play game");
           					System.out.println("2- Exit");
           					int choice2;
           					choice2 = s.nextInt();
           					
           					if (choice2==1)
           					{
           	                 
           	                 for (int j=0 ; j<gdb.Games.size() ; j++)  //displaying games
           	                 {
           	                 System.out.println( "Game " + (j+1) + " " + gdb.Games.get(j).name + ", Category: " + gdb.Games.get(j).maincat );
           	              
           	                 }
           	             	              
           	              String choice;
           	              Scanner ss = new Scanner(System.in);
           	              System.out.println();
           	              System.out.println("Enter game NAME: ");
           	           	  choice = ss.nextLine();
           	           	  
           	           	  int k = gdb.Search(choice);
           	                 
           	           
           	           	   if(gdb.Games.get(k).category.equals("T/F"))
           	           		  { 
           	           		  
           	           		   gc.PlayTF((TandF)gdb.Games.get(k));
           	           		  }
           	           	   else if (gdb.Games.get(k).category.equals("MCQ"))
           	           	   {
           	           		 gc.PlayMCQ((MCQ)gdb.Games.get(k));
           	           	   }
           					}
           					else if (choice2==2) { System.out.println("System is shutting down"); return;}
           				}
           				else if (adm.udb.users.get(i).a.userType.equals("teacher"))
           				{
           					
           					System.out.println("1- Play game");
           					System.out.println("2- Add game");
           					System.out.println("3- Exit");
           					
           					int choice3;
           					choice3 = s.nextInt();
           					
           					if (choice3==1)
           					{
           	                 
           	                 for (int j=0 ; j<gdb.Games.size() ; j++)  //displaying games
           	                 {
           	                 System.out.println( "Game " + (j+1) + " " + gdb.Games.get(j).name);
           	              
           	                 }
           	             	              
           	              String choice;
           	              Scanner ss = new Scanner(System.in);
           	              System.out.println();
           	              System.out.println("Enter game NAME: ");
           	           	  choice = ss.nextLine();
           	           	  
           	           	  int k = gdb.Search(choice);
           	                 
           	           
           	           	   if(gdb.Games.get(k).category.equals("T/F"))
           	           		  { 
           	           		  
           	           		   gc.PlayTF((TandF)gdb.Games.get(k));
           	           		  }
           	           	   else if (gdb.Games.get(k).category.equals("MCQ"))
           	           	   {
           	           		 gc.PlayMCQ((MCQ)gdb.Games.get(k));
           	           	   }
           							
           					
           				}
           					else if (choice3==2)
           					{
           						System.out.println("Choose Category");
           						
               				
           						System.out.println("1- T/F game");
               					System.out.println("2- MCQ game");
               					int catno;
               					catno = s.nextInt();
           					
               					if(catno == 1){
               						gdb.AddTF();
               					}
               					
               					else {
               						
               						gdb.AddMCQ();
               					}
           					}
           					else if (choice3==3) {System.out.println("System is shutting down"); return;}
           					}
           			}
           			}
                    }	
           		}
           		
           		
           	}
           	
           	
         
           	
	}

}
