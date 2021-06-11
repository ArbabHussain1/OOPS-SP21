package lab14_assignment;

import java.io.*;
import java.util.Scanner;

public class Account implements Serializable 
{
    long Account_Number;
    String Name;
    double Balance;

    public Account(int Account_Number, String Name, double Balance)
    {
        this.Account_Number = Account_Number;
        this.Name = Name;
        this.Balance = Balance;
    }

    public double getBalance() 
    {
        return Balance;
    }
    
    public void balanceInquiry()
    {
        System.out.println("\nAccount balance = " + Balance + " Rs\n");
    }
    
    public void deposit(double x)
    {
        Balance += x;
        System.out.println("\nTransection Successful");
        System.out.println("New account balance = " + Balance + " Rs\n");
    }
    
    public void withdraw(double x)
    {
        Balance -= x;
        System.out.println("\nTransection Successful");
        System.out.println("New account balance = " + Balance + " Rs\n");
    }
    
    public void Transfer(double ammount, Account[] record) throws Exception
    {
        FileInputStream fis = new FileInputStream("ATM.hax");
        ObjectInputStream ois = new ObjectInputStream(fis);  
        Scanner input = new Scanner(System.in);
        
        int count = 0;
        boolean valid = false;
        boolean get = true;
        
        while(get)
        {
            System.out.print("\nEnter reciever's account number: ");
            long x = input.nextLong();
            fis = new FileInputStream("ATM.hax");
            ois = new ObjectInputStream(fis);
            count = 0;
            try
            {
                while(true)
                {
                    Account A = (Account)ois.readObject();
                    if(A.Account_Number == x)
                    {
                        valid = true;
                        get = false;
                        break; 
                    }     
                    count++;
                }
            }
            catch (EOFException e)
            {
                System.out.println("\nAccount number you entered is not valid.\n");
                System.out.print("Press 1 to re-enter account number and 0 to exit: ");
                int y = input.nextInt();
                if(y == 0)
                {
                    break;
                }
            }
            
        }
        if(valid)
        {
            this.Balance -= ammount;
            record[count].Balance += ammount;
            System.out.println("\nTransection Successful");
            System.out.println("New account balance = " + Balance + " Rs\n");
        }
        else
        {
            System.out.println("\nTransection incomplete.\n");
        }
    }

    @Override
    public String toString() {
        return "Account Number = " + Account_Number + "\nName = " + Name + "\nBalance = " + Balance + " Rs\n";
    }

    
}
