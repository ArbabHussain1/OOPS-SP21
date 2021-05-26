package lab11act01;

public class TestAplication implements EnhancedShape
{
    int radius;

    public TestAplication(int radius) 
    {
        this.radius = radius;
    }
    
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
}
