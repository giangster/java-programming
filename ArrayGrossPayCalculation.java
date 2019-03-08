import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class ArrayGrossPayCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimal = new DecimalFormat("0.00");
        System.out.print("Enter your hourly wage: ");
        double hourlyWage = Double.parseDouble(input.nextLine().replace(',', '.'));
        System.out.print("Enter the number of days: ");
        int day = Integer.parseInt(input.nextLine());
        int[] hour = new int[day];
        int workHours = 0;
        double grossPay = 0;
        double compensation = 0;
        for (int i = 0; i < day; i++) {
            System.out.print("Hours worked on day " + (i + 1) + ": ");
            hour[i] = Integer.parseInt(input.nextLine());
            workHours = workHours + hour[i];
        }
        for (int j = 0; j < hour.length; j++) {
            if (hour[j] > 8) {
                double hourDouble = hour[j];
                compensation = compensation + (hourDouble - 8) * hourlyWage * 0.5;
            }
        }
        grossPay = workHours * hourlyWage + compensation;
        System.out.println("Total work hours is " + workHours);
        System.out.println("Gross pay is " + twoDecimal.format(grossPay));
        System.out.print("You entered the following daily hours:");
        for (int j = 0; j < hour.length; j++) {
            System.out.print(" " + hour[j]);
        }
    }
}
