// Create a program called ArrayElection. 
// The program first inputs the number of candidates in the election. 
// Then the program inputs name and votes for each candidate. 
// Finally, the program determines the winner and displays the winner's name and votes.

// * If the election is a tie, then the program prints the names of the candidates who share the highest votes.

// The election is a tie between the following candidates: 
// Susan (15 votes) 
// John (15 votes)

// Example output:
// Enter the number of candidates: 2
// Enter 1. name: Harry
// Enter votes: 120
// Enter 2. name: Susan
// Enter votes: 153

// The winner is Susan with 153 votes!

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayElection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of candidates: ");
        int number = Integer.parseInt(input.nextLine());
        String[] name = new String[number];
        int[] votes = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter " + (i + 1) + ". name: ");
            name[i] = input.nextLine();
            System.out.print("Enter votes: ");
            votes[i] = Integer.parseInt(input.nextLine());
        }
        int[] votesClone = votes.clone();
        Arrays.sort(votesClone);
        int max = votesClone[votesClone.length - 1];

        List<Integer> winners = new ArrayList<Integer>();
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] == max) {
                winners.add(i);
            }
        }

        if (winners.size() == 1) {
            System.out.print("The winner is " + name[winners.get(0)] + " with " + votes[winners.get(0)]);
        } else {
            System.out.println("The election is a tie between the following candidates: ");
            for (int i = 0; i < winners.size(); i++) {
                System.out.println(name[winners.get(i)] + ", (" + votes[winners.get(i)] + " votes)");
            }
        }
    }
}
