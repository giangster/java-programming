// Create a program called StringLettersAndDigits that first inputs a string from the user. 
// Then the program prints the number of letters and the number of digits in the string.

// Example output:
// Enter a string: Autumn 2017
// 6 letter(s)
// 4 digit(s)

import java.util.Scanner;

public class StringLettersAndDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String example = input.nextLine();
        int countDigit = 0;
        int countLetter = 0;
        for (int i = 0; i < example.length(); i++) {
            if (Character.isDigit(example.charAt(i))) {
                countDigit = countDigit + 1;
            }
            if (Character.isLetter(example.charAt(i))) {
                countLetter = countLetter + 1;
            }
        }
        System.out.println(countLetter + " letters");
        System.out.println(countDigit + " digits");
        input.close();
    }
}
