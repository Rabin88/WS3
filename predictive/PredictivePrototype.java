package predictive;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PredictivePrototype {

    dfgdfgdgdf

//    public static String wordToSignature(String word){
//        // StringBuffer is used because it is faster and used if it need to make more modifications
//        // to Strings of characters.
//        StringBuffer sBuffer = new StringBuffer ();
//
//        for (int i = 0; i<word.length(); i++){
//            if (word.charAt(i) == 'a' || word.charAt(i) == 'b' || word.charAt(i) == 'c'){
//                sBuffer.append(2);
//            }
//            else if (word.charAt(i) == 'd' || word.charAt(i) == 'e' || word.charAt(i) == 'f') {
//                sBuffer.append(3);
//            }
//            else if (word.charAt(i) == 'g' || word.charAt(i) == 'h' || word.charAt(i) == 'i') {
//                sBuffer.append(4);
//            }
//            else if (word.charAt(i) == 'j' || word.charAt(i) == 'k' || word.charAt(i) == 'l')  {
//                sBuffer.append(5);
//            }
//            else if (word.charAt(i) == 'm' || word.charAt(i) == 'n' || word.charAt(i) == 'o')  {
//                sBuffer.append(6);
//            }
//            else if (word.charAt(i) == 'p' || word.charAt(i) == 'q' || word.charAt(i) == 'r' || word.charAt(i) == 's') {
//                sBuffer.append(7);
//            }
//            else if (word.charAt(i) == 't' || word.charAt(i) == 'u' || word.charAt(i) == 'v') {
//                sBuffer.append(8);
//            }
//            else if (word.charAt(i) == 'w' || word.charAt(i) == 'x' || word.charAt(i) == 'y' || word.charAt(i) == 'z') {
//                sBuffer.append(9);
//            }
//            else {
//                sBuffer.append(' ');
//            }
//        }
//        return sBuffer.toString();
//
//    }

    public static boolean isValidWord(String word){

        for (int i = 0; i< word.length(); i++){

            if (!(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')){
                return false;
            }
        }
        return word.length() >=1;
    }


    public static Set<String> signatureToWords(String signature) {

        Set<String> set = new HashSet<String>();

        try {
            Scanner scan = new Scanner(Paths.get("src/predictive/words"));

            while(scan.hasNext()) {

                String nextWord = scan.nextLine().toLowerCase();
                String returnedString = wordToSignature(nextWord);

                if (isValidWord(nextWord) && returnedString.equals(signature)) {
                    set.add(nextWord);
                }
            }
            scan.close();
        }
        catch (IOException e) {
            System.out.println("File Not Found");
        }
        return set;
    }


    public static void main(String[] args) {
//        System.out.println(signatureToWords("4663"));
        System.out.println(signatureToWords("23"));
//        System.out.println(signatureToWords("9753"));
//        System.out.println(signatureToWords("111111"));
//        System.out.println(signatureToWords("2"));
//        System.out.println(signatureToWords(""));

    }
}
