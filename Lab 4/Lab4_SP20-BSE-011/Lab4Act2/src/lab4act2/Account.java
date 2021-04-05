
package lab4act2;
import java.util.Scanner;
public class Account 
{
    private int balance;
    
    public Account()
    {
        balance = 80000;
    }
    public int getBalance()
    {
        return balance;
    }
    public Account(int x)
    {
        balance = x;  
    }
    public void deposit()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ammount to deposit: ");
        int x = input.nextInt();
        balance += x;
        System.out.println("New balance is " + balance + " Rs");
    }
    public void withdraw()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ammount to withdraw: ");
        int x = input.nextInt();
        balance -= x;
        System.out.println("New balance is " + balance + " Rs");
    }
}
