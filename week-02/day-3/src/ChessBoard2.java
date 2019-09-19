import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ChessBoard2 {

    public static void mainDraw(Graphics graphics){
        int x = 0;
        int y = 0;

        for (int row = 0; row < 8; row++) {
            if (row % 2 == 0) {
                for (int column = 0; column < 8; column++) {
                    x = column * 2 * 80;
                    y = row * 80;
                    graphics.setColor(Color.black);
                    graphics.fillRect(x, y,80 , 80);
                }
            } else{
                for (int k = 0; k < 8 ; k++) {
                    y = row * 80;
                    x = k * 2 * 80 + 80;
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(x, y, 80, 80);
                }
            }
        }
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