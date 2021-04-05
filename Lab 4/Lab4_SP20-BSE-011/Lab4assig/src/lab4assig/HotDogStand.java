package lab4assig;
public class HotDogStand
{
    private int ID;
    private int Sold;
      
    public HotDogStand(int x, int y)
    {
        ID = x;
        Sold = y;
    }
    public void justSold()
    {
        Sold++;
    }
    public void  get_dogs_sold()
    {
        System.out.println("Hot dog stand’s ID number " + ID +" sold " + Sold + " dogs");
    }
}
