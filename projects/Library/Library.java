import java.util.Scanner;

public class Library{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.println("Enter how many books you bought: ");
    int books = in.nextInt();

    double bookPrice = 5 * books;

    double taxes = 1.075 * bookPrice;

    int shippingPrice = 2 * books;

    double totalCost = taxes + shippingPrice;

    System.out.printf("Your total cost is: $" + "%.2f", totalCost);
  }
}
