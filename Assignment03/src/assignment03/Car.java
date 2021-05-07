package assignment03;
public class Car extends Vehicle
{

    public Car(String name, String mark) 
    {
        super(name, mark);
    }
    
    public String accelerate()
    {
        return "Car accelerated using the foot accelerator.";
    }
    
    public String brake()
    {
        return "Car have both hand and foot brakes.";
    }
    
    public String park()
    {
        return "Cars made use of hand brake to hold ground.";
    }
}
