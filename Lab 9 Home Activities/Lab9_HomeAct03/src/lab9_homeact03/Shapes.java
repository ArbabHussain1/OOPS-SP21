package lab9_homeact03;
public abstract class Shapes 
{
    private int numOfLines;
    private String penColor;
    private String fillColor;
    
    public Shapes(int numOfLines, String penColor, String fillColor)
    {
        this.numOfLines = numOfLines;
        this.penColor = penColor;
        this.fillColor = fillColor;
    }

    public int getNumOfLines()
    {
        return numOfLines;
    }

    public String getPenColor()
    {
        return penColor;
    }

    public String getFillColor()
    {
        return fillColor;
    }
    
    
    
    public abstract void draw();
    
}
