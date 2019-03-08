import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a non-negative integer: ");
            int num = Integer.parseInt(input.nextLine());
            int fact = 1;

            if (num < 0) {
                System.out.print("Please enter a non-negative integer.");
            } else if (num > 0) {
                for (int i = 1; i <= num; i++) {
                    fact = fact * i;
                }
                System.out.print(num + "!" + "=" + fact);
            } else if (num == 0) {
                System.out.print("0! = 1");
            }
        } catch (NumberFormatException nfe) {
            System.out.print("Please enter a non-negative integer.");
        }
    }
}