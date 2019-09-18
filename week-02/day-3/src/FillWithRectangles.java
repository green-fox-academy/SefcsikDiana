import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        Random random = new Random();

        for (int i = 0; i < 4 ; i++) {
            //Ha igy adom meg a valtozokat, akkor mindig a canvasan belul fogja tartani a dolgokat!
            //WIDTH-rectanglesizeA -val hatarozom meg, hogy bent tartsa a canvasan belul.
           int rectanglesizeA = random.nextInt(320);
           int rectanglesizeB = random.nextInt(320);
           int x = random.nextInt(WIDTH-rectanglesizeA);
           int y = random.nextInt(HEIGHT-rectanglesizeB);
           //Ha random akarok szint generalni,akkor mindig hasznalnom kell
            // setRandomColor(graphics)
           setRandomColor(graphics);

            graphics.fillRect(x,y,rectanglesizeA,rectanglesizeB);
        }
    }

    private static void setRandomColor(Graphics graphics) {
        Random random = new Random();
        //Eloszor mindig letre kell hoznom a graphics.setcolor szint,majd a zarojelen belul hatarozom meg a 3 random szint!
        //a Color rgb tartomanyon belul             1.szin piros     2. szin kek          3.szin zold
        // 255= ennyi szin tartomany van, ez a max.hatar!!!!
        graphics.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
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