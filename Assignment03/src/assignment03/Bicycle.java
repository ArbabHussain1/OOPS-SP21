package assignment03;
public class Bicycle extends Vehicle
{

    public Bicycle(String name, String mark) 
    {
        super(name, mark);
    }
    
    public String accelerate()
    {
        return "Bicycles accelerated via the use of pedals.";
    }
    
    public String brake()
    {
        return "Bicycles had hand brakes only.";
    }
    
    public String park()
    {
        return "Bicycles brought in the use of stand.";
    }
}
