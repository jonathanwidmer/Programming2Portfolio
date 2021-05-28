import java.util.*;

public class LetterDigit{
  public static void main(String[] args){
    String [] A1 = {"A", "B", "C"};
    String [] A2 = {"D", "E", "F"};
    String [] A3 = {"G", "H", "I"};
    String [] A4 = {"J", "K", "L"};
    String [] A5 = {"M", "N", "O"};
    String [] A6 = {"P", "Q", "R", "S"};
    String [] A7 = {"T", "U", "V"};
    String [] A8 = {"W", "X", "Y", "Z"};

    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    Map<Integer, String[]> numberToWord = new HashMap<>();
    numberToWord.put(2, A1);
    numberToWord.put(3, A2);
    numberToWord.put(4, A3);
    numberToWord.put(5, A4);
    numberToWord.put(6, A5);
    numberToWord.put(7, A6);
    numberToWord.put(8, A7);
    numberToWord.put(9, A8);

    //int userNumber = in.nextInt();
    System.out.println("enter a number to see what words it can make: ");
    int userNumber = in.nextInt();

    Set<Integer> keySet = numberToWord.keySet();
    for (Integer key : keySet){
      String[] word = numberToWord.get(key);
      int random = rand.nextInt(word.length);
      System.out.println(word[random]);
    }
  }
}
