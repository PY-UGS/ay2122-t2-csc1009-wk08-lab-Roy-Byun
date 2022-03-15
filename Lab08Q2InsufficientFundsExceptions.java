package Week_8;
import java.io.*;

public class Lab08Q2InsufficientFundsExceptions extends Exception
{
    private double amount;

    public Lab08Q2InsufficientFundsExceptions(double amount) {
        this.amount = amount;
    }


//    public String CheckNegativeDeposit(){ return "Your deposit amount should not be negative";}

    public double getAmount() {
        return amount;
    }

}
//
//public class checkNegativeValue extends Exception
//{
//    private String string;
//
//    public checNegativeValue()
//    {
//
//    }
//}

