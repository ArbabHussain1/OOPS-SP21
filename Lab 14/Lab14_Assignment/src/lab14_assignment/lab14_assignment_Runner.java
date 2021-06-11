package lab14_assignment;

import java.io.*;
import java.util.Scanner;

public class lab14_assignment_Runner 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("ATM.hax");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Account[] record = new Account[10];
        
        record[0] = new Account(182771996, "Saad Ali", 37523);
        record[1] = new Account(227532203, "M Hamza Haq", 20000);
        record[2] = new Account(239133512, "Farhan Ahmed", 50500);
        record[3] = new Account(123024997, "Moqeet Ali Haider", 3740);
        record[4] = new Account(784395871, "Asghar Abaas", 5000);
        record[5] = new Account(929256972, "M Ali", 37500);
        record[6] = new Account(615497388, "Shaheer Awan", 0);
        record[7] = new Account(732158312, "M Bilal", 9375);
        record[8] = new Account(117659322, "Saif Ur Rehman", 35000);
        record[9] = new Account(43761223, "Mujtaba Aziz", 37200);
        
        for(int i=0; i<record.length; i++)
        {
            oos.writeObject(record[i]);
        }
        
        oos.close();
        
        FileInputStream fis = new FileInputStream("ATM.hax");
        ObjectInputStream ois = new ObjectInputStream(fis);  
        Scanner input = new Scanner(System.in);
        
        int count = 0;
        boolean valid = false;
        boolean get = true;
        
        while(get)
        {
            System.out.print("\nEnter your account number: ");
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
            while(true)
            {
                System.out.print("\n1: Balance inquiry\n2: Deposit\n3: withdraw\n4: Transfer\nSelect an option: ");
                int option = input.nextInt();
                switch (option) 
                {
                    case 1:  
                        record[count].balanceInquiry();
                        break;
                    case 2: 
                        System.out.print("Enter the amount to deposit: ");
                        double deposit = input.nextDouble();
                        record[count].deposit(deposit);
                        break;
                    case 3:  
                        System.out.print("Enter the amount to withdraw: ");
                        double withdraw = input.nextDouble();
                        if(withdraw <= record[count].getBalance())
                            record[count].withdraw(withdraw);
                        else
                            System.out.println("\nYou don't have enough amount to withdraw.\n");
                        break;
                    case 4:  
                        System.out.print("Enter the amount to Transfer: ");
                        double ammount = input.nextDouble();
                        if(ammount <= record[count].getBalance())
                            record[count].Transfer(ammount, record);
                        else
                            System.out.println("\nYou don't have enough amount to Transfer.\n");
                        break;
                    default: 
                        System.out.println("\nOption you selected is incorrect.\n"); 
                        break;
                }
                
                System.out.print("Enter 1 for more transection and 0 to exit: ");
                int y = input.nextInt();
                if(y == 0)
                {
                    break;
                }
            }
        }

        
        ois.close();
        fos = new FileOutputStream("ATM.hax");
        oos = new ObjectOutputStream(fos);
        
        for(int i=0; i<record.length; i++)
        {
            oos.writeObject(record[i]);
        }
        
        oos.close();

         
        fis = new FileInputStream("ATM.hax");
        ois = new ObjectInputStream(fis);  
        System.out.println("\n\nx-------------------------x\n   Data stored in file\n");
        try
        {
            while(true)
            {
                System.out.println(ois.readObject());
            }
        }
        catch (EOFException e){}
    }
    
}
