package wd;

public class Product {
	String productName;// instance variable
	static String company = "Innovatech"; // static variable
	 public void showDetails() {
		 double price = 1499.99; // Local variable
		 System.out.println("Product Name: " + productName);
	        System.out.println("Price: Rs" + price);
	        System.out.println("Company: " + company);
	    }

	    
	       

	 

	public static void main(String[] args) {

        Product p = new Product();
        p.productName = "Headphones";
        p.showDetails();
    

		// TODO Auto-generated method stub

	}

}
