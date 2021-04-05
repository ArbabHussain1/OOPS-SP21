package lab5assignment;
import java.util.Scanner;
public class Fraction 
{
    Scanner input = new Scanner(System.in);
    double integer1;
    double integer2;
    
    Fraction()
    {
        integer1 = 7;
        integer2 = 2;
    }
    Fraction(double integer1, double integer2)
    {
        this.integer1 = integer1;
        this.integer2 = integer2;
    }
    public void set(int integer1, int integer2)
    {
        this.integer1 = integer1;
        this.integer2 = integer2;
    }
    public double get()
    {
        double x = (integer1 / integer2);
        return x;
    }
    public boolean equals()
    {
        System.out.println("Given fraction is: "+ (int)integer1 +" : "+ (int)integer2);
        System.out.print("enter two numbers: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        Fraction f3  = new Fraction(x, y);
        if(get() == f3.get())
            return true;
        else
            return false;
    }
    public void display()
    {
        if(equals())
        {
            System.out.println("Both the fractions are identical");
            return;
        }
        else
            System.out.println("Both the fractions are not identical");
    }
}
