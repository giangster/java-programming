// Create a program called ObjectsWordPairArray. Thís exercise is a variation of the Objects Word Pair Program exercise.

// Reuse the WordPair class from the previous exercise and create an array of three WordPairs. Then create three WordPair 
// objects and save their references to the array. See the example output for the English and Finnish words. You can either 
// use an array initializer or create the WordPair objects separately.

// Finally, the program should iterate the array and print the words held by the WordPair objects as shown in the example output.

// Example output:
// class = luokka
// object = olio
// variable = muuttuja

public class ObjectsWordPairArray {
    public static void main(String[] args) {
        WordPair[] wordPairArray = { new WordPair("class", "luokka"), new WordPair("object", "olio"),
                new WordPair("variable", "muuttuja") };
        for (WordPair wordPairObject : wordPairArray) {
            System.out.println(wordPairObject.getEnglishWord() + " = " + wordPairObject.getFinnishWord());
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