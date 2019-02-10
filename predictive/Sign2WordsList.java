package predictive;

public class Sign2WordsList {

    public static void main(String[] args) {
        ListDictionary d = new ListDictionary("src/predictive/words");

        for (String sig : args)
            System.out.println(sig + " : " + d.signatureToWords(sig));
    }


}
