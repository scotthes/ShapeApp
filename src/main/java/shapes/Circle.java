package shapes;

import java.awt.*;

/**
 * The Shapes.Circle class encapsulates the information describing a circle and can draw it in
 * an AWT Graphics object using AWT library methods
 * */
public class Circle extends Shapeoid {
    private int rad; // Fields

    Circle(Point initPos, Color col, int radius) { // The constructor
        super(initPos, col);
        rad = radius; // Initialize fields
    }

    @Override
    public void draw(Graphics gc) { // A method that draws the object in g
        gc.setColor(col);
        gc.fillOval(pos.x, pos.y, rad, rad);
    }

}