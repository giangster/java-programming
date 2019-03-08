import java.util.Arrays;
import java.util.Scanner;

public class ArrayDescendingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] doubleArray = new double[4];

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print("Enter " + (i + 1) + ". number: ");
            doubleArray[i] = Double.parseDouble(input.nextLine().replace(',', '.'));
        }

        Arrays.sort(doubleArray);
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i] + " ");
        }
    }
}