package lab9_homeact03;
public class lab9_homeact03_Runner 
{
    public static void main(String[] rgs)
    {
        Circle c = new Circle(1, "Black", "Blue");
        Square s = new Square(4, "Black", "Gray");
        Triangle t = new Triangle(3, "Black", "Red");
        
        c.draw();
        s.draw();
        t.draw();
    }
}
