/**
 * Solution 22) Array mit 10 random Werten zwischen -100 und +100 anlegen,
 * dieses einer Methode übergeben, welche die Summen der positiven bzw. negativen Werte zurückgibt.
 */
public class Solution22 {
    //Lösung von @zeinab
    public static void main(String[] args) {
        double[] array = new double[10];
        array = fillArray(array);
        System.out.println("Array:");
        printArray(fillArray(array));
        System.out.println();
        System.out.println();
        System.out.println("Zurückgegebenes Array:");
        printArray(sumArray(array));


    }

    public static double[] fillArray(double[] array) {
        array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (((Math.random() * 2) - 1) * 100);
        }
        return array;
    }

    public static void printArray(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
        System.out.print("]");
    }

    public static double[] sumArray(double[] array) {
        double[] result = new double[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                result[0] = result[0] + array[i];
            } else {
                result[1] = result[1] + array[i];
            }
        }
        return result;
    }

}


