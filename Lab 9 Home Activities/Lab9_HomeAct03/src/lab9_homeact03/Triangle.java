package lab9_homeact03;
public class Triangle extends Shapes
{
    public Triangle(int numOfLines, String penColor, String fillColor)
    {
        super(numOfLines, penColor, fillColor);
    }
    
    @Override
    public void draw()
    {
        System.out.println("\tTriangle\nNumber of lines: " + getNumOfLines() + "\nPen color: " + getPenColor() + "\nFill color: " + getFillColor() + "\n");
    }
    
}
