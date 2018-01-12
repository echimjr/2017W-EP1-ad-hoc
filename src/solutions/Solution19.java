import java.util.Arrays;

/**
 * K1 AdHoc 3
 * Task 19: ein Array mit 20 Stellen mit random Zahlen von 0-9 befüllen, iterativ den Index der ersten vorkommenden
 * Ziffer bestimmen und in eimem Array speichern, wenn nicht vorhanden -1
 */
public class Solution19 {
    public static int[] searchDigits(int[] array) {
        int[] temp = new int[10];

        for (int i = 0; i <= 9; i++) {
            temp[i] = -1;
            for (int j = 0; j < array.length; j++) {
                if(i == array[j]) {
                    temp[i] = j;
                    j = array.length;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(searchDigits(array)));
    }
}
