import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("enter number: ");
    String num = in.nextLine();
    System.out.printf("The keypad encodings for %s are:%n", num);
    wordChanger(num);
}
static char[] getButton(int n){
  switch (n){
    case 0:
    return new char[] { ' ' };
    case 1:
    return new char[] { '.' };
    case 2:
    return new char[] { 'A', 'B', 'C' };
    case 3:
    return new char[] { 'D', 'E', 'F' };
    case 4:
    return new char[] { 'G', 'H', 'I' };
    case 5:
    return new char[] { 'J', 'K', 'L' };
    case 6:
    return new char[] { 'M', 'N', 'O' };
    case 7:
    return new char[] { 'P', 'Q', 'R', 'S' };
    case 8:
    return new char[] { 'T', 'U', 'V' };
    case 9:
    return new char[] { 'W', 'X', 'Y', 'Z' };
  }
  return null;
}
static void wordChanger(String num){
  if (num != null){
    wordChanger(num, "");
  }
}
static void wordChanger(String num, String text){
  if (num.length() == 0){
    System.out.println(text);
  } else {
      int number = num.charAt(0) - '0';
      char letters[] = getButton(number);
      if (letters != null){
        for (int i = 0; i < letters.length; i++){
          wordChanger(num.substring(1), text + letters[i]);
        }
      }
    }
  }
}
