package lab11assignment;
public class lab11assignment_Runner 
{
    public static void main(String[] args) 
    {
        CalculateAreas c = new CalculateAreas();
        Shape[] shapesArray = new Shape[7];
        shapesArray[0] = new Rectangle(4, 2.5);
        shapesArray[1] = new Circle(2.2);
        shapesArray[2] = new Rectangle(4, 3);
        shapesArray[3] = new Rectangle(3, 1);
        shapesArray[4] = new Rectangle(3.5, 2.5);
        shapesArray[5] = new Triangle(3, 5);
        shapesArray[6] = new Triangle(2, 4);
        c.calArea(shapesArray);
    }
}
