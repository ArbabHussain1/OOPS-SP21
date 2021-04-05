package lab4act1;
public class Marks 
{
    private int Marks1;
    private int Marks2;
    private int Marks3;

    public Marks()
    {
        Marks1 = 70;
        Marks2 = 90;
        Marks3 = 55;
    }
    public void SetMarks1(int x)
    {
        Marks1 = x;
    }
    public void SetMarks2(int x)
    {
        Marks2 = x;
    }
    public void SetMarks3(int x)
    {
        Marks3 = x;
    }
    
    public int getMarks1()
    {
        return Marks1;
    }
    public int getMarks2()
    {
        return Marks2;
    }
    public int getMarks3()
    {
        return Marks3;
    }
}

