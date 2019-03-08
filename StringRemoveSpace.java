// Create a program called StringRemoveSpace that has a method called removeExtraSpace.The method removes all extra whitespace 
// from a string.The method should accept a string as its input parameter,process the string content and return a new string.

// The main method first inputs a string from the user and then calls the method removeExtraSpace with the inputted string.
// Finally,the main method prints the result enclosed in double quotes.

// In this exercise,"extra whitespace"means leading/trailing whitespace and more than one whitespace between two non-whitespace 
// characters.

// NB!Viope does not allow test cases with leading/trailing whitespace.Please make sure that your program works correctly with 
// the following input:

// Enter a string:Hello!"Hello!"

// Example output:Enter a string:1+2=3"1 + 2 = 3"

import java.util.Scanner;

public class StringRemoveSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String miau = input.nextLine();
        System.out.print('"' + removeExtraSpace(miau) + '"');
        input.close();
    }

    private static String removeExtraSpace(String awesomeCats) {
        awesomeCats = awesomeCats.trim();
        awesomeCats = awesomeCats.replaceAll("\\s{2,}", " ");
        return awesomeCats;
    }
}