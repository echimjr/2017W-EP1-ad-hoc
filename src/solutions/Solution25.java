/**
 *
 * Solution 25) Löse rekursiv: Zeichne auf einen 600x600 Canvas vertikale Blöcke, der erste Block geht von ganz unten bis
 * nach oben. Nachfolgende Blöcke sollen 15% kleiner sein als die vorhergehenden, der letzte Block soll rechts
 * am Bildschirmrand enden
 */

public class Solution25 {
    public static void rec(int n, int val, double height, double drawX) {
        if (val > n) return;
        double width = 600./((double)n);
        StdDraw.filledRectangle(drawX, 300, width, height/2);
        rec(n, val+1, height * 0.85, drawX + width);
    }

    public static void main(String[] args) {
        StdDraw.setCanvasSize(600,600);
        StdDraw.setScale(0,600);
        rec(100,1, 600,0);
    }
}
