import java.util.HashSet; //3
import java.util.Set; //3
import java.util.List;
import java.util.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;

public class Class{
  public static void main (String[] args) throws FileNotFoundException{
    Set<String> dictionaryWords = readWords("morewords.txt");
    Set<String> documentWords = readWords("words.txt");
    for(String word: documentWords){
      if(!dictionaryWords.contains(word)){
        System.out.println(word);
      }
    }

    Set<String> words = new HashSet<>(); //4
    words.add("car"); //7 and 5
    words.add("boat"); //7 and 5
    words.add("truck"); //7 and 5
    words.add("plane"); //7 and 5
    words.add("train"); //7 and 5
    words.add("bike"); //7 and 5
    System.out.println(words); //10
    System.out.println("Size of hash set: " + words.size()); //6
    words.remove("truck"); //9
    words.remove("bike"); //9
    words.add("bus"); //8
    System.out.println(words); //10
    System.out.println("Size of hash set: " + words.size()); //6
    //organizing into alphabetical
    List<String> list = new ArrayList<String>(words);//11
    Collections.sort(list);//11
    System.out.println(list);//11
  }

  public static Set<String> readWords(String filename) throws FileNotFoundException{
    Set<String> morewords = new HashSet<>();
    Scanner in = new Scanner(new File(filename));
    in.useDelimiter("[^a-zA-Z]+");
    while(in.hasNext()){
      morewords.add(in.next().toLowerCase());
    }
    return morewords;
  }
}
