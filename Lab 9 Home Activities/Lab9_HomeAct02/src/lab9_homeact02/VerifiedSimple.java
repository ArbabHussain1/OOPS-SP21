package lab9_homeact02;

public class VerifiedSimple extends Simple
{
    public VerifiedSimple(int num1, int num2)
    {
        super(num1, num2);
    }
    
    @Override
    public  void add()
    {
        if(num1 > 0 && num2 > 0)
            super.add();
        else
            System.out.println("Error!!!");
    };
    
    @Override
    public  void sub()
    {
        if(num1 > 0 && num2 > 0)
            super.sub();
        else
            System.out.println("Error!!!");
    };
    
    @Override
    public  void mul()
    {
        if(num1 > 0 && num2 > 0)
            super.mul();
        else
            System.out.println("Error!!!");
    };
    
    @Override
    public  void div()
    {
        if(num1 > 0 && num2 > 0)
            super.div();
        else
            System.out.println("Error!!!");
    };
}
