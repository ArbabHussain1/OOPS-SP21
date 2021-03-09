package lab3assig2;

public class Time 
{
    int hr;
    int min;
    int Seconds;
    
    public Time()
    {
        hr = 11;
        min = 34;
        Seconds = 10;
    }
    
    public Time(int h, int m, int s)
    {
        hr = h % 12;
        min = m;
        Seconds = s;
    }
    public void display()
    {
        System.out.println("Time "+ hr +" : "+ min +" : "+ Seconds);
    }
}
