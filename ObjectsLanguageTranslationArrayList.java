import java.util.Scanner;
import java.util.ArrayList;

public class ObjectsLanguageTranslationArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String engWord = "";
        String finWord = "";

        ArrayList<WordPair> dictionary = new ArrayList<WordPair>();
        System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
        System.out.print("Enter an English word: ");
        engWord = input.nextLine();

        while (!engWord.equalsIgnoreCase("ok")) {
            System.out.print("Enter a Finnish word: ");
            finWord = input.nextLine();
            WordPair meow = new WordPair(engWord, finWord);
            dictionary.add(meow);
            System.out.print("Enter an English word: ");
            engWord = input.nextLine();
        }
        if (engWord.equalsIgnoreCase("ok")) {
            System.out.println("=== English-Finnish translation service (quit ends) ===");
            System.out.print("Enter an English word: ");
            String wordSearch = input.nextLine();
            while (!wordSearch.equalsIgnoreCase("quit")) {
                int miao = 0;
                boolean wordFound = false;
                for (WordPair dictionaryObject : dictionary) {
                    if (dictionaryObject.getEnglishWord().equalsIgnoreCase(wordSearch)) {
                        miao = dictionary.indexOf(dictionaryObject);
                        wordFound = true;
                    }
                }
                if (wordFound == false) {
                    System.out.println("Unknown word");
                } else {
                    System.out.println(dictionary.get(miao).getFinnishWord());
                }
                System.out.print("Enter an English word: ");
                wordSearch = input.nextLine();
            }
            if (wordSearch.equalsIgnoreCase("quit")) {
                System.out.println("Bye!");
                return;
            }
        }

    }
}

// class WordPair {
// String englishWord;
// String finnishWord;

// public WordPair(String englishWord, String finnishWord) {
// this.englishWord = englishWord;
// this.finnishWord = finnishWord;

// }

// String getEnglishWord() {
// return this.englishWord;
// }

// String getFinnishWord() {
// return this.finnishWord;
// }
// }