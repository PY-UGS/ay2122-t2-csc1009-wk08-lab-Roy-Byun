package Week_8;

public class Lab08Q2CheckingAccount {
    private double balance;
    private int accountNum;

    public Lab08Q2CheckingAccount(int accountNum, double balance)
    {
        this.accountNum = accountNum;
        this.balance = balance;

    }

    public  double getBalance()
    {
        return this.balance;
    }

    public double deposit(double deposit) throws Lab08Q2InsufficientFundsExceptions
    {
        if (deposit < 0){
            throw new IllegalArgumentException("Deposit should not be negative");
        }
        return this.balance += deposit;
    }


    public void withdraw(double withdrawAmt) throws Lab08Q2InsufficientFundsExceptions
    {
        if (withdrawAmt <= 0){
            throw new IllegalArgumentException("Withdraw amount should not be negative");
        }

        if ((this.balance - withdrawAmt) < 0) {

            throw new Lab08Q2InsufficientFundsExceptions( withdrawAmt - this.balance);
        }
        this.balance -= withdrawAmt;

    }


    public double getNumber()
    {
        return this.accountNum;
    }
}
