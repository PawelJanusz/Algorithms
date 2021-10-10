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

    //Add elements from two strings
    //Write a function that takes an array of two strings.
    // Both strings represent two arrays of positive, one-digit integers.
    // The function sums numbers from one string to another.
    // For example: if a string of arrays equals
    //
    //["[1, 2]", "[3, 4]"]
    //, the function calculates (1+3),(2+4) and returns "4,6"
    // as a string where the numbers are separated with a comma.
    // When one of the strings has more elements,
    // append the remaining numbers to the final result.
    //
    //Examples:
    //
    //- if array = ["[3, 2, 1]", "[6, 5, 4]"], the function should return: "9,7,5".
    //- if array = ["[4, 5]", "[3, 5, 8, 9]"], the function should return: "7,10,8,9".
    public static String sumStringValues (String[] input) {

        String[] splitFirst = input[0].split("\\D");
        String[] splitSecond = input[1].split("\\D");

        int[] result = {input.length};

        String finish = "";
        String end = "";
        for (int i = 1; i < splitFirst.length; i++) {
            for (int j = 1; j < splitSecond.length; j++) {
                for (int k = 0; k < result.length; k++) {
                    if (splitFirst.length == splitSecond.length && i == j) {
                        try {
                            result[k] = Integer.parseInt(splitFirst[i]) + Integer.parseInt(splitSecond[j]);
                        }
                        catch (NumberFormatException ex){
                            ex.printStackTrace();
                        }
                        finish = finish.concat(result[k] + ",");
                        end = finish.substring(0, finish.length() - 1);
                    }
                    if (input[1].length() > input[0].length() && i == j){
                        try {
                            result[k] = Integer.parseInt(splitFirst[i]) + Integer.parseInt(splitSecond[j]);
                        }
                        catch (NumberFormatException ex){
                            ex.printStackTrace();
                        }
                        finish = finish.concat(result[k] + ",");
                        end = finish.substring(0, finish.length() - 1)
                                    .concat(input[1].substring(input[0].length()-1, input[1].length()-1));

                    }
                }
            }
        }
            return end;

        }


    public static void main(String[] args) {
         String[] array = {"[3,2,1]", "[6,5,4,100,200,300]"};
        System.out.println(sumStringValues(array));

//        String word = "[1,2,3,4,5]";
//
//        String[] splitWord = word.split("[\\D]");

    }
}
