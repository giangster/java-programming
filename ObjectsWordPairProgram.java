
public class ObjectsWordPairProgram {
    public static void main(String[] args) {
        WordPair luoka = new WordPair("class", "luoka");
        WordPair object = new WordPair("object", "olio");
        WordPair variable = new WordPair("variable", "muutuja");

        System.out.println(luoka.getEnglishWord() + " = " + luoka.getFinnishWord());
        System.out.println(object.getEnglishWord() + " = " + object.getFinnishWord());
        System.out.println(variable.getEnglishWord() + " = " + variable.getFinnishWord());
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