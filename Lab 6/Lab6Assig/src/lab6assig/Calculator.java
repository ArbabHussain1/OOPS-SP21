package lab6assig;
import java.util.Scanner;
public class Calculator 
{
    static Scanner input = new Scanner(System.in);
    
    public static void showManu(String[] s)
    {
        for(int i=0; i<s.length; i++)
        {
            System.out.println((i+1) + " : "+ s[i]);
        }
    }
    
    public static int getOption()
    {
        System.out.print("Select an option or 0 to exit: ");
        int option = input.nextInt();
        return option;
    }
    
    public static void Sum()
    {
        int sum = 0;
        System.out.println("\nEnter numbers to add and 0 for answer: "); 
        int num = input.nextInt();
        while (num != 0)
        {
            sum += num;
            System.out.print("\r+ "); 
            num = input.nextInt();         
        }
        System.out.println("Sum = "+ sum +"\n"); 
    }
    
    public static void Multiply()
    {
        int ans = 1;
        System.out.println("\nEnter numbers to Multiply or 1 for answer: "); 
        int num = input.nextInt();
        while (num != 1)
        {
            ans *= num;
            System.out.print("* "); 
            num = input.nextInt();       
        }
        System.out.println("Answer = "+ ans +"\n");
    }
    
    public static void Divide()
    { 
        System.out.print("\nEnter numerator: "); 
        double numerator = input.nextDouble();
        System.out.print("Enter denominator: "); 
        double denominator = input.nextDouble();
        System.out.printf((int)numerator +" / "+ (int)denominator +" = %.2f ", (numerator/denominator));
        System.out.println();
        System.out.println();
    }
    
    public static void Modulus()
    { 
        System.out.print("\nEnter two numbers to find Modulus: "); 
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println((int)num1 +" % "+ (int)num2 +" = "+ (num1%num2) +"\n");
    }
    
    public static void Sin()
    {  
        System.out.print("\nEnter a numbers in Degrees to find Sin: "); 
        int num = input.nextInt();
        System.out.printf("Sin("+ num +") = %.2f", Math.sin(Math.toRadians(num)));
        System.out.println();
        System.out.println();
    }
    
    public static void Cos()
    {  
        System.out.print("\nEnter a numbers in Degrees to find Cos: "); 
        int num = input.nextInt();
        System.out.printf("Cos("+ num +") = %.2f", Math.cos(Math.toRadians(num)));
        System.out.println();
        System.out.println();
    }
    
    public static void tan()
    {  
        System.out.print("\nEnter a numbers in Degrees to find tan: "); 
        int num = input.nextInt();
        System.out.printf("tan("+ num +") = %.2f", Math.tan(Math.toRadians(num)));
        System.out.println();
        System.out.println();
    }
}
