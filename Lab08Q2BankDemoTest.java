package Week_8;
import javax.naming.InsufficientResourcesException;
import java.util.Scanner;

public class Lab08Q2BankDemoTest {
    public static void main(String[] args)
    {
        try {

            Scanner input = new Scanner(System.in);

            Lab08Q2CheckingAccount account = new Lab08Q2CheckingAccount(1000, 5000);
//            System.out.print("Enter Account Number: ");
//            int accNum = input.nextInt();
//
            System.out.println("Your current balance is: " + account.getBalance());

            System.out.print("Enter Deposit Amount: ");
            double deposit = input.nextDouble();
            account.deposit(deposit);
            System.out.println("Your current balance is: " + account.getBalance());


            System.out.print("Enter Withdraw Amount: ");
            double withdraw = input.nextDouble();
            account.withdraw(withdraw);
            System.out.println("Your current balance is: " + account.getBalance());
        }
        catch (Lab08Q2InsufficientFundsExceptions e)
        {
            System.out.println(e.getClass().getSimpleName() + " has occurred. \nYour Balance short of $" + e.getAmount());
        }
        catch (IllegalArgumentException s)
        {
            System.out.println(s.getMessage());
        }
//        finally {
//
//            System.out.println("Your current balance is: $" + account.getBalance());
//        }
    }
}
