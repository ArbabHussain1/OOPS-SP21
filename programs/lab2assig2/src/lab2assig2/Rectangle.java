
package lab2assig2;

public class Rectangle
{
    int length;
    int width;
    int area;
    int perimeter;   
    
    public Rectangle(int a, int b)
    {
        length = a;
        width = b;
        area = length * width;
        perimeter = (length + width)*2;
    }
    
    public void print(Rectangle a, Rectangle b)
    {
        System.out.println("area of rectangle R1 is "+a.area+" and its perimeter is "+a.perimeter);
        System.out.println("area of rectangle R2 is "+b.area+" and its perimeter is "+b.perimeter);
        
    }
    
}
