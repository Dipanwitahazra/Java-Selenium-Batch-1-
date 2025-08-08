package wd;

public class CustomerReceipt {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Customer: Riya\n");
		sb.append("Item: Book\n");
		sb.append("Quantity: 3\n");
		sb.append("Price: Rs 200\n");
		sb.append("Total: Rs600\n");
		sb.insert(0,  "BOOK STORE\n");
		int itemIndex = sb.indexOf("Book");
		if(itemIndex != -1) {
			sb.replace(itemIndex,  itemIndex + 4, "Notebook");
			
		}
		
		System.out.println("....Final Receipt....\n" + sb.toString());
		System.out.println("\nReversed:");
		System.out.println(sb.reverse());
		
		
		// TODO Auto-generated method stub

	}

}
