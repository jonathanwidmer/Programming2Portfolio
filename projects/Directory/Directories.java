import java.util.Comparator;

public class Directories implements Comparator<String>{
  public int compare(String str1, String str2){
    int count = 0;
    for(int i = str1.length() - 1; i>=0; --i){
      if(!Character.isDigit(str1.charAt(i)) && count == 0){
        count = i+1;
      }
    }
    int n1 = Integer.parseInt(str1.substring(count));
    String w1 = str1.substring(0, count);

    count = 0;

    for(int i = str2.length() - 1; i>=0; --i){
      if(!Character.isDigit(str2.charAt(i)) && count == 0){
        count = i + 1;
      }
    }
    int n2 = Integer.parseInt(str2.substring(count));
    String w2 = str2.substring(0, count);
    return w1.compareTo(w2) == 0 ? Integer.compare(n1,n2) : w1.compareTo(w2);
  }
}
