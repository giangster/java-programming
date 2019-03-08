// Create a program called StringBackwards that has a method called reverse that reverses a string. 
// The method should accept a string as its input parameter and return a reversed version of the string. 
// Hint: Maybe a loop and the charAt method are needed here.

// The main method first inputs a string from the user and then calls the method reverse with the inputted string. 
// Finally, the main method prints the reversed string.

// Example output:
// Enter a string: no remit
// timer on

import java.util.Scanner;

public class StringBackwards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        reserve(str);
        input.close();
    }

    private static void reserve(String string) {
        String stringReverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            stringReverse = stringReverse + string.charAt(i);
        }
        System.out.println(stringReverse);
    }
}
