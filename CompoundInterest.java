import java.util.Scanner;
import java.text.DecimalFormat;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

        System.out.print("Enter initial deposit: ");
        double deposit = Double.parseDouble(input.nextLine().replace(',', '.'));
        System.out.print("Enter interest rate: ");
        double interest = Double.parseDouble(input.nextLine().replace(',', '.'));
        System.out.print("Enter capital income tax rate: ");
        double tax = Double.parseDouble(input.nextLine().replace(',', '.'));
        System.out.print("Enter number of years: ");
        int year = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= year; i++) {
            deposit = deposit * (1 + interest / 100 - interest * tax / 10000);
            System.out.println(i + ": " + twoDecimals.format(deposit));
        }
    }
}