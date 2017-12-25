/**
 * Aufgabe 13) 3 Methoden ohne Zuhilfenahme von Bibliotheken schreiben:
 * Eine die +1/0/-1 zurückgibt wenn Int-Parameter >0/0/<0 ist,
 * eine die den Betrag des Int-Parameters retourniert und
 * eine Magicnum(int a, int b) die die beiden anderen Methoden aufruft und multipliziert.
 */
public class Aufgabe13 {
    public static void main(String[] args) {
        System.out.println(checkNumber(4));
        System.out.println(abs(5));
        System.out.println(magicNum(4,5));
    }

    public static int checkNumber(int a){
        int result = 0;
        if (a > 0){
            result = 1;
        }else if (a == 0){
            result = 0;
        }else if (a < 0){
            result = -1;
        }
        return result;
    }

    public static int abs(int a){
        return Math.abs(a);
    }

    public static int magicNum (int a, int b){
        return checkNumber(a) * abs(b);
    }
}
