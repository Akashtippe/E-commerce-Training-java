package e_commerce;

public class Admin extends User{

	
   public Admin(int userId, String username, String password, String email) {
		super(userId, username, password, email);
		// TODO Auto-generated constructor stub
	}
public void addProduct(Product product) {
		System.out.println("Product"+product.getProductName()+"added.");
	}
	public void removeProduct(Product product) {
		System.out.println("Product"+product.getProductName()+"removed.");
	}
	public void updateProduct(Product product) {
		System.out.println("Product"+product.getProductName()+"updated.");
	}


	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		System.out.println("Admin Profile - Username: " + getUsername() + ", Email: " + getEmail());
	}
	@Override
	public void updateProfile(String newUsername, String newEmail, String newPassword) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("Updating profile for"+getUsername());
				System.out.println("Profile updated");
	}

	

}
