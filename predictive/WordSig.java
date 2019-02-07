package predictive;

public class WordSig implements Comparable <WordSig> {
    private String words;
    private String signature;

    public WordSig(String words, String signature) {
        this.words = words;
        this.signature = signature;

    }

    public String getWords() {
        return words;
    }

    public String getSignature() {
        return signature;
    }

    public int compareTo(WordSig otherWords){
        return this.signature.compareTo(otherWords.signature);

    }

}
