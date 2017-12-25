/**
    Solution 7) Formattiere eine Binärzahl (String) in 4er Blöcke, von hinten begonnen also z.B. 10100 wird zu 1 0100
 */
public class Solution7 {
    public static void main(String[] args) {
        String binNumber = "1111100101";
        String formattedNumber = "";
        int startOffset = 4 - binNumber.length() % 4;

        for (int i = 0; i < binNumber.length(); i++) {
            formattedNumber += binNumber.charAt(i);
            if ((i + 1 + startOffset) % 4 == 0) {
                formattedNumber += " ";
            }
        }
        System.out.println(formattedNumber);
    }
}
