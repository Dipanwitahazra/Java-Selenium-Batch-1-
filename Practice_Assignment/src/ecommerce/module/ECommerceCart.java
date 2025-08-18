package ecommerce.module;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ECommerceCart {
	  public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);

	    
	        Map<String, Double> priceList = new HashMap<>();
	        priceList.put("Laptop", 70000.0);
	        priceList.put("Phone", 30000.0);
	        priceList.put("Headphones", 3000.0);
	        priceList.put("Mouse", 800.0);
	        priceList.put("Keyboard", 2000.0);

	     
	        Map<String, Integer> cart = new HashMap<>();

	        while (true) {
	            System.out.println("\n--- E-Commerce Cart Menu ---");
	            System.out.println("1. View Products");
	            System.out.println("2. Add to Cart");
	            System.out.println("3. View Cart & Bill");
	            System.out.println("4. Exit");
	            System.out.print("Choose option: ");
	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1:
	                    System.out.println("\n--- Available Products ---");
	                    priceList.forEach((item, price) -> 
	                        System.out.println(item + " - Rs." + price));
	                    break;

	                case 2:
	                    System.out.print("Enter product name: ");
	                    String product = sc.nextLine();
	                    if (priceList.containsKey(product)) {
	                        System.out.print("Enter quantity: ");
	                        int qty = sc.nextInt();
	                        sc.nextLine();
	                        cart.put(product, cart.getOrDefault(product, 0) + qty);
	                        System.out.println(qty + " " + product + "(s) added to cart.");
	                    } else {
	                        System.out.println("Product not found!");
	                    }
	                    break;

	                case 3:
	                    if (cart.isEmpty()) {
	                        System.out.println("Cart is empty!");
	                        break;
	                    }

	                    System.out.println("\n--- Your Cart ---");
	                    double total = 0;
	                    for (Map.Entry<String, Integer> entry : cart.entrySet()) {
	                        String item = entry.getKey();
	                        int qty = entry.getValue();
	                        double price = priceList.get(item) * qty;
	                        total += price;
	                        System.out.println(item + " x " + qty + " = Rs." + price);
	                    }

	                    double gst = total * 0.18;  
	                    double grandTotal = total + gst;

	                    System.out.println("\nSubtotal: Rs." + total);
	                    System.out.println("GST (18%): Rs." + gst);
	                    System.out.println("Total Payable: Rs." + grandTotal);
	                    break;

	                case 4:
	                    System.out.println("Exiting... Thank you for shopping!");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice, try again.");
	            }
	        }
	  }
}
	