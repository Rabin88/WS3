package predictive;

public class Sigs2WordsProto {

    public static void main(String[] args) {

        for (String sig: args){
            System.out.println(sig + " : " + PredictivePrototype.signatureToWords(sig));
        }
    }
}
