
package lab4act2;

import java.util.Scanner;

public class lab4act2_Runner 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Account a = new Account();
        Account b = new Account(a.getBalance());
        System.out.println("Your balance is " + a.getBalance() + " Rs");
        System.out.print("press 1 to deposit and 0 to withdraw: ");
        int x = input.nextInt();
        if(x == 1)
        {
            b.deposit();
        }
        else if(x == 0)
        {
            b.withdraw();
        }
    }
    
}
