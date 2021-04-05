package lab6act1;

public class lab6act1_Runner 
{
    public static void main(String[] args)
    {
        SavingsAccount Saver1 = new SavingsAccount(2000);
        SavingsAccount Saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(3);
        Saver1.print();
        Saver2.print();
        System.out.println();
        SavingsAccount.modifyInterestRate(4);
        Saver1.print();
        Saver2.print();
    }

}
