import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw at least 3 lines with that function using a loop.

       // graphics.setColor(Color.blue);

        Random random = new Random();
        // Ha a for cikluson kivul hozom letre a random szin generatort, akkor mind3 vonalnak ugyanaz a random szine lesz!!!!
        // graphics.setColor(new Color(random.nextInt()));
        for (int i = 0; i < 3 ; i++) {
            int x = random.nextInt(400-50);
            int y = random.nextInt(400);
            drawHorizontalLine(x,y, graphics);
            //Random szint ad mind3 vonalnak!!!
            graphics.setColor(new Color(random.nextInt()));
        }

    }

    private static void drawHorizontalLine(int x, int y, Graphics graphics) {
        graphics.drawLine(x,y,x-50,y);
    }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

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