package lab9_assignmentq01;
public class ClockExtended extends Clock
{
    public ClockExtended(int hr, int min, int sec)
    {
        super(hr, min, sec);
    }
    
    @Override
    public void display()
    {
        System.out.println("\t----CLOCK----\n\nAM/PM format.");
        if(getHr() < 12 || getHr()==24)
        {
            int h = getHr() % 12;
            if (h == 0)
                h = 12;
            System.out.println(h + ":" + getMin() + ":" + getSec() + " AM");
        }
        else
        {
            int h = getHr() % 12;
            if (h == 0)
                h = 12;
            System.out.println(getHr() % 12 + ":" + getMin() + ":" + getSec() + " PM");
        }
        
        System.out.println("\n24 hour format.");
        super.display();
    }
}
