package wd;
import java.util.Scanner;
abstract class Notification{
	abstract void send(String message);
	
}
class EmailNotification extends Notification {
    
    void send(String message) {
        System.out.println("Email sent: " + message);
    }
}


class SmsNotification extends Notification {
    
    void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
class PushNotification extends Notification {
    
    void send(String message) {
        System.out.println("Push Notification sent: " + message);
    }
}
public class NotificationSystem {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        email.send("Your order has been shipped.");

        Notification sms = new SmsNotification();
        sms.send("Your OTP is 254186.");

        Notification push = new PushNotification();
        push.send("You have a new message.");
    }
}
