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

    public static void main(String[] args) {

        System.out.println(deleteLetters("asMkydNklM"));
        System.out.println(changeAndCountLetters("cabacbcababc"));
    }
}
