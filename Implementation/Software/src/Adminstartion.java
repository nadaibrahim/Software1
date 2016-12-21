
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


 class Adminstartion {
	
	public Adminstartion() {
		super();
		// TODO Auto-generated constructor stub
	}

	 userDatabase udb = new userDatabase();
	public  void signUp ()
	{  

		Account userAccount = new Account();
		Scanner in = new Scanner (System.in);
		System.out.println("Do you want to sign up as Teacher or Student");
		userAccount.userType = in.next();
		System.out.println("Enter your username");
		userAccount.username = in.next();
		System.out.println("Enter your Email");
		userAccount.Email = in.next();
		
		
		if (userAccount.userType.equals("Teacher")){
			while (!userAccount.Email.contains(".edu"))
			{
				System.out.print("this email has a wrong email format enter another one, it must contain .edu");
				userAccount.Email = in.next();
			}
			
		}
		
		System.out.println("Enter valid password");
		userAccount.password =in.next();
		System.out.println("confirm your password");
		userAccount.confirmpassword = in.next();
		while (!userAccount.password.equals(userAccount.confirmpassword)) //check password
		{
			System.out.println("Enter you password again");
			userAccount.password =in.next();
			userAccount.confirmpassword = in.next();
			
		}
		if(userAccount.userType.equals("student"))
		{
			Student s = new Student(userAccount);
			//udb.users ;
			udb.users.add(s);
			System.out.println("student signup success");
		}
		else if(userAccount.userType.equals("teacher"))
		{
			Teacher s = new Teacher(userAccount);
			//udb.users ;
			udb.users.add(s);
			System.out.println("teacher signup success");
		}
			
		
	}	
	

	public  String login() throws FileNotFoundException
	{
		boolean found = false;
		Account userLogin = new Account();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your username");
		
		String username  = in.nextLine();
		
		userLogin.username = username;
		
		System.out.println("Enter your password");
		userLogin.password = in.nextLine();
		
		String password = userLogin.password;
		
		for (int i=0 ; i<udb.users.size() ; i++)
		{
			if(username.equals(udb.users.get(i).a.username))
			{
				if(password.equals(udb.users.get(i).a.password))
				{
					System.out.println("Successfully logged in");
					found = true;
					
												
				}
			}
		
		}
 
		
		 if (found == false)
		 { System.out.println("Wrong username/password"); }
		
		
			 return username;

	}	
	

	

}

