package wd;
import java.util.Scanner;

public class ChatBot {
	public static String getReply(String userMessage) {
		if (userMessage.equalsIgnoreCase("hi"))
			return "Hello there!";
		else if (userMessage.equalsIgnoreCase("how are you"))
			return "I'm just a bot, but I'm doing great!";
        else if (userMessage.equalsIgnoreCase("bye"))
            return "Goodbye! See you again.";
        else
            return "Sorry, I don't understand.";
    }
public static void printUserMessage(String message) {
        System.out.println("You: " + message);
    }

    
    public static void welcome() {
        System.out.println(" Welcome to SimpleChatBot!");
        System.out.println("Type something (type 'bye' to exit):");
    }

 
    public static void showBotReply(String reply) {
        System.out.println("Bot: " + reply);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        welcome(); 

        while (true) {
            System.out.print("> ");
            String userInput = sc.nextLine();

            printUserMessage(userInput); 

            String reply = getReply(userInput); 

            

            if (userInput.equalsIgnoreCase("bye")) {
                break;
            }
        }
    }
}

		
	