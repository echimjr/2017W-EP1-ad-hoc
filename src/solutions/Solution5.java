/**
     Solution 5)  Falls eine Zahl > 0 ist, soll der Zahl mit +1 sonst mit ein -1 ersetzt werden.
 */
public class Solution5 {
    public static void main(String[] args) {
        int zahl = 45;
        if (zahl > 0) {
            zahl = +1;
        } else if (zahl < 0) {
            zahl = -1;
        }
        System.out.println(zahl);
    }
}
