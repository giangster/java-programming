// Create a program called StringPasswordStrength that has a method called checkStrength that checks the strength 
// of a password. The method should accept a password as its input parameter and return true if the password is 
// strong enough. Otherwise, it should return false.

// The main method first inputs a password from the user. Then it calls the method checkStrength with the 
// inputted password. Finally, the main method prints "OK" if the password is strong enough. 
// Otherwise it prints "Not strong enough!"

// A password is considered to be strong enough if it has at least 8 characters and it includes characters 
// from at least three different categories. The four categories of characters are the following: uppercase 
// letters, lowercase letters, digits, and other characters.

// Example output:
// Enter password: Carpe_diem
// OK

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringPasswordStrength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String norwegianCat = input.nextLine();
        if (checkStrength(norwegianCat) == true) {
            System.out.print("OK");
        } else {
            System.out.print("Not strong enough!");
        }
        input.close();
    }

    private static boolean checkStrength(String meow) {
        int count = 0;
        String[] rules = { "[A-Z]", "[a-z]", "[0-9]", "[!@#$%^ˆ&*()_+\\s]" };
        if (meow.length() < 8) {
            return false;
        }
        for (int i = 0; i < rules.length; i++) {
            Pattern rulesChecker = Pattern.compile(rules[i]);
            Matcher ruff = rulesChecker.matcher(meow);
            if (ruff.find()) {
                count = count + 1;
            }
        }
        return count >= 3;
    }
}