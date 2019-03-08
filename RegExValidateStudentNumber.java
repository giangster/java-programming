// Create a program called RegExValidateStudentNumber that first inputs a student number from the user. 
// If the inputted data contains exactly 7 digits, the program should print "OK". 
// Otherwise, the program should print "Invalid student number". 
// Validate the username with a single regular expression.

// Example output:
// Enter student number: 2017987
// OK

import java.util.Scanner;

public class RegExValidateStudentNumber {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        System.out.print("Enter student number: ");
        String studentNo = input.nextLine();
        if (studentNo.matches("[0-9]{7}")) {
            System.out.print("OK");
        } else {
            System.out.print("Invalid student number");
        }
        input.close();
    }
}