import java.util.Scanner;

public class Tension{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int mass = 2;
    System.out.println("Enter the speed you want the weight to move: ");
    double speed = in.nextDouble();
    double tension = (mass * (speed*speed))/3;
    System.out.println("Tension = " + tension + " newtons");
    if (tension >= 60){
      System.out.println("The rope will break");
    }
    else{
      System.out.println("The rope won't break");
    }
  }
}
