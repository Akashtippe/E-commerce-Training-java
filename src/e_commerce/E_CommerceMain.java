package e_commerce;

public class E_CommerceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogIn l1 = new LogIn();

		Customer customer1 = new Customer(1, "shubham patil ", "shubham@priti", "shubham@priti@gmail.com");
		Admin admin1 = new Admin(2, "Pranav Patil", "Pranav@bhakti", "Pranav@bhakti@gamil.com");

		l1.register(customer1);
		l1.register(admin1);

		Product product1 = new Product(1, "Laptop", 1000.0, 10, "Electronics");
		Product product2 = new Product(2, "Phone", 500.0, 20, "Electronics");
		Product product3 = new Product(3, "", 5000.0, 1, "Electronics");

		l1.login("shubham patil", "shubham@priti");
		if (l1.isAdmin()) {
			Admin admin = (Admin) l1.getLoggedInUser();
			admin.addProduct(product1);
			admin.addProduct(product2);
			admin.addProduct(product3);
			admin.updateProduct(product1);
		}
		l1.logout();

		l1.login("Pranav Patil", "Pranav@bhakti");
		if (l1.isCustomer()) {
			Customer customer = (Customer) l1.getLoggedInUser();
			customer.viewProfile();
			customer.addToCart(product1);
			customer.addToCart(product2);
			customer.checkout();

			Product[] orderedProducts = { product1, product2, product3 };
			Order order = new Order(1, customer.getUserId(), null, null, orderedProducts);
			order.placeOrder();
			order.trackorder();
			order.cancelOrder();
		}
		l1.logout();
	}


	}


