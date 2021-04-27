package lab9_homeact01;
public class Drama extends Movie
{
    public Drama(String rating, String ID, String title)
    {
        super(rating, ID, title);
    }
    
    @Override
    public double calcLateFees(double numOfDays)
    {
        return numOfDays*2;
    }
}
