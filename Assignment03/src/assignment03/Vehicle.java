package assignment03;
public abstract class Vehicle implements Movable, Parkable 
{
    protected String name;
    protected String mark;

    public Vehicle(String name, String mark) 
    {
        this.name = name;
        this.mark = mark;
    }     
}