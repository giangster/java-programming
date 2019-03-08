import java.util.Scanner;

public class ValidateThird {
    public static void main(String[] args) {
        boolean isContinued = true;
        Scanner input = new Scanner(System.in);
        String gradeStr = "";

        while (isContinued) {
            System.out.print("Enter a grade(0-5): ");
            try {
                gradeStr = input.nextLine();
                int grade = Integer.parseInt(gradeStr);
                if (grade <= 5 && grade >= 0) {
                    System.out.print("OK");
                    isContinued = false;
                } else {
                    System.out.println(gradeStr + " is not a valid grade");
                }
            } catch (NumberFormatException nfe) {
                System.out.println(gradeStr + " is not a valid grade");
            }
        }
    }
}
