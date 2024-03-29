import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareInTheCenter {

    public static void mainDraw(Graphics graphics) {
        // Draw a green 10x10 square to the canvas' center.
        graphics.setColor(Color.green);
        graphics.drawRect(WIDTH / 2, HEIGHT / 2, 10, 10);

        //Masik megoldas:
        /*int squareSizeA=10;
        int squareSizeB=10;
        graphics.setColor(Color.GREEN);
        graphics.drawRect(WIDTH/2-squareSizeA/2,HEIGHT/2-squareSizeB/2,squareSizeA,squareSizeB); */
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}