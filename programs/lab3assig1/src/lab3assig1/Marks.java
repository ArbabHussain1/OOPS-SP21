package lab3assig1;

public class Marks
{
    int marks1;
    int marks2;
    int marks3;
    public Marks()
    {
        marks1 = 85;
        marks2 = 94;
        marks3 = 67;    
    }
    public Marks(int x, int y, int z)
    {
        marks1 = x;
        marks2 = y;
        marks3 = z;
    }
    public String display()
    {
        int Sum = marks1 + marks2 + marks3;
        return "the Sum is " + Sum;
    }
}

