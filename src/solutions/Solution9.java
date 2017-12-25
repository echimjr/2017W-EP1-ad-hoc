/**
 * Solution 9) String einlesen der Buchstaben und die Zahlen 2, 3 und 4 beinhaltet (z.B. H3eute is4t ein2 guter T2ag)
 * und die Zahl besagt wie oft der nachfolgende Char wiederholt wird (H2eute = Heeute).
 */
public class Solution9 {
    public static void main(String[] args) {
        String eingabe = "H3eute is4t ein2 guter T2ag";
        char c;

        for (int i = 0; i < eingabe.length(); i++) {
            if (eingabe.charAt(i) == '2') {
                c = eingabe.charAt(i + 1);
                for (int j = i; j < i + 2; j++) {
                    System.out.print(c);
                }
            } else if (eingabe.charAt(i) == '3') {
                c = eingabe.charAt(i + 1);
                for (int j = i; j < i + 3; j++) {
                    System.out.print(c);
                }
            } else if (eingabe.charAt(i) == '4') {
                c = eingabe.charAt(i + 1);
                for (int j = i; j < i + 3; j++) {
                    System.out.print(c);
                }
            } else {
                System.out.print(eingabe.charAt(i));
            }
        }
    }
}
