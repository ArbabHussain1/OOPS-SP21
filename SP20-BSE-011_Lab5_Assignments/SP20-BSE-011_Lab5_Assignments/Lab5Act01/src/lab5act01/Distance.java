package lab5act01;
public class Distance 
{
    private int feet;
    private int inches;
    
    public Distance()
    {
        feet = 8;
        inches = 4;
    }
    public Distance(int feet, int inches)
    {
        this.feet = feet;
        this.inches = inches;
    }
    public Distance addDistances(Distance a)
    {
        Distance new_d = new Distance(feet + a.feet, inches + a.inches);
        return new_d;
    }
    public int getFeet()
    {
        return feet;
    }
    public int getInches()
    {
        return inches;
    }
    public void setter(int feet, int inches)
    {
        this.feet = feet;
        this.inches = inches;
    }
    public void display()
    {
        System.out.println("Added distance\nFeets: "+ getFeet() +"\nInches: "+ getInches());
    }
}
