package shapes;

import java.awt.*;

interface Drawtime{
    public void draw(Graphics gc);
}

public abstract class Shapeoid implements Drawtime{
    Point pos;
    Color col;

    Shapeoid(Point initPos, Color col) {
        pos = initPos;
        this.col = col;
    }


    public abstract void draw(Graphics gc);
}
