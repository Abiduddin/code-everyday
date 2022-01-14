package graphics;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics1 extends Frame{

        public Graphics1() {
            addWindowListener(new WindowAdapter() {
                /**
                 * Invoked when a window is in the process of being closed.
                 * The close operation can be overridden at this point.
                 *
                 * @param e
                 */
                @Override
                public void windowClosing(WindowEvent e) {
//                    super.windowClosing(e);
                    System.exit(0);
                }
            });
        }

        public void paint(Graphics g) {
            // draw lines
            g.drawLine(20, 40, 100, 90);
            g.drawLine(20, 90, 100, 40);
            g.drawLine(40, 40, 250, 80);

            // draw rectangle
            g.drawRect(20, 150, 60, 50);
            g.fillRect(110, 150, 60, 50);
            g.drawRoundRect(200, 150, 60, 50, 15, 15);
            g.fillRoundRect(290, 150, 60, 50, 30, 40);

            // draw elipses and circle
            g.drawOval(20, 150, 50, 50);
            g.fillOval(100, 250, 75, 50);
            g.drawOval(200, 260, 100, 40);

            // draw arcs
            g.drawArc(20, 350, 70, 70, 0, 180);
            g.fillArc(70, 350, 70, 70, 0, 75);

            // draw polygon
            int xPoints[] = {20, 200, 20, 200, 20};
            int yPoints[] = {450, 450, 650, 650, 450};
            int num = 5;
            g.drawPolygon(xPoints,yPoints, num);
        }


    public static void main(String[] args) {
        Graphics1 app = new Graphics1();

        app.setSize(new Dimension(370, 700));
        app.setTitle("GraphicDemo");
        app.setVisible(true);
    }
}
