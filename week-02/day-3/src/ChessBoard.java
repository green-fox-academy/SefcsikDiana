import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ChessBoard {
    public static void mainDraw(Graphics graphics) {
        //2.sor elso fekete negyzet:
        int x = 40;
        int y = 0;
        int size = 40;

       /* for (int line = 0; line < 8; line++) {
            for (int column = 0; column < 8; column++){
                if ( line % 2 == 0 && column % 2 == 0){
                    x =
                    graphics.setColor(Color.black);
                    graphics.fillRect(x,y, size, size);
                }
                if (line % 2 == 1 && column % 2 ==1){
            }*/

        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        for (int i = 0; i < 320; i += 80) {

            for (int line = 0; line < 4; line++) {
                graphics.setColor(Color.black);
                graphics.fillRect(x, i, size, size);
                x += 2 * size;
            }

            x = 0;
            for (int line2 = 0; line2 < 4; line2++) {
                y = 40;
                graphics.setColor(Color.black);
                graphics.fillRect(x, i+size, size, size);
                x += 2 * size;
            }
            x = 40;
        }
    }




          /*  graphics.setColor(Color.white);
         graphics.fillRect(0, 0, size, size);
            graphics.setColor(Color.black);
            graphics.fillRect(40, 0, size, size);
            graphics.setColor(Color.white);
            graphics.fillRect(80, 0, size, size);
            graphics.setColor(Color.black);
            graphics.fillRect(120, 0, size, size);
            graphics.setColor(Color.white);
            graphics.fillRect(160, 0, size, size);
            graphics.setColor(Color.black);
            graphics.fillRect(200, 0, size, size);
            graphics.setColor(Color.white);
            graphics.fillRect(240, 0, size, size);
            graphics.setColor(Color.black);
            graphics.fillRect(280, 0, size, size);
}
        for (int j = 0; j < 1; j++) {
            graphics.setColor(Color.black);
            graphics.fillRect(0, 40, size, size);
             graphics.setColor(Color.white);
            graphics.fillRect(40, 40, size, size);
            graphics.setColor(Color.black);
            graphics.fillRect(80, 40, size, size);
            graphics.setColor(Color.white);
            graphics.fillRect(120, 40, size, size);
            graphics.setColor(Color.black);
            graphics.fillRect(160, 40, size, size);
            graphics.setColor(Color.white);
            graphics.fillRect(200, 40, size, size);
            graphics.setColor(Color.black);
            graphics.fillRect(240, 40, size, size);
            graphics.setColor(Color.white);
           graphics.fillRect(280, 40, size, size); */


// A SORREND SZAMIT!!!!!
//Ha a megcserelem, es a size+=10 irom elore, es utana x+= size; y+=size; akkor minden 2. negyzetet nem rajzolja ki, mert eloszor a size-zal eltolodik, majd jon a kezdoertek


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