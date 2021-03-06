package lab3act2;
import java.util.Scanner;
public class Account 
{
    double balance;
    public Account()
    {
        balance = 5000;    
    }
    public Account(double x, String y)
    {
        balance = x;  
        String AccountType = y;
    }
    public void deposit()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ammount to deposit: ");
        int x = input.nextInt();
        balance += x;
        System.out.println("Your balance is : " + balance);
    }
    
    public void withdraw()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ammount to withdraw: ");
        int x = input.nextInt();
        balance -= x;
        System.out.println("Your balance is : " + balance);
    }
    
    
}
