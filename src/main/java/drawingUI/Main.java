package drawingUI;

import javax.swing.*;
import java.awt.*;

public class Main {
    private static GraphicsConfiguration gc; // Class field containing config info
    public static void main(String[] args) {
        JFrame frame= new JFrame(gc); // Create a new JFrame
        frame.setSize(500,600);
        DrawingUIController cDrawingUIController = new DrawingUIController();
        frame.getContentPane().add(cDrawingUIController.getMainPanel()) ;
        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

