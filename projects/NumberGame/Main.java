import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
class Main{
  public static void main(String[] args) throws FileNotFoundException, NoSuchElementException{
    Random random = new Random();
    Scanner in = new Scanner(System.in);
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
    Date date = new Date();
    PrintWriter out = new PrintWriter("scores.txt");
    int randNum = random.nextInt(100);
    int guess = 0;
    int attempts = 0;
    boolean playing = true;
    long start = System.currentTimeMillis();
    System.out.println("enter your first name");
    String firstName = in.nextLine();
    System.out.println("Welcome to the number guessing game " + firstName + "!");
    System.out.println("Guess a number between 1 and 100");
    guess = in.nextInt();
    while(guess != randNum){
      if(randNum>guess){
        System.out.println("your guess was too low, try again: ");
        guess = in.nextInt();
      }else if(randNum<guess){
        System.out.println("your guess was too high, try again: ");
        guess = in.nextInt();
        }
        attempts++;
      }
      System.out.println("You win " + firstName + "! You guessed it in " + attempts +  " tries!");
      while(playing == true){
        System.out.println("do u wanna keep playing? if yes type 1, in no type a number thats not 1");
        int replay = in.nextInt();
        if(replay == 1){
          main(null);
        }
        else if(replay != 1){
          playing = false;
          if(playing == false){
            System.out.println("thx for playing");
            long finish = System.currentTimeMillis();
            long gameTime = finish - start;
            out.println(firstName + " " + formatter.format(date) + " " + gameTime + " milliseconds " + attempts + " attempts");
            in.close();
            out.close();
          }
        }
      }
    }
  }
