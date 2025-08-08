package wd;
import java.util.Scanner;

		public class LoginSystem {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        final String correctUsername = "Dipanwita";
		        final String correctPassword = "pass123";

		        int attempts = 0;
		        boolean success = false;

		        do {
		            System.out.print("Enter username: ");
		            String username = sc.nextLine();

		            System.out.print("Enter password: ");
		            String password = sc.nextLine();

		            if (username.equals(correctUsername) && password.equals(correctPassword)) {
		                System.out.println("Login successful. Welcome!");
		                success = true;
		                break;
		            } else {
		                attempts++;
		                System.out.println("Incorrect username or password. Attempts left: " + (3 - attempts));
		            }
		        } while (attempts < 3);

		        if (!success) {
		            System.out.println("Account locked. Too many failed attempts.");
		        }

		        sc.close();
		    }
		
		// TODO Auto-generated method stub

		}

