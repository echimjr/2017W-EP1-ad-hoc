/**
 * Solution 8) Zeichne auf einen 500x500 canvas quadrate, wobei sich die Farbe von der
 * einen Ecke ausgehend in die andere ändert. Also das waren 10x10 Quadrate und links unten wars schwarz
 * und in Richtung rechts oben wurde das immer heller.
 */
public class Solution8 {
    public static void main(String[] args) {
        int canvasSize = 500;
        int amntSquares = 10;
        int squareSize = canvasSize / amntSquares;

        StdDraw.setCanvasSize(canvasSize, canvasSize);
        StdDraw.setScale(0, canvasSize);

        for (int i = 0; i < amntSquares; i++) {
            for (int j = 0; j < amntSquares; j++) {
                int colVal = (i + j) * (255 / ((amntSquares * 2) - 2));
                StdDraw.setPenColor(colVal, colVal, colVal);
                StdDraw.filledSquare(
                        i * squareSize + squareSize / 2,
                        j * squareSize + squareSize / 2,
                        squareSize / 2);
            }
        }
    }
}
