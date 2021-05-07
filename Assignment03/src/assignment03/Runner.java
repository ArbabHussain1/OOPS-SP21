package assignment03;
public class Runner 
{
    public static void main(String[] args) 
    {
        // Make a vehicle of each type
        Vehicle b = new Bicycle("Bicycle", "Phoenix");
        Vehicle t = new Tricycle("Tricycle", "UnitedToy");
        Vehicle c = new Car("Car", "Civic");
        // Have each vehicle move, brake and park
        System.out.println(b.accelerate());
        System.out.println(b.brake());
        System.out.println(b.park() + "\n");
        System.out.println(t.accelerate());
        System.out.println(t.brake());
        System.out.println(t.park()+ "\n");
        System.out.println(c.accelerate());
        System.out.println(c.brake());
        System.out.println(c.park());
    }
}