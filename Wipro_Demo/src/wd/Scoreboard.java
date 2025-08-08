package wd;
import java.util.HashMap;
import java.util.Scanner;

public class Scoreboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> scores = new HashMap<>();
		System.out.print("Enter number of players: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter player " + i + " name: ");
			String name = sc.nextLine();
			System.out.print("Enter score for " + name + ": ");
			int score = sc.nextInt();
			sc.nextLine();
			
			scores.put(name,  score);
		
		}
		// TODO Auto-generated method stub
		for( int i = 1; i <= n; i++) {
			System.out.print("Enter name of player to add extra score: ");;
			String name = sc.nextLine();
			System.out.print("Enter extra score for " + name + ": ");;
			int extra = sc.nextInt();
			sc.nextLine();
			int currentScore = scores.get(name);
			scores.put(name,  currentScore + extra);
		}
		 System.out.println("\n...Final Scoreboard...");
		 for (String name : scores.keySet()) {
			 System.out.println(name + ": " + scores.get(name));
		 }
		 sc.close();
		}

	}


