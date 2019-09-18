import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GotoCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.

       Random random = new Random();
             //Random objektet hozok letre es "random"~nak neveztem el, es erre hivatkozok a for loopon belul majd!
        for (int i = 0; i <=3 ; i++) {
            // int i= 0 (kezdo ertek);
            // i<3 => feltetel, mivel 3 vonalat kell huzni minimum, ezert lehet 3 vagy barmennyi!
            // i++ => ezzel adom meg, hogy ujra visszalepjen a for loopba es csekkolja a feltetelt!
            graphics.setColor(Color.MAGENTA);
            int x = random.nextInt(320);
            int y = random.nextInt(320);

            //X,Y kezdoerteke random lesz generalva a for loop miatt, es a WIDTH/2, HEIGHT/2 vegponttal adom meg, hogy a canvas kozepebe mutasson mindig.
            // Azert adom meg a vegpontot WIDHT ES HEIGHT, hogy barmikor ujra tudjam generalni, es barmikor, barmilyen meretben rajzolni fog a kozeppontba!
            drawLineToCenter(x,y, graphics);
            // drawLineToCenter () function lesz,amit eloszor pirossal ir majd ki, ez jelzi nekem, hogy letre kell hoznom majd Mainnel kivul a functiont, amit it a for loopon belul itt hivom meg
            // akkor shortcut: Alt+Enter es Create..es a jo helyre fogja beszurni a function letrahozasi helyet!tehat a Mainnel kivul
        }
    }

    private static void drawLineToCenter(int x, int y, Graphics graphics) {
        graphics.drawLine(x,y,WIDTH/2,HEIGHT/2);
    }
    //Mindig    a public static void mainDraw(Graphics graphics) A MAIN-en kivul keszitem el a functiont!!!!!!



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