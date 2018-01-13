import java.awt.*;

/**
 * Solution 21) Ein Programm schreiben, welches eine Stiege mit wechselnden Farben ausgibt. Diese soll rekursiv sein und die Vierecke
 * sollen von unten nach oben erzeugt werden. Abbruchbedienung:  Bildrand. Die Fenstergröße muss auch selber herausgefunden
 * werden.
 */
public class Solution21 {
    // Lösung von @root
    private static double recWidth = 50;
    private static double recHeight = 10;
    private static int windowSize = 500;

    public static void main(String[] args) {
        StdDraw.setCanvasSize(windowSize, windowSize);
        StdDraw.setScale(0, windowSize);

        drawRectangles(recWidth / 2, recHeight / 2, StdDraw.GREEN);
    }

    private static void drawRectangles(double x, double y, Color color) {
        if (x + recWidth / 2 <= windowSize) {

            StdDraw.setPenColor(color);
            StdDraw.filledRectangle(x, y, recWidth / 2, recHeight / 2);

            Color newColor = (color == StdDraw.GREEN) ? StdDraw.BLUE : StdDraw.GREEN;

            drawRectangles(x + 10, y + recHeight, newColor);
        }
    }


}
