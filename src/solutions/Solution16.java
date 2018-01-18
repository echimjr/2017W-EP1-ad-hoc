import java.awt.*;

/**
 * Solution 16) Eine Methode, die ein 100x100 Array mit Farben befüllt, wobei Grün zehn Mal so oft
 * wie grau vorkommen soll (Math.random). Das ganze soll eine Landschaft mit Wald und Stein darstellen. 
 * Eine Methode, die das ganze auch malt, sprich je nach Farbe am Index mit dieser Farbe malt
 * Eine rekursive Methode, die Feuer darstellt. Sie nimmt die Landscape, X, und y als Argumente,
 * und soll die Landscape[X][y] rot setzen (Feuer), wenn dort ein Wald war (grün) und dann,
 * mit jeweils 66% Wahrscheinlichkeit sich nach links, rechts, oben unten ausbreiten (Aufruf mit neuen x/y).
 * Die Methode wird in Main aufgerufen und soll in der Mitte anfangen.
 */
public class Solution16 {
    public static double greenLevel = 20.0/21.0;
    public static double riverLevel = 2.0/5.0;

    public static void main(String[] args) {
        StdDraw.setCanvasSize(500,500);
        StdDraw.setScale(0,50);
        StdDraw.enableDoubleBuffering();
        Color[][] landscape = genLandscape();
        genRiver(landscape, 25,0);
        drawLandscape(landscape);
        StdDraw.show();
    }


    public static Color[][] genLandscape() {
        Color[][] landscape = new Color[50][50];
        for (int i = 0; i < landscape.length; i++) {
            for (int j = 0; j < landscape[1].length; j++) {
                landscape[i][j] = Math.random() <= greenLevel ? Color.GREEN : Color.GRAY;
            }
        }
        return landscape;
    }

    public static void drawLandscape(Color[][] landscape) {
        for (int i = 0; i < landscape.length; i++) {
            for (int j = 0; j < landscape[1].length; j++) {
                StdDraw.setPenColor(landscape[i][j]);
                StdDraw.filledSquare(j, i, 0.5);
            }
        }
    }

    public static void genRiver(Color[][] landscape, int x, int y) {
        if (y < 0 || y >= landscape.length || x < 0 || x >= landscape[1].length)
            return;

        //Oberstes Element
        if (y == landscape.length-1) {
            landscape[y][x] = StdDraw.BLUE;
        }
        else {
            //Felsen
            if (landscape[y+1][x] == StdDraw.GRAY) {
                landscape[y][x] = StdDraw.BLACK;
                genRiver(landscape, x+1, y+1);
                genRiver(landscape, x-1, y+1);
            }
            else {
                landscape[y][x] = StdDraw.BLUE;
                //v Abzweigung
                if (Math.random() < riverLevel && x > 0) {
                    genRiver(landscape, x-1, y + 1);

                }
                //Rechtsabzweigung
                else if (Math.random() < riverLevel && x < landscape.length-1) {
                    genRiver(landscape, x+1, y+1);

                }
                //Gerader Fluss
                else {
                    genRiver(landscape, x, y + 1);
                }
            }
        }

    }
}
