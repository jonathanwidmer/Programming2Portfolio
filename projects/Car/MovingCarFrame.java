import java.awt.event.*;
import javax.swing.*;

public class MovingCarFrame extends JFrame{
  private static final int FRAME_WIDTH = 1000;
  private static final int FRAME_HEIGHT = 500;

  private MovingCarComponent car;

  class TimerListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      car.moveCarBy(1, 0);
    }
  }

  public MovingCarFrame(){
    car = new MovingCarComponent();
    add(car);

    setSize(FRAME_WIDTH, FRAME_HEIGHT);

    ActionListener listener = new TimerListener();

    final int DELAY = 10;
    Timer t = new Timer(DELAY, listener);
    t.start();
  }
}
