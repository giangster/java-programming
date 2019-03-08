// Create a program called StringDecimalPartLength that first inputs a decimal number from the user.
// Then the program determines how many digits there are after the decimal point in the decimal number.
// Finally,the program prints the result.If the inputted value is not a"proper decimal number",the program 
// should print"Please enter a proper decimalnumber".Rules(in this exercise)A"proper decimal number"includes 
// at least one digit in the integer part,a comma or dot as the decimal separator,and at least one digit in the 
// fractional part.Hints

// Most of the algorithm involves string handling.That is,you have to save the inputted string.The normal 
// conversion from String to double can be used to validate the input.But,you need to do some extra checking 
// to make sure that the input is a"proper decimal number".The indexOf method is very useful here.

// Example output:Enter a decimal number:3,1415926535 10 decimal place(s)

import java.util.Scanner;

public class StringDecimalPartLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String ruff = input.nextLine().replace(',', '.');
        if (ruff.matches("[-]*[0-9]{1,}[\\.][0-9]{1,}") == false) {
            System.out.print("Please enter a proper decimal number");
        } else {
            int ruffRuff = ruff.indexOf(".");
            String ruffFinal = ruff.substring(ruffRuff);
            System.out.print(ruffFinal.length() + " decimal place(s)");
        }
        input.close();
    }
}