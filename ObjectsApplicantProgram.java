import java.util.Scanner;
import java.util.Arrays;

public class ObjectsApplicantProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] appName = new String[4];
        int[] appPoints = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter " + (i + 1) + ". name: ");
            appName[i] = input.nextLine();
            System.out.print("Enter points: ");
            appPoints[i] = Integer.parseInt(input.nextLine());
        }
        Applicant[] applicantArray = new Applicant[4];
        for (int i = 0; i < 4; i++) {
            applicantArray[i] = new Applicant(appName[i], appPoints[i]);
        }
        System.out.print("Enter the minimum of required points: ");
        int minimum = Integer.parseInt(input.nextLine());
        System.out.println("The following applicants achieved the minimum of " + minimum + " points: ");
        for (int i = 0; i < 4; i++) {
            if (applicantArray[i].getPoints() >= minimum) {
                System.out.println(applicantArray[i].getName() + ", " + applicantArray[i].getPoints() + " points");
            }
        }
        input.close();
    }
}
