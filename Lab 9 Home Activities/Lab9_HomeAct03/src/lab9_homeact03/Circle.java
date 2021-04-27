package lab9_homeact03;
public class Circle extends Shapes
{
    public Circle(int numOfLines, String penColor, String fillColor)
    {
        super(numOfLines, penColor, fillColor);
    }
    
    @Override
    public void draw()
    {
        System.out.println("\tCircle\nNumber of lines: " + getNumOfLines() + "\nPen color: " + getPenColor() + "\nFill color: " + getFillColor() + "\n");
    }
    
}
