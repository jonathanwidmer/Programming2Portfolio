import java.time.*;

public class Clock{
  public static void main(String[] args){
    LocalTime currentTime = LocalTime.now();
    System.out.println(currentTime.toString());
  }
    //get hours
  public int getHours(){
    return (LocalTime.now().getHour());
    }
    // get minutes
  public int getMinutes(){
    return (LocalTime.now().getMinute());
    }

  public String getTime(){
    return LocalTime.now().toString();
  }
}
