/*
    Solution 1) Einen beliebigen String gespiegelt ausgeben.
 */
public class Solution1 {
    public static void main(String[] args) {
        String eingabe = "Hello World!";
        String result = "";
        for (int j = eingabe.length() - 1; j >= 0; j--) {
            result += eingabe.charAt(j);
        }

        System.out.println(result);
    }
}

