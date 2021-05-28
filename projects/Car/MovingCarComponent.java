import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class MovingCarComponent extends JComponent{
  private static final int BOX_X = 10;
  private static final int BOX_Y = 250;
  private static final int BOX_WIDTH = 50;
  private static final int BOX_HEIGHT = 20;
  private static final int TIRE_WIDTH = 5;
  private static final int TIRE_HEIGHT = 5;
  private static final int FIRSTTIRE_X = 15;
  private static final int FIRSTTIRE_Y = 255;
  private static final int SECONDTIRE_X = 55;

  private Rectangle box;
  private Ellipse2D.Double tire1;
  private Ellipse2D.Double tire2;

  public MovingCarComponent(){
    box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
    tire1 = new Ellipse2D.Double(FIRSTTIRE_X, FIRSTTIRE_Y, TIRE_WIDTH, TIRE_HEIGHT);
    tire2 = new Ellipse2D.Double(SECONDTIRE_X, FIRSTTIRE_Y, TIRE_WIDTH, TIRE_HEIGHT);
  }
  public void paintComponent(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.setColor(Color.RED);
    g2.fill(box);
    g2.draw(box);
    // tire 1
    //Ellipse2D.Double tire1 = new Ellipse2D.Double(15, 255, 5, 5);
    g2.setColor(Color.BLACK);
    g2.fill(tire1);
    g2.draw(tire1);
    //tire 2
    //Ellipse2D.Double tire2 = new Ellipse2D.Double(55, 255, 5, 5);
    g2.setColor(Color.BLACK);
    g2.fill(tire2);
    g2.draw(tire2);
  }
  public void moveCarBy(int dx, int dy){
    box.translate(dx, dy);
    //tire1.translate(dx, dy);
    //tire2.translate(dx, dy);
    repaint();
  }
}
