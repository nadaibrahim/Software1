

public class User {
	public User(Account a) {
		super();
		this.a = a;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	Account a; 
	
}


 class Teacher extends User 
{

	public Teacher(Account a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	
}
  class Student extends User 
 
 {

	public Student(Account a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	 
	
 }

