/**
 * Task 10) StdDraw, 5 bzw. 7 Kreise die immer kleiner und dunkler werden,
 * außen weiß bzw. Grau und je weiter nach innen desto dunkler, alles in einem 500x500 canvas.
 */
public class Task10 {
    public static void main(String[] args) {
        int numCircles = 7;
        int startColor = 240;
        double size;
        StdDraw.setCanvasSize(500,500);
        StdDraw.setScale(0,500);

        for (int i = 0; i < numCircles; i++) {
            int color = startColor - startColor/numCircles * i;
            StdDraw.setPenColor(color, color, color);

            size = 500 - 490/numCircles * i;
            StdDraw.filledCircle(250,250, size/2);
        }
    }

}

