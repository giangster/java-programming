import java.util.Scanner;
import java.util.Arrays;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String bird = input.nextLine().toUpperCase();
        if (isPalindrome(bird) == true) {
            System.out.print("The text is a palindrome.");
        } else {
            System.out.print("No palindrome");
        }
        input.close();
    }

    private static boolean isPalindrome(String str) {
        if (str.matches("[A-Z,:;?!\\-'\"\\s\\.]{1,}") == false) {
            return false;
        }
        str = str.replaceAll("[,:;'-?!\\s\\.\"]+", "");
        if (str.length() < 1) {
            return false;
        }
        if (str.length() % 2 == 0) {
            return false;
        }
        String[] parts = { str.substring(0, (str.length() - 1) / 2), str.substring((str.length() + 1) / 2) };
        String substr1 = parts[0];
        String substr2 = parts[1];
        char[] substrArrays1 = substr1.toCharArray();
        char[] substrArrays2 = substr2.toCharArray();
        Arrays.sort(substrArrays1);
        Arrays.sort(substrArrays2);
        if (Arrays.equals(substrArrays1, substrArrays2)) {
            return true;
        } else {
            return false;
        }
    }
}