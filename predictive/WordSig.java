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

    public int compareTo(WordSig o){
        if(this.signature.length() > o.signature.length()) {
            return 1;
        }
        if(this.signature.length() < o.signature.length()) {
            return -1;
        }

        //if (this.signature.length()==other.signature.length())
        return this.signature.compareTo(o.signature);
    }

    public String toString() {
        return "Signature : " + signature + " Words: "+ words;
    }

}

