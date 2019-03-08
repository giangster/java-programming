import java.util.Scanner;
import java.util.Arrays;

public class ArrayLanguageTranslation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrFin = { "lintu", "bussi", "auto", "kissa", "koira", "koulu", "kiitos", "juna", "opettaja" };
        String[] arrEng = { "bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher" };

        System.out.print("Enter an English word: ");
        String word = input.nextLine();

        for (int i = 0; i < arrEng.length; i++) {
            if (arrEng[i].equalsIgnoreCase(word)) {
                System.out.println(arrFin[i]);
                return;
            }
        }
        System.out.println("Unknown word");
        input.close();
    }

}