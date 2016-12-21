
public class Account {   //contain sign up , log in and constructor 

	String username; 
	String Email;
	String password;
     String userType; 
     String confirmpassword;
	
    
	Account (String Email, String password, String userType , String username ,String confirmpassword){
    	 this.Email = Email;
    	 this.password = password;
    	 this.userType = userType ;
    	 this.username = username;
    	 this.confirmpassword = confirmpassword;
     }
     Account (){
    	 
    	 this.Email ="";
    	 this.password = "";
    	 this.userType ="";
    	 this.username ="";
    	 this.confirmpassword = "";

     }
     public String getConfirmpassword() {
 		return confirmpassword;
 	}
 	public void setConfirmpassword(String confirmpassword) {
 		this.confirmpassword = confirmpassword;
 	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
			
	
	
	
	
}

