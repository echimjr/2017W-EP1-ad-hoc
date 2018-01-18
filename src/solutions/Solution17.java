import java.awt.*;

/**
 * Solution 17) Eine Methode die ein 50x50 Array (Color) befüllt mit Grau (Steine) und Grün(Wiese)
 * wobei Grün 20 mal so oft vorkommen soll wie Grau. Dann eine rekursive Methode die
 * (X,Y und Array (Landschaft) wird übergeben) die einen Flussverlauf simuliert:  
 * Vom Startpunkt setzt sich der Fluss von unten nach oben fort. Wenn ein Stein getroffen wird spaltet
 * sich der Fluss links UND rechts vom Stein auf und geht da weiter.
 * Ansonsten besteht sowohl eine 2/5 Wsl das der Fluss nach link oder eine 2/5 Wsl nach rechts geht,
 * ansonsten geht er gerade aus.
 * Eine Print Methode um diese auszugeben.
 */
public class Solution17 {
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
