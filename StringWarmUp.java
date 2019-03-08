
// Create a program called StringWarmUp that first inputs a string from the user. 
// Then the program prints the following: the length of the string, the string in all capital letters, 
// and the string in all small letters.
// Example output:
// Enter a string: From JavaScript to Java
// 23 characters
// FROM JAVASCRIPT TO JAVA
// from javascript to java
import java.util.Scanner;

public class StringWarmUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String exampleText = input.nextLine();
        System.out.println(exampleText.length() + " characters");
        System.out.println(exampleText.toUpperCase());
        System.out.println(exampleText.toLowerCase());
    }
}