package lab11assignment;
public class Triangle implements Shape
{
    double base;
    double hight;
    
    public Triangle(double base, double hight) 
    {
        this.base = base;
        this.hight = hight;
    }
    
    public double area()
    {
        return (base * hight)/2;
    }
}