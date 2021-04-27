package lab9_homeact01;
public class Action extends Movie
{
    public Action(String rating, String ID, String title)
    {
        super(rating, ID, title);
    }
    
    @Override
    public double calcLateFees(double numOfDays)
    {
        return numOfDays*3;
    }
}
