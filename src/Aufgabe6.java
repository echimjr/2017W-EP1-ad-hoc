/**
    Aufgabe 6) Mit Hilfe von StdDraw soll dieses Muster erstellt werden.

                        ●
                            ●
                                ●
                                    ●
                                ●
                            ●
                        ●
 */
public class Aufgabe6 {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setXscale(0, 500);
        StdDraw.setYscale(0, 500);
        StdDraw.setPenColor(StdDraw.GREEN);

        for (int i = 0; i < 250; i += 27) {
            StdDraw.filledCircle(i + 10, i + 5, 10);
        }
        for (int i = 500; i >= 260; i -= 27) {
            StdDraw.filledCircle(500 - (i - 10), i - 5, 10);
        }

    }
}
