package drawingUI;

import shapes.Drawing;
import shapes.ShapeDB;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

class DrawingUIController extends JPanel{

    private JPanel mainPanel = new JPanel();
    private ShapeDB shapeDB;

    DrawingUIController() {

        mainPanel.setLayout(new GridLayout(2,1));
        Drawing image = new Drawing(shapeDB);
        image.drawCircle();
        image.drawRect();
        image.drawSquare();
        mainPanel.add(image);
        JPanel controlsPanel = new JPanel();
        controlsPanel.setLayout(new GridLayout(3,1));

    }

    JPanel getMainPanel(){
        return mainPanel;
    }
}






