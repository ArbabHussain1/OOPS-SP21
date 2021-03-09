package lab2assig1;
public class Runner 
{
    public static void main(String[] args) 
    {
        Car c1 = new Car("GLI", "black", 2020, 140);
        Car c2 = new Car("Od", "White", 2016, 150);
        Car c3 = new Car("Civic", "Silver", 2021, 160);  
        c1.print(c1, c2, c3);
    }   
}
