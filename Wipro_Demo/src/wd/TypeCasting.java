package wd;

public class TypeCasting {


    public static void main(String[] args) {
        
        
        int intValue = 10;
        double doubleValue = intValue; 
        
        System.out.println("Implicit Type Casting:");
        System.out.println("intValue: " + intValue); 
        System.out.println("doubleValue: " + doubleValue); 
        
        System.out.println(); 

       
        double anotherDoubleValue = 15.75;
        int anotherIntValue = (int) anotherDoubleValue;

        System.out.println("Explicit Type Casting:");
        System.out.println("anotherDoubleValue: " + anotherDoubleValue); 
        System.out.println("anotherIntValue: " + anotherIntValue); 
    }
}

	