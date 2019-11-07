package shapes;

import java.util.ArrayList;
import java.awt.*;

public class ShapeDB {

    private ArrayList<Shapeoid> shapes = new ArrayList<Shapeoid>();

    void addCircle(int x, int y, Color c, int rad) {
        Point p = new Point(200, 200);
        p.setLocation(x, y);
        Circle circ = new Circle(p, c, rad);
        ;
        shapes.add(circ);
    }

    void addRect(int x, int y, Color c, int wid, int hi) {
        Point p = new Point(200, 200);
        p.setLocation(x, y);
        Rect rec = new Rect(p, c, wid, hi);
        shapes.add(rec);
    }

    void addSquare(int x, int y, Color c, int wid) {
        Point p = new Point(200, 200);
        p.setLocation(x, y);
        Square squa = new Square(p, c, wid);
        shapes.add(squa);
    }

    void paint(Graphics gc) {
        for (Shapeoid c : shapes) {
            c.draw(gc);
        }
    }
}
