public class BankAccount{
  private double balance;

  // constructors
  private void BankAccount(double balance){
    this.balance = balance;
  }

  // member methods
  private void deposit(double amount){
    this.balance = this.balance + amount;
  }
  private void withdrawal(double amount){
    this.balance = this.balance - amount;
  }
  private void deductMonthlyCharge(){
    this.withdrawal(10);
  }
  public double getBalance(){
    return balance;
  }
  private void setTransactionFee(double fee){
    this.balance = this.balance - 0.2;
  }
}
