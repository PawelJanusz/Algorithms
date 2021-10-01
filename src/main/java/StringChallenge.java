import java.util.Arrays;
import java.util.Formatter;

public class StringChallenge {

    //method have to delete letters "M" and add letter before
    //have to delete letters "N" and delete letter before
    //input: MhdgtrNNjduM
    //output: hdgtjduu
     public static String deleteLetters(String input){
        String[] letters = input.split("");

        String result = "";
        for (int i=0; i<letters.length; i++){
            if (letters[i].equals("M") && letters[i-1].matches("[a-z]")){
                result = input.replace("M", letters[i-1]);
            }
            if (letters[i].equals("N") && letters[i-1].matches("[a-z]")){
                result = input.replace("N", "");
                result = input.replace(letters[i-1], "");
            }
        }

        return result;
    }

    public static String changeAndCountLetters(String input){
         String[] letters = input.split("");

         String tmp = "";
         String result = "";
         for (int i=0; i< letters.length-1; i++){
             if ((letters[i] + letters[i+1]).equals("ab")){
                 tmp = (letters[i] + letters[i+1]).replace("ab", "c");
             }
             result = input.replace("ab", tmp);
         }

         int counter = 1;
         String[] lettersResult = result.split("");
         for (int i=0; i<lettersResult.length-1; i++)
            if (lettersResult[i].equals(lettersResult[i+1])){
            counter++;
        }
        System.out.println();
         return result;
    }

    public static String sumValues (String[] array) {

        String[] splitFirst = array[0].split("\\D");
        String[] splitSecond = array[1].split("\\D");

        int[] result = {array.length};

        String finish = "";
        String end = "";
        for (int i = 1; i < splitFirst.length; i++) {
            for (int j = 1; j < splitSecond.length; j++) {
                for (int k = 0; k < result.length; k++) {
                    if (splitFirst.length == splitSecond.length && i == j) {

                        result[k] = Integer.parseInt(splitFirst[i]) + Integer.parseInt(splitSecond[j]);

                        finish = finish.concat(result[k] + ",");
                        end = finish.substring(0, finish.length() - 1);
                    }
                }
            }
        }
            return end;

        }


    public static void main(String[] args) {
         String[] array = {"[1,2]", "[3,4]"};
        System.out.println(sumValues(array));

//        String word = "[1,2,3,4,5]";
//
//        String[] splitWord = word.split("[\\D]");

    }
}
