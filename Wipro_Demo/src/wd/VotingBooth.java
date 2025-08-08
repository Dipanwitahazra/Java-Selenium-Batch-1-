package wd;

public class VotingBooth {

	public static void main(String[] args) {
		for (int age = 16; age <= 25; age++) {
            if (age >= 18)
                System.out.println("Age " + age + ": Eligible to vote ");
            else
                System.out.println("Age " + age + ": Not eligible ");
        }
    }
}
