package predictive;

public class Words2SigProto {

    public static void main(String[] args) {

        for (String word: args){
            System.out.println(PredictivePrototype.wordToSignature(word) + " ");

        }
    }
}
