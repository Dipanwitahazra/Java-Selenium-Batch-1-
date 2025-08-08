package wd;

public class Str_Ex {

	public static void main(String[] args) {
		String str = "Hello Java World";
		String str2 = "hello java world";
		String str3 = "java";
		String str4 = "World";
		// TODO Auto-generated method stub
		System.out.println("Length: " + str.length());
		System.out.println("CharAt(6): " + str.charAt(6));
		System.out.println("Substring from 8: " + str.substring(8));
		System.out.println("Substring from 2 to 7: " + str.substring(2, 7));
		System.out.println("Concat: " + str.concat("Programming"));
	   
       
        System.out.println("IndexOf('J'): " + str.indexOf('J'));
        System.out.println("IndexOf(\"Java\"): " + str.indexOf("Java"));
        System.out.println("LastIndexOf(\"o\"): " + str.lastIndexOf("o"));
        System.out.println("Contains(\"Java\"): " + str.contains("Java"));
        System.out.println("StartsWith(\"  Hello\"): " + str.startsWith("  Hello"));
        System.out.println("EndsWith(\"World  \"): " + str.endsWith("World  "));

        
        System.out.println("ToLowerCase: " + str.toLowerCase());
        System.out.println("ToUpperCase: " + str.toUpperCase());

        
       
        char[] charArray = str.toCharArray();
        System.out.print("ToCharArray: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        int num = 100;
        System.out.println("String.valueOf(100): " + String.valueOf(num));

        byte[] bytes = str.getBytes();
        System.out.print("GetBytes: ");
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();

        
        String[] words = str.trim().split(" ");
        System.out.print("Split by space: ");
        for (String word : words) {
            System.out.print("[" + word + "] ");
        }
        System.out.println();

        String[] limitedSplit = str.trim().split(" ", 3);
        System.out.print("Split with limit=3: ");
        for (String word : limitedSplit) {
            System.out.print("[" + word + "] ");
        }
        System.out.println();

        String joined = String.join("-", "Java", "is", "awesome");
        System.out.println("Join: " + joined);

        
        

	}
}
