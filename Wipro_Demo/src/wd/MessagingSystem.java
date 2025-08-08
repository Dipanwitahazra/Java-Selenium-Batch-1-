package wd;
import java.util.Scanner;
class MessageSender{
	void sendMessage(String message) {
		System.out.println("Sending message: " + message);
	}
}
class EmailSender extends MessageSender{
	void sendMessage(String message) {
		System.out.println("Sending Email: " + message);
		
	}
}
class SmsSender extends MessageSender{
	void sendMessage(String message) {
		System.out.println("Sending SMS: " + message);
	}
}
public class MessagingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter message to send: ");
		String message = sc.nextLine();
		 System.out.print("Send via(email/sms): ");
		 String method = sc.nextLine().toLowerCase();
		 
		 
		  }
		
		
				
		// TODO Auto-generated method stub

	}


