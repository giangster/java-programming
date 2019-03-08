import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = input.nextLine();

        if (first.equals("quit")) {
            System.out.print("The total length is 0");
        } else {
            int count = first.length();
            while (!first.equals("quit")) {
                System.out.print("Enter a string: ");
                first = input.nextLine();
                count = count + first.length();
            }

            System.out.print("The total length is " + (count - 4));
        }
    }
}