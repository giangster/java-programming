import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your text (press Enter to quit): ");
        String text = input.nextLine();
        int count = 0;

        if (text.isEmpty()) {
            System.out.println("There is no text!");
        } else {
            count = 0;
            while (!text.isEmpty()) {
                System.out.print("Enter your text (press Enter to quit): ");
                text = input.nextLine();
                System.out.print(text);
                count = count + 1;
            }
            System.out.println("The number of entered texts is: " + count);
        }
    }
}
