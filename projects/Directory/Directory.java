import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Directory{
  public static void main(String[] args){
    String[] dir = {"dir1", "dir10", "dir12", "dir11", "dir9", "dir8", "dir7", "dir5", "dir6", "dir4", "dir3", "dir2", "dir13"};
    ArrayList<String> directories = new ArrayList<>(Arrays.asList(dir));
    System.out.println(directories);
    Collections.sort(directories, new Directories());
    System.out.println(directories);
  }
}
