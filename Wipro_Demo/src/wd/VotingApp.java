package wd;
import java.util.Scanner;
class Voter {
    private String name;
    private int age;
    private boolean hasVoted;

    
    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
        this.hasVoted = false;
    }

   
    public String getName() {
        return name;
    }

    
    public boolean isEligible() {
        return age >= 18;
    }

    
    public void vote() {
        if (hasVoted) {
            System.out.println("You have already voted.");
        } else if (isEligible()) {
            System.out.println("Vote recorded successfully!");
            hasVoted = true;
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}

public class VotingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Voter v = new Voter();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        v.setDetails(name, age);

        System.out.println("\nWelcome, " + v.getName());
        v.vote(); 
        v.vote();
        
    }
}


