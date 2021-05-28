import java.time.*;
import java.util.*;

public class WorldClock extends Clock{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a time offset: ");
    int offset = in.nextInt();
    LocalTime otherCurrentTime = LocalTime.now().plusHours(offset);
    System.out.println(otherCurrentTime.toString());
  }
}
