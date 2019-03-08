// Create a program called RegExValidateSize that first inputs size code (XS, S, M, L, or XL) from the user. 
// If the size code is valid, the program prints "OK". Otherwise, the program prints "Invalid size". 
// Validate the inputted data with a single regular expression.

// Example output:
// Enter size: XLL
// Invalid size

import java.util.Scanner;

public class RegExValidateSize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        String size = input.nextLine();
        if (size.matches("XS|S|M|L|XL")) {
            System.out.print("OK");
        } else {
            System.out.print("Invalid size");
        }
    }
}