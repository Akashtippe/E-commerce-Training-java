package e_commerce;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
	

	private Product[] cart;
	private int cartSize;

	public Customer(int userId, String username, String password, String email) {
		super(userId, username, password, email);
		// TODO Auto-generated constructor stub
		this.cart=new Product[8];
		this.cartSize=0;
	}

	@Override
	public void viewProfile() {
		System.out.println("Customer Profile - Username: " + getUsername() + ", Email: " + getEmail());
	}

	@Override
	public void updateProfile(String newUsername, String newEmail, String newPassword) {
		// TODO Auto-generated method stub
		System.out.println("Updating profile for"+getUsername());
		System.out.println("Profile updated");
	}

	public void addToCart(Product product) {
		if (cartSize < cart.length) {
			cart[cartSize++] = product;
			System.out.println(product.getProductName() + " added to cart.");
		} else {
			System.out.println("Cart is full.");
		}
	}

	public void removeFromCart(Product product) {
		boolean found = false;
		for (int i = 0; i < cartSize; i++) {
			if (cart[i].equals(product)) {
				found = true;
				for (int j = i; j < cartSize - 1; j++) {
					cart[j] = cart[j + 1];
				}
				cart[--cartSize] = null;
				System.out.println(product.getProductName() + " removed from cart.");
				break;
			}
		}
		if (!found) {
			System.out.println("Product not found in cart.");
		}
	}

	public void checkout() {
		System.out.println("Checking out with " + cartSize + " items.");
		cart = new Product[10];
		cartSize = 0;
	}

	

}
