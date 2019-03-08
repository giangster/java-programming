
// Create a program called ObjectsLanguageTranslationArray that inputs an English word from the user and translates it to Finnish.
// The program is a variation of your ArrayLanguageTranslation program.
// This time,the program can translate only the following words:"bird","bus","car","cat","dog".
// If the word is unknown,the program should display"Unknown word".
// *This time,use one array only.Reuse the WordPair class from a previous exercise andcreate an array ofWordPairs.

import java.util.Scanner;
import java.util.Arrays;

public class ObjectsLanguageTranslationArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean wordFound = false;
        WordPair[] dictionary = new WordPair[5];
        dictionary[0] = new WordPair("bird", "lintu");
        dictionary[1] = new WordPair("bus", "bussi");
        dictionary[2] = new WordPair("car", "auto");
        dictionary[3] = new WordPair("cat", "kiss");
        dictionary[4] = new WordPair("dog", "koira");
        System.out.print("Enter an English word: ");
        String word = input.nextLine();
        for (int i = 0; i < 5; i++) {
            if (dictionary[i].getEnglishWord().equalsIgnoreCase(word)) {
                System.out.println(dictionary[i].getFinnishWord());
                wordFound = true;
            }
            input.close();
        }
        if (wordFound == false) {
            System.out.println("Unknown word");
        }
    }
}

class WordPair {
    String englishWord;
    String finnishWord;

    public WordPair(String englishWord, String finnishWord) {
        this.englishWord = englishWord;
        this.finnishWord = finnishWord;

    }

    String getEnglishWord() {
        return this.englishWord;
    }

    String getFinnishWord() {
        return this.finnishWord;
    }
}