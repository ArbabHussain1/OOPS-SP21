package lab3act3;

public class Distance 
{
    int feet;
    int inches;
    
    public Distance()
    {
        feet = 5;
        inches = 60;
    }
    public Distance(int x , int y)
    {
        feet = x;
        inches = y;
    }
    void print()
    {
        System.out.println("feet = " + feet);
        System.out.println("inches = " + inches);
    }
    
}
