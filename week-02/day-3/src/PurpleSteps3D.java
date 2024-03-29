import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
    public static void mainDraw(Graphics graphics) {
        int x = 10;
        int y = 10;
        int size = 10;
        // size=x=y=10

        for (int i = 0; i < 6; i++) {
            // x , y ez valtozik mindig, ez a kezdopont az osszes negyzetnek!
            graphics.setColor(new Color(215, 75, 255));
            graphics.fillRect(x, y, size, size);

            graphics.setColor(Color.black);
            graphics.drawRect(x, y, size, size);
            // A SORREND SZAMIT!!!!!
            // ha x,y kezdoerteket elore irom, ahogy most, akkor kirajzolja az osszes negyzetet!!
            x += size;
            y += size;

            size += 10;
            //Ha a megcserelem, es a size+=10 irom elore, es utana x+= size; y+=size; akkor minden 2. negyzetet nem rajzolja ki, mert eloszor a size-zal eltolodik, majd jon a kezdoertek!
            // size += 10;
            // x += size;
            // y += size;


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
