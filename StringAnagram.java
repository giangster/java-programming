// Create a program called StringAnagram that has a method called isAnagram that determines whether two strings are anagrams 
// of each other.

// The main method first inputs two strings from the user and then calls the method isAnagram with the inputted strings. 
// Finally, the main method prints either "Anagram!" or "No anagram.".

// Rules (in this exercise)

// The method isAnagram should allow only letters, whitespace, commas and dots in an anagram. If there are any other characters, 
// then the string cannot contain an anagram.
// The method should ignore all whitespace, commas and dots when it checks the text.
// If there are no letters in the text, then the text cannot be an anagram.
// Hints

// When some validation fails in a method, you can terminate the method execution immediately by executing a return statement.
// The replace method might be useful in removing those characters that should be ignored in anagram checking.
// Some sorting might simplify your algorithm...

// Example output:
// Enter first string: Astronomer
// Enter second string: Moon starer
// Anagram!
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String shibaInu = input.nextLine().toLowerCase();
        System.out.print("Enter second string: ");
        String akita = input.nextLine().toLowerCase();
        if (isAnnagram(shibaInu, akita) == true) {
            System.out.print("No anagram.");
        } else {
            System.out.print("Anagram!");
        }
        input.close();
    }

    private static boolean isAnnagram(String japdog1, String japdog2) {
        if (japdog1.matches(",\\w\\s\\.{1,}") == false || japdog2.matches(",\\w\\s\\.{1,}") == false) {
            return false;
        }
        japdog1 = japdog1.replaceAll("\\s+", "");
        japdog1 = japdog1.replaceAll(",", "");
        japdog1 = japdog1.replaceAll("\\.", "");

        japdog2 = japdog2.replaceAll("\\s+", "");
        japdog2 = japdog2.replaceAll(",", "");
        japdog2 = japdog2.replaceAll("\\.", "");
        if (japdog1.length() != japdog2.length()) {
            return false;
        }
        char[] japDog1 = japdog1.toCharArray();
        char[] japDog2 = japdog2.toCharArray();
        Arrays.sort(japDog1);
        Arrays.sort(japDog2);
        if (Arrays.equals(japDog1, japDog2)) {
            return true;
        } else {
            return false;
        }
    }

}