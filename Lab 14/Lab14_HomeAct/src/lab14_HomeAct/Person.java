package lab14_HomeAct;
import java.io.*;
public class Person implements Serializable 
{
    protected String name;

    public Person() 
    {
        this.name = null;
    }

    public Person(String name) 
    {
        this.name = name;
    } 

    @Override
    public String toString() 
    {
        return "" + name;
    }
}
