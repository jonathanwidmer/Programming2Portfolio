import java.util.Scanner;

public class AccountTester{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double amountInAccount = 0;
    double amountWithdrawn = 0;
    double amountInAccount2 = 0;
    double amountInAccount3 = 0;
    double amountInAccount4 = 0;
    double amountTransactionFee = 0;
    double amountTransactionFee2 = 0;
    double amountDeposit = 0;
    String bankAccountYes = "1";
    String bankAccountNo = "2";

    System.out.println("Do you have a bank account? If yes, type the number 1. If no, type the number 2.");
    bankAccountYes = input.next();
    if (bankAccountYes == "1"){
      System.out.println("Enter the amount of money currently in your bank account: ");

    }
    else {
      System.out.println("Do you want to start a bank account? Type 1 for yes and 2 for no.");
    }
    bankAccountNo = input.next();
    if (bankAccountNo == "1"){
      System.out.println("Enter the amount of money you want to put in your account: ");
      bankAccountNo = input.next();
      System.out.println("Congratulations on your bank account! You have $" + bankAccountNo + " in your new account.");
    }
    else {
      System.out.println("ok");
    }

    System.out.println("Enter the amount of money currently in your bank account: ");
    amountInAccount = input.nextDouble();

    System.out.println("Enter amount you want to withdraw: ");
    amountWithdrawn = input.nextDouble();
    amountInAccount2 = amountInAccount - amountWithdrawn;
    System.out.println("You have " + amountInAccount2 + " dollars left in your account.");

    System.out.println("The transaction fee is $0.20 per $10, and is only charged when withdrawing.");
    amountTransactionFee = amountWithdrawn * 0.2;
    amountTransactionFee2 = amountInAccount2 - amountTransactionFee;
    System.out.println("Your transaction costed $" + amountTransactionFee);
    System.out.println("You now have $" + amountTransactionFee2 + " dollars in your account.");

    System.out.println("Enter amount you want to deposit: ");
    amountDeposit = input.nextDouble();
    amountInAccount3 = amountTransactionFee2 + amountDeposit;
    System.out.println("You have " + amountInAccount3 + " dollars in your account.");

    System.out.println("Your monthly charge for you bank account is $5. It is automatically subtracted from you account once a month.");
    amountInAccount4 = amountInAccount3 - 5;
    System.out.println("You have $" + amountInAccount4 + " in your bank account.");
  }
}
