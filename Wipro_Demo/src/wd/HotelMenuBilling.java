package wd;

public class HotelMenuBilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itemCode = 4;       
        int quantity = 2;       
        String itemName = "";
        int pricePerItem = 0;
        System.out.println("Welcome to Hotel GoFoodie!");
        System.out.println("Menu:");
        System.out.println("1. Burger         - Rs79");
        System.out.println("2. Momo           - Rs50");
        System.out.println("3. Fried Rice     - Rs80");
        System.out.println("4. Chilli Chicken - Rs200");
        System.out.println("5. Ice Cream      - Rs40");

        switch (itemCode) {
        case 1:
            itemName = "Burger";
            pricePerItem = 79;
            break;
        case 2:
            itemName = "Momo";
            pricePerItem = 50;
            break;
        case 3:
            itemName = "Fried Rice";
            pricePerItem = 80;
            break;
        case 4:
            itemName = "Chilli Chicken";
            pricePerItem = 200;
            break;
        case 5:
            itemName = "Ice Cream";
            pricePerItem = 40;
            break;
        default:
            System.out.println("Invalid item code!");
            return;
    }

    int total = pricePerItem * quantity;
    
    System.out.println("\nOrder Summary:");
    System.out.println("Item Selected: " + itemName);
    System.out.println("Quantity     : " + quantity);
    System.out.println("Unit Price   : Rs" + pricePerItem);
    System.out.println("Total Bill   : Rs" + total);
}
}

	
