
package lab6act1;

public class SavingsAccount 
{
    private static double annualInterestrate;
    private double savingsBalance;
    
    public SavingsAccount(double savingsBalance) 
    {
        this.savingsBalance = savingsBalance;
    }
    
    public double calculateMonthlyInterest()
    {
        return ((savingsBalance * annualInterestrate)/12);
    }
    public static void modifyInterestRate(double newAnualInterestRate)
    {
        System.out.println("Anual interest Rate = "+newAnualInterestRate+" %");
        annualInterestrate = newAnualInterestRate/100;
        
    }
    public void print()
    {
        System.out.printf("New balance includilg monthly profit: %.1f " , (savingsBalance + calculateMonthlyInterest()));
        System.out.println();
    }
}
