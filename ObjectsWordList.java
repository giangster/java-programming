// Create a program called ObjectsWordList that first inputs words from the user until he/she decides to quit by entering "quit". 
// Finally, the program should print the words in alphabetical order.

// * Use the sort method of the Collections class.
// Example output:
// Enter a word (quit ends): object
// Enter a word (quit ends): class
// Enter a word (quit ends): field
// Enter a word (quit ends): constructor
// Enter a word (quit ends): quit

// class
// constructor
// field
// object

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class ObjectsWordList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<String>();
        System.out.print("Enter a word (quit ends): ");
        String firstWord = input.nextLine();
        if (firstWord.equalsIgnoreCase("quit")) {
            return;
        } else {
            while (!firstWord.equalsIgnoreCase("quit")) {
                wordList.add(firstWord);
                System.out.println("Enter a word (quit ends): ");
                firstWord = input.nextLine();
            }
        }
        Collections.sort(wordList);
        for (int i = 0; i < wordList.size(); i++) {
            System.out.println(wordList.get(i));
        }
        input.close();
    }
}