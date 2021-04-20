package lab8_assignment02;
public class Laptop extends Computer
{
    private int length;
    private int width;
    private int height;
    private int weight;
    
    public Laptop()
    {
        super();
        this.length = 15;
        this.width = 4;
        this.height = 12;
        this.weight = 20;
    }
    
    public Laptop(int wordsize, int memorysize, int storagesize, double speed, int length, int width, int height, int weight)
    {
        super(wordsize, memorysize, storagesize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    
    public void display()
    {
        System.out.println("LAPTOP DETAILS");
        super.display();
        System.out.println("Length: " + length + " inches\nWidth: " + width + " cm\nHeight: " + height + " cm\nweight: " + weight +  " pounds\n");
    }
}
