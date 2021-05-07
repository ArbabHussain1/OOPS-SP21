package assignment03;

public class Tricycle extends Vehicle
{

    public Tricycle(String name, String mark) 
    {
        super(name, mark);
    }
    
    public String accelerate()
    {
        return "Tricycles accelerated via the use of pedals.";
    }
    
    public String brake()
    {
        return "Tricycle dont have any brake.";
    }
    
    public String park()
    {
        return "Tricycles would stay put on level ground.";
    }
    
}
