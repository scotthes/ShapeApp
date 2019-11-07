package shapes;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Drawing extends Canvas {
    private static Graphics gc; // Class field containing config info
    private Color c = new Color(0x2B8B99);
    private int x = 200;
    private int y = 200;
    private int wid = 50;
    private ShapeDB shapedb;
    public Drawing(ShapeDB shapedb){
        this.shapedb = shapedb;
    }

    public void drawCircle(){
        int rad = 50;
        shapedb.addCircle(x,y,c, rad);

    }
    public void drawRect(){
        int hi = 100;
        shapedb.addRect(x,y,c,wid, hi);
    }
    public void drawSquare(){
        shapedb.addSquare(x,y,c,wid);
    }
    public void drawAll(){
        shapedb.paint(gc);
    }
}
