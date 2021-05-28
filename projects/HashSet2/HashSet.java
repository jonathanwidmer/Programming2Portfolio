import java.util.HashSet;

public class hashSet{
  public static void main (String[] args){
    Set<String> words = new HashSet<>();
    words.add("car");
    words.add("boat");
    words.add("plane");
    words.add("train");
    words.add("bike");
    System.out.println(words);
  }

}
