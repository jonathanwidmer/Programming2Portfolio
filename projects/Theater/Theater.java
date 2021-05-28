import java.util.Scanner;
import java.util.Arrays;

public class Theater{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int[][] seats = {
{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
{20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
{20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
{30, 40, 50, 50, 50, 50, 50, 50, 40, 30}
};

    printSeats(seats);

    //Scanner in = new Scanner(System.in);

    System.out.println("Choose by seat or price: Enter 1 to choose a seat, or 2 to choose a price.");
    int decision = in.nextInt();
    if(decision == 1){
      System.out.println("You have chosen option 1.");
      System.out.println("Enter a row: ");
      int row = in.nextInt();
      System.out.println("You have chosen row: " + row);
      System.out.println("Enter a seat: ");
      int seat = in.nextInt();
      System.out.println("You have chosen seat " + seat + " in row " + row);
      if(seats[row][seat] == 0){
        System.out.println("This seat is taken");
      }
      else{
        System.out.println("This seat hasn't been taken.");
        System.out.println("You purchased a ticket for seat " + seat + " in row " + row);
        seats[row][seat] = 0;
        printSeats(seats);
      }
    }
    else{
      System.out.println("Enter a price(10, 20, 30, 40, or 50): ");
      int price = in.nextInt();
      for (int row = 0; row < seats.length; row++){
        for (int seat = 0; seat < seats[row].length; seat++){
          if (seats[row][seat] != price){
            seats[row][seat] = 0;
          }
        }
      }
      System.out.println("You bought a ticket for $" + price);
      System.out.println("Enter a row(0-8): ");
      int row = in.nextInt();
      System.out.println("You have chosen row: " + row);
      System.out.println("Enter a seat(0-9): ");
      int seat = in.nextInt();
      System.out.println("You have chosen seat " + seat + " in row " + row);
      if(seats[row][seat] != price){
        System.out.println("You can sit in these seats: ");
        seats[row][seat] = 0;
        printSeats(seats);
      }
      else{
        System.out.println("You can't sit in that seat.");
      }
    }
  }
  public static void printSeats(int[][] seats){
    for (int i = 0; i < 9; i++){
      for (int j = 0; j < 10; j++){
        System.out.print(seats[i][j] + " ");
      }
      System.out.println();
    }
  }
}
