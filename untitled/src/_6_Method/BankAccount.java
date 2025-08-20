package _6_Method;

public class BankAccount {
    int accountNumber;
    double balance;
    static String BankName = "SBI";
    public void  Deposit( double amount){
        System.out.println("Deposit amount "+ amount  +"Successfully");
    }
    public void withdraw(double amount){
        System.out.println("Withdraw  amount "+ amount  +"Successfully");

    }
    public double checkbalance(double amount){
        System.out.println("Balance is "+amount);
        return 0;
    }
    public static void Bankname(){
        System.out.print("Bank Name is "+ BankName );
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.Deposit(1000);
        bankAccount.withdraw(500);
        bankAccount.checkbalance(6000);


        Bankname();
        BankAccount.Bankname();
    }
}
