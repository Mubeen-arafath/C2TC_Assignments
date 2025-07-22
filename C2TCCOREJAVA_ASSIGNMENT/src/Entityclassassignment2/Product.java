package Entityclassassignment2;

public class Product {

		// TODO Auto-generated method stub
		String productName;
	    int productId;
	    double price;

	    // Constructor to initialize product details
	    public Product(String productName, int productId, double price) {
	        this.productName = productName;
	        this.productId = productId;
	        this.price = price;
	    }

	    // Method to display product details
	    public void display() {
	        System.out.println("Product Name: " + productName);
	        System.out.println("Product ID: " + productId);
	        System.out.println("Price: $" + price);
	        System.out.println("----------------------");
	}

}
