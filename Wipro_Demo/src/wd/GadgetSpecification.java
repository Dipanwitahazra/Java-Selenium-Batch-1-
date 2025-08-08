package wd;

public class GadgetSpecification {

	public static void main(String[] args) {
		byte batteryHealth = 94;
		short warrantyMonths = 24;
		int modelNumber = 10365;                  
	    long serialNumber = 987654321012345L;     
	    float screenSize = 6.5f;                  
	    double price = 45999.99;                  
	    char energyRating = 'A';                  
	    boolean is5GCompatible = true;
	    System.out.println(".... Gadget Specification Summary ....");
        System.out.println("Model Number         : " + modelNumber);
        System.out.println("Serial Number        : " + serialNumber);
        System.out.println("Screen Size (inches) : " + screenSize);
        System.out.println("Warranty (Months)    : " + warrantyMonths);
        System.out.println("Battery Health (%)   : " + batteryHealth + "%");
        System.out.println("Price                : Rs" + price);
        System.out.println("Energy Rating        : " + energyRating);
        System.out.println("5G Compatible?       : " + is5GCompatible);
        if (batteryHealth > 80 && is5GCompatible) {
        	System.out.println("Recommended for purchase.");
        }
        else {
        	System.out.println("Check specifications before buying.");
        }

		
		// TODO Auto-generated method stub

	}

}
