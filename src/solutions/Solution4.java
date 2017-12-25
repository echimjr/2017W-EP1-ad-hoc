/*
   Solution 4) Die Buchstaben eines Strings auf ein Charakter überprüfen, falls die Buchstaben nicht gleich sind,
   soll die Buchstabe mit ein '#' ersetzt werden, sonst soll die Buchstabe mit dem Charakter ersetzt werden.
*/

public class Solution4 {
    public static void main(String[] args) {
        char show = 'o';
        String guess = "Hello Wolrd!";
        String result = "";

        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == show) {
                result += show;
            } else {
                result += "#";
            }
        }
        System.out.println(result);
    }
}