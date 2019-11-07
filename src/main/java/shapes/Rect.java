package shapes;

import java.awt.*;

public class Rect extends Shapeoid {
    private int height;
    private int width;

    Rect(Point initPos, Color col, int wid, int hi){
        super(initPos, col);
        height = hi;
        width = wid;
    }

    @Override
    public void draw(Graphics gc){
        gc.setColor(col);
        gc.fillRect(pos.x, pos.y, width,height);
    }
}
