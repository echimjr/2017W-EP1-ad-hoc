/**
 * Solution 12) 2 Methoden: 1 nimmt 2 Strings, liefert den kürzeren zurück,
 * die andere nimmt 2 integer und gibt den kleineren zurück.

 */
public class Solution12 {
    public static void main(String[] args) {
        String a = "Frohes Fest!";
        String b = "Frohes neues Jahr!";
        System.out.println(shortestString(a, b));

        int x = 10;
        int y = 15;
        System.out.println(smallestInt(x,y));
    }

    public static String shortestString(String a, String b){
        if (a.length() > b.length()){
            return b;
        }else {
            return a;
        }
    }

    public static int smallestInt(int a, int b){
        return Math.min(a,b);

        /* oder
        if (a > b){
            return b;
        }else {
            return a;
        }
        */
    }
}
