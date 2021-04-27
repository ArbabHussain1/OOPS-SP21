package lab9_homeact03;

public class Square extends Shapes
{
    public Square(int numOfLines, String penColor, String fillColor)
    {
        super(numOfLines, penColor, fillColor);
    }
    
    @Override
    public void draw()
    {
        System.out.println("\tSpuare\nNumber of lines: " + getNumOfLines() + "\nPen color: " + getPenColor() + "\nFill color: " + getFillColor() + "\n");
    }
    
}
