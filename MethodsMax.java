import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodsMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.0");

        System.out.print("Enter first double: ");
        double first = Double.parseDouble(input.nextLine().replace(',', '.'));
        System.out.print("Enter second double: ");
        double second = Double.parseDouble(input.nextLine().replace(',', '.'));

        double max = max(first, second);
        System.out.print("The max value is " + twoDecimals.format(max));
    }

    private static double max(double num1, double num2) {
        if (num1 > num2) {
            double max = num1;
        } else {
            max = num2;
        }
        return max;
    }
}
