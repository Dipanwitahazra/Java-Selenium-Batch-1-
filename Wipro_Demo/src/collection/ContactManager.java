package collection;
import java.util.*;


public class ContactManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> contacts = new TreeSet<>();

        while (true) {
            System.out.println("\n Contact Manager");
            System.out.println("1. Add Contact");
            System.out.println("2. Show All Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter Contact Name: ");
                String name = sc.nextLine().trim();
                if (contacts.contains(name)) {
                    System.out.println("Contact already exists.");
                } else {
                    contacts.add(name);
                    System.out.println("Contact added.");
                }

            } else if (choice == 2) {
                if (contacts.isEmpty()) {
                    System.out.println("No contacts yet.");
                } else {
                    System.out.println("\nContact List:");
                    for (String name : contacts) {
                        System.out.println("- " + name);
                    }
                }

            } else if (choice == 3) {
                System.out.println(" Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}

