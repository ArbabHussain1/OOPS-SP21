
package lab3act1;

public class Circle 
{
    int radius;
    double PI;

    public Circle()
    {
        radius = 5;
        PI = 3.142;
    }
    public Circle(int r, double pi)
    {
        radius = r;
        PI = pi;    
    }
    public void Circumference()
    {
        double Circumference = (2* PI)* radius;
        System.out.printf("The value of Circumference is = %.2f", Circumference); 
        System.out.println();
    }
}
