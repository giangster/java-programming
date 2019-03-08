// Create a program called StringPassword that has a method called validatePassword that checks 
// whether a password is in the required format. 
// The method should accept a username and password as its input parameters and return true if the password 
// format is ok. Otherwise, it should return false.

// The main method first inputs a user name and password from the user and then calls the method 
// validatePassword with the inputted data. Finally, the main method prints "OK" if the password format is ok. 
// Otherwise, it prints "NOT OK"

// The password validation rules are the following:

// A password should be at least 8 characters long.
// A password should not include the username.
// Example output:
// Enter username: Susanne
// Enter password: susanne1
// NOT OK

import java.util.Scanner;

public class StringPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();
        validatePassword(username, password);
        input.close();

    }

    private static void validatePassword(String username, String password) {
        if (password.length() < 8) {
            System.out.print("NOT OK");
        } else if (password.toLowerCase().contains(username.toLowerCase())) {
            System.out.print("NOT OK");
        } else {
            System.out.print("OK");
        }
    }
}
