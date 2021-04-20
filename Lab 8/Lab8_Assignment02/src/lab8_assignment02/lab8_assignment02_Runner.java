package lab8_assignment02;

public class lab8_assignment02_Runner 
{
    public static void main(String[] rgs)
    {
        Laptop L1 = new Laptop();
        L1.display();
        Laptop L2 = new Laptop(32, 4, 8, 13.2, 13, 4, 9, 15);
        L2.display();
    }
}
