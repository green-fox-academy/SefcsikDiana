import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
      int size = 10;
       // size=x=y=10
        for (int i = 10; i <250 ; i+=10) {
            graphics.setColor(Color.black);
            graphics.drawRect(i,i,10,10);
            graphics.setColor(new Color(215, 75, 255));
                           // x , y ez valtozik mindig, ez a kezdopont az osszes negyzetnek!
            graphics.fillRect(i,i,size,size);

        }
    }
/*Masik megoldas:
  graphics.setColor(new Color(0x9B18A4));
        for (int j = 0; j < 20; j++) {
            int x = 10;
            graphics.fillRect(x + (x * j), x + (x * j), x, x);
        }
    }
 */


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
