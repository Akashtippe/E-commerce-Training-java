package e_commerce;

public abstract class User {
	
	    // Fields
	    private int userId;
	    private String username;
	    private String password;
	    private String email;

	    // Constructor
	    public User(int userId, String username, String password, String email) {
	        this.userId = userId;
	        this.username = username;
	        this.password = password;
	        this.email = email;
	    }

	    // Getter and Setter methods
	    public int getUserId() {
	        return userId;
	    }

	    public void setUserId(int userId) {
	        this.userId = userId;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    // Concrete methods
	    public void login() {
	        System.out.println(username + " has logged in.");
	    }

	    public void logout() {
	        System.out.println(username + " has logged out.");
	    }

	    // Abstract methods
	    public abstract void viewProfile();
	    public abstract void updateProfile(String newUsername,String newEmail,String newPassword);
	

}
