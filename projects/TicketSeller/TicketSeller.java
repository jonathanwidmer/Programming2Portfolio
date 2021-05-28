import java.util.Scanner;

public class TicketSeller{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int buyers = 0;
    int ticketsLeftOver = 100;
    int ticketsBoughtByCustomer;
    while (ticketsLeftOver > 0){
      System.out.println("How many tickets do you want to buy? (You can only buy 4 or less): ");
      ticketsBoughtByCustomer = in.nextInt();
      if(ticketsBoughtByCustomer <= 4){
        ticketsLeftOver = ticketsLeftOver - ticketsBoughtByCustomer;
        buyers++;
        System.out.println("There are: " + ticketsLeftOver + " tickets left over.");
      }
      else{
        System.out.println("You can't buy more than 4 tickets.");
      }
    }
    System.out.println(buyers + " people bought tickets.");
  }
}
