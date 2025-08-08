package wd;

public class MobileRechargePLan {

	public static void main(String[] args) {
		int planCode = 3;
		// TODO Auto-generated method stub
		System.out.println(".... Mobile Recharge Plan Details ....");
		switch (planCode) {
		case 1:
			 System.out.println("Plan 1 selected");
             System.out.println("Price        : Rs199");
             System.out.println("Data         : 1GB/day");
             System.out.println("Validity     : 28 days");
             System.out.println("Benefits     : Unlimited Calls + 100 SMS/day");
             break;
             
		case 2:
			System.out.println("Plan 2 selected"); 
				System.out.println("Price      : Rs399" );
				System.out.println("Data       : 1.5GB/day");
				System.out.println("Validity   : 56 days");
				System.out.println("Benefits   : Unlimited Calls + 100 SMS/day + Hotstar Mobile");
				break;
		
		case 3:
			 System.out.println("Plan 3 Selected");
             System.out.println("Price        : Rs599");
             System.out.println("Data         : 2GB/day");
             System.out.println("Validity     : 84 days");
             System.out.println("Benefits     : Unlimited Calls + 100 SMS/day + Amazon Prime Video");
             break;

         case 4:
             System.out.println("Plan 4 Selected");
             System.out.println("Price        : Rs999");
             System.out.println("Data         : 3GB/day");
             System.out.println("Validity     : 365 days");
             System.out.println("Benefits     : All-in-one Annual Pack");
             break;
             
          default:
        	  System.out.println("Invalid Plan Code.Please choose 1 to 4.");
		
		}

	}

}
