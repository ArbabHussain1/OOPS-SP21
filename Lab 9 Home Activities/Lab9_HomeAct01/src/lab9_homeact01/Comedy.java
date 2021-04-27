package lab9_homeact01;
public class Comedy extends Movie
{
    public Comedy(String rating, String ID, String title)
    {
        super(rating, ID, title);
    }
    
    @Override
    public double calcLateFees(double numOfDays)
    {
        return numOfDays*2.50;
    }
}
