package wd;

public class OnlineOrderTracking {

	public static void main(String[] args) {
		byte deliveryAttempts = 2;
		int pincode = 721602;                 
        int orderID = 4652819;                  
        long trackingNumber = 987654321099L;    
        float deliveryCharge = 55.75f;          
        double totalBill = 699.99;              
        char paymentMode = 'O';
        boolean isDelivered = false;         
        System.out.println(".... Online Order Tracking Details ....");
        System.out.println("Order ID             : " + orderID);
        System.out.println("Tracking Number      : " + trackingNumber);
        System.out.println("Delivery Attempts    : " + deliveryAttempts);
        System.out.println("Pincode              : " + pincode);
        System.out.println("Delivery Charge      : Rs" + deliveryCharge);
        System.out.println("Total Bill           : Rs" + totalBill);
        System.out.println("Payment Mode         : " + paymentMode);
        System.out.println("Is Delivered?        : " + isDelivered);
		// TODO Auto-generated method stub
        if (isDelivered) {
            System.out.println("Order has been delivered successfully.");
        } 
        else {
            System.out.println(" Order is still in transit.");
        }
    }
}

	
