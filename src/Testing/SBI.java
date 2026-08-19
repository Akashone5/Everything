package Testing;
import java.util.*;
class Account {
    protected int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double addMoney){
        if(addMoney>0){
            balance+=addMoney;
        }
    }
    public void withdraw(double takeMoney){
        if(takeMoney>0&&takeMoney<=balance){
            balance-=takeMoney;
        }
        else System.out.println("Insufficient");
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String toString() {
        return "Account[" + accountNumber + "]: $" + (balance);
    }}
    class savingAccount extends Account {
        private double interestRate;
        public savingAccount(int accountNumber,double balance,double interestRate ){
        super(accountNumber,balance);
        this.interestRate=interestRate;
        }
        public void applyInterest(){
        double interest=balance*(interestRate/100);
        balance+=interest;
        }

    }
    class checkingAccount extends Account{
        private double overdraftLimit;
        public checkingAccount(int accountNumber,double balance,double overdraftlimit){
            super(accountNumber,balance);
            this.overdraftLimit=overdraftlimit;
        }


    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn.");
        } else {
            System.out.println("Withdrawal denied. Overdraft limit exceeded.");
        }
    }
    }
public class SBI{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Account no : ");
         int acc=sc.nextInt();
        System.out.println("Entre balance : ");
        double balance=sc.nextDouble();
        System.out.println("entre rate: ");
        double rate=sc.nextDouble();
        savingAccount saving = new savingAccount(acc, balance, rate);
        System.out.println("Deposit : ");
        double deposit=sc.nextDouble();
        saving.deposit(deposit);
        System.out.println("Withdraw : ");
        double withdraw=sc.nextDouble();
        saving.withdraw(withdraw);
        saving.applyInterest();
        System.out.println("Account no  "+ saving.getAccountNumber());
        System.out.println("balance : "+saving.getBalance());



    }

}
