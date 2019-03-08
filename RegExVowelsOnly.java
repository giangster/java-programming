// Create a program called RegExVowelsOnly that first inputs a string from the user. 
// If the string contains only Finnish vowels, the program should print "Vowels only". 
// Otherwise, the program should print "Not only vowels!". Check the string with a single regular expression.

// Example output:
// Enter a string: EU
// Vowels only

import java.util.Scanner;

public class RegExVowelsOnly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String chihuahua = input.nextLine();
        if (chihuahua.matches("[AEUYIOÅÄÖaeuyioåäö]{1,}")) {
            System.out.print("Vowels only");
        } else {
            System.out.print("Not only vowels!");
        }
        input.close();
    }
}