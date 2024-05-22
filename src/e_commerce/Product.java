package e_commerce;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	private String category;
	
	
	
	
	public Product(int productId, String productName, double price, int quantity, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getProductDetails() {
		return("productId  :"+productId+", productName:"+productName+",price:"+price+
			", quantity:"+quantity+", category:"+category	);
		

	}
	public void updateQuantity(int newQuantity) {
		if(newQuantity >=0) {
			this.quantity=newQuantity;
			System.out.println("Quantity Updated to :"+ newQuantity);
		}else {
			System.out.println("Invalid Quantity. Quantity cannot be negative");
		}
	}
	public void updatePrice(double newPrice) {
		if(newPrice >=0) {
			this.price=newPrice;
			System.out.println("Quantity Updated to :"+ newPrice);
		}else {
			System.out.println("Invalid Quantity. Quantity cannot be negative");
		}
	}

}
