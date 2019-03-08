import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;

public class ObjectsSortingWordPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String engWord = "";
        String finWord = "";

        ArrayList<WordPair> dictionary = new ArrayList<WordPair>();
        System.out.print("Enter an English word (quit ends): ");
        engWord = input.nextLine();

        while (!engWord.equalsIgnoreCase("quit")) {
            System.out.print("Enter a Finnish word: ");
            finWord = input.nextLine();
            WordPair meow = new WordPair(engWord, finWord);
            dictionary.add(meow);
            System.out.print("Enter an English word (quit ends): ");
            engWord = input.nextLine();
        }
        if (engWord.equalsIgnoreCase("quit")) {
            Collections.sort(dictionary, WordPair.fin)
        }

    }
}

class WordPair implements Comparator<WordPair> {
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

    public static Comparator<WordPair> fin = new Comparator<WordPair>() {
        public int compare(WordPair w1, WordPair w2) {
            return w1.getFinnishWord().compareTo(w2.getFinnishWord());
        }
    };
    public static Comparator<WordPair> eng = new Comparator<WordPair>() {
        public int compare(WordPair w1, WordPair w2) {
            return w1.getEnglishWord().compareTo(w2.getEnglishWord());
        }
    };
}