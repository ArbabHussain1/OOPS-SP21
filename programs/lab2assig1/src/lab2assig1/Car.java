
package lab2assig1;
public class Car 
{
    String Name;
    String Color;
    int Modle;
    int MaxSpeed;   
    
    public Car(String a, String b, int c, int d)
    {
        Name = a;
        Color = b;
        Modle = c;
        MaxSpeed = d;
    }
    
    public void print(Car a, Car b, Car c)
    {
        System.out.println(a.MaxSpeed);
        System.out.println(b.MaxSpeed);
        System.out.println(c.MaxSpeed);
        
    }
   
}
