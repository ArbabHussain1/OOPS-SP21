package lab3act2;

import java.util.Scanner;

public class runner 
{
    public static void main(String[] args) 
    {
        Account a = new Account();
        Account b = new Account(7000, "Saving");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 to deposit and 0 to withdraw: ");
        int x = input.nextInt();
        if (x == 1)
            b.deposit();
        else if(x == 0)
            b.withdraw();            
    }    
}
