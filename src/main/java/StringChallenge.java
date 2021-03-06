
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

        String tmp = "";
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
                        tmp = tmp.concat(result[k] + ",");
                        end = tmp.substring(0, tmp.length() - 1);
                    }
                    if (input[1].length() > input[0].length() && i == j){
                        try {
                            result[k] = Integer.parseInt(splitFirst[i]) + Integer.parseInt(splitSecond[j]);
                        }
                        catch (NumberFormatException ex){
                            ex.printStackTrace();
                        }
                        tmp = tmp.concat(result[k] + ",");
                        end = tmp.substring(0, tmp.length() - 1)
                                    .concat(input[1].substring(input[0].length()-1, input[1].length()-1));

                    }
                }
            }
        }
            return end;

        }

        public static int movementsGrid(String input){
         String[] split = input.split("\\W");

         final int FINISH = 7;
         int x = 1;
         int y = 1;
         int xResult;
         int yResult;
         int movementsAmount;

         for (int i=1; i<split.length; i++){
            if (split[i].equals("w")){
                x += 1;
            }
            if (split[i].equals("s")){
                x -= 1;
            }
            if (split[i].equals("d")){
                y += 1;
            }
            if (split[i].equals("a")){
                y -= 1;
            }
         }
         xResult = FINISH - x ;
         yResult = FINISH - y ;

         movementsAmount = xResult + yResult;

            System.out.println("Pozycja " + x + " " + y);
            System.out.println("Ile zosta??o ruch??w " + xResult + " " + yResult);
            return movementsAmount;
        }


    public static void main(String[] args) {
        System.out.println(movementsGrid("(d,d,d,w,w,a)"));


//        List<StringBuilder> names = new ArrayList<>();
//        names.add(new StringBuilder("Tom"));
//        names.add(new StringBuilder("Joe"));
//        names.stream().forEach(s -> s.append("Hello"));
//        names.stream().forEach(s -> {s.insert(3, ",");
//            System.out.print(s);});

//        A a = new A("Bye");
//        Immutable im = new Immutable(a);
//        System.out.print(im);
//
//        a.setA(" bye");
//        System.out.print(im);

    }
}
