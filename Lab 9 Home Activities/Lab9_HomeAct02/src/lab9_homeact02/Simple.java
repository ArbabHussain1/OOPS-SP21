
package lab9_homeact02;

public class Simple 
{
    int num1;
    int num2;
    
    public Simple(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public  void add()
    {
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    };
    
    public  void sub()
    {
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
    };
    
    public  void mul()
    {
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
    };
    
    public  void div()
    {
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
    };
}
