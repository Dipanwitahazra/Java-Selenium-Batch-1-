package library.module;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Book {
	   private String title;
	   private String author;
	   private int year;

	    public Book(String title, String author, int year) {
	        this.title = title;
	        this.author = author;
	        this.year = year;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public int getYear() {
	        return year;
	    }

	    
	    public String toString() {
	        return "Title: " + title + ", Author: " + author + ", Year: " + year;
	    }
	}

	public class LibraryManagement {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        List<Book> library = new ArrayList<>();

	     
	        library.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
	        library.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
	        library.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997));
	        library.add(new Book("The Da Vinci Code", "Dan Brown", 2003));

	        while (true) {
	            System.out.println("\n--- Library Menu ---");
	            System.out.println("1. Add Book");
	            System.out.println("2. View All Books");
	            System.out.println("3. Search by Title");
	            System.out.println("4. Search by Author");
	            System.out.println("5. Sort by Title");
	            System.out.println("6. Sort by Author");
	            System.out.println("7. Exit");
	            System.out.print("Choose option: ");
	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Title: ");
	                    String title = sc.nextLine();
	                    System.out.print("Enter Author: ");
	                    String author = sc.nextLine();
	                    System.out.print("Enter Year: ");
	                    int year = sc.nextInt();
	                    sc.nextLine();
	                    library.add(new Book(title, author, year));
	                    System.out.println("Book added successfully!");
	                    break;

	                case 2:
	                    System.out.println("\n--- All Books ---");
	                    library.forEach(System.out::println);
	                    break;

	                case 3:
	                    System.out.print("Enter Title to Search: ");
	                    String searchTitle = sc.nextLine();
	                    library.stream()
	                           .filter(b -> b.getTitle().equalsIgnoreCase(searchTitle))
	                           .forEach(System.out::println);
	                    break;

	                case 4:
	                    System.out.print("Enter Author to Search: ");
	                    String searchAuthor = sc.nextLine();
	                    library.stream()
	                           .filter(b -> b.getAuthor().equalsIgnoreCase(searchAuthor))
	                           .forEach(System.out::println);
	                    break;

	                case 5:
	                    Collections.sort(library, Comparator.comparing(Book::getTitle));
	                    System.out.println("\n--- Sorted by Title ---");
	                    library.forEach(System.out::println);
	                    break;

	                case 6:
	                    Collections.sort(library, Comparator.comparing(Book::getAuthor));
	                    System.out.println("\n--- Sorted by Author ---");
	                    library.forEach(System.out::println);
	                    break;

	                case 7:
	                    System.out.println("Exiting... ");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice, try again.");
	            }
	        }
	    }
	}
