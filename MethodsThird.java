
import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodsThird {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimalFormat = new DecimalFormat("0.00");

        System.out.print("Enter gross salary: ");
        double grossSalary = Double.parseDouble(input.nextLine().replace(',', '.'));
        System.out.print("Enter income tax rate: ");
        double taxRate = Double.parseDouble(input.nextLine().replace(',', '.'));

        double netSalary = calculateNetSalary(grossSalary, taxRate);

        System.out.print("The next salary is " + twoDecimalFormat.format(netSalary));
    }

    private static void calculateNetSalary(double grossSalary, double taxRate) {
        double netSalary = grossSalary * taxRate / 100;
    }
}