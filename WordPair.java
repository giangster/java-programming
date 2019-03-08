public class WordPair implements Comparable {
    public String englishWord;
    public String finnishWord;

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

    @Override
    public int compareTo(WordPair w) {
        return this.getFinnishWord().compareTo(w.getFinnishWord());
    }
}