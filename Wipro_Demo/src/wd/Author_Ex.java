package wd;
import java.util.Scanner;

class BookImplicit {
    String title;
    String author;

    void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class BookExplicit {
    String title;
    String author;

    BookExplicit() {
        title = "Unknown Title";
        author = "Unknown Author";
        System.out.println("Book: " + title + " by " + author);
    }

    void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

public class Author_Ex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        BookImplicit b1 = new BookImplicit();
        System.out.print("Enter book title: ");
        b1.title = sc.nextLine();
        System.out.print("Enter author name: ");
        b1.author = sc.nextLine();
        System.out.println("Using implicit constructor:");
        b1.display();

       
        System.out.println("Using explicit constructor:");
        BookExplicit b2 = new BookExplicit();

        sc.close();
    }
}