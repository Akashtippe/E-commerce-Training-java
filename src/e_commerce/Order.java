package e_commerce;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order implements OrderActions{
	 private int orderId;
	    private int customerId;
	    private Date orderDate;
	    private String orderStatus;
	    private Product[]orderProduct;
	    
	    


	public Order(int orderId, int customerId, Date orderDate, String orderStatus,
			Product[]orderProduct ) {
			super();
			this.orderId = orderId;
			this.customerId = customerId;
			this.orderDate = orderDate;
			this.orderStatus = orderStatus;
			this.orderProduct = orderProduct;
		}
	

	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	
	public Product[] getOrderProduct() {
		return orderProduct;
	}


	public void setOrderProduct(Product[] orderProduct) {
		this.orderProduct = orderProduct;
	}


	public void getOrderDetails() {
		System.out.println("orderId:"+orderId+", customerId:"+customerId+", orderDate"+orderDate+
	", orderStatus:"+orderStatus);
		System.out.println("Ordered products:");
		for(Product product :orderProduct) {
			System.out.println(product.getProductDetails());
		}
	}


	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Order"+orderId+"placed");
	}

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		setOrderStatus("cancelled");
		System.out.println("Order"+orderId+"cancelled");
	}

	@Override
	public void trackorder() {
		// TODO Auto-generated method stub
		System.out.println("Order"+orderId+"is currently"+orderStatus+".");
	}

}
