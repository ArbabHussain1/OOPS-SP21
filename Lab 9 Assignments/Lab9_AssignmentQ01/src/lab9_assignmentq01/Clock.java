package lab9_assignmentq01;
public class Clock 
{
    private int hr;
    private int min;
    private int sec;
    
    public Clock(int hr, int min, int sec)
    {
        this.hr = hr % 24;
        this.min = min % 60;
        this.sec = sec % 60;
    }

    public int getHr() 
    {
        return hr;
    }

    public int getMin() 
    {
        return min;
    }

    public int getSec() 
    {
        return sec;
    }
    
    public void display()
    {
        System.out.println(hr + ":" + min + ":" + sec + " hrs");
    }
}
