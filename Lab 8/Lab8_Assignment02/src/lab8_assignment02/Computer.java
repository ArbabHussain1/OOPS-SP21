package lab8_assignment02;
public class Computer 
{
    protected int wordsize;
    protected int memorysize;
    protected int storagesize;
    protected double speed;
    
    public Computer()
    {
        this.wordsize = 16;
        this.memorysize = 4;
        this.storagesize = 8;
        this.speed = 10.4;
    }
    
    public Computer(int wordsize, int memorysize, int storagesize, double speed)
    {
        this.wordsize = wordsize;
        this.memorysize = memorysize;
        this.storagesize = storagesize;
        this.speed = speed;
    }
    
    public void display()
    {
        System.out.println("Wordsize: " + wordsize + " bits\nMemorysize: " + memorysize + " megabytes\nStoragesize: " + storagesize + " megabytes\nSpeed: " + speed +  " megahertz");
    }

}
