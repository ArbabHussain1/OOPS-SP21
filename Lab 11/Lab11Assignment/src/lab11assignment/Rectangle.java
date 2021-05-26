package lab11assignment;
public class Rectangle implements Shape
{
    double length;
    double width;

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }
    
    public double area()
    {
        return length * width;
    }
}
