package lab14_HomeAct;

import java.io.*;

public class Book implements Serializable 
{
    String name;
    String publisher;
    Person author;

    public Book(String name, String publisher, Person author) 
    {
        this.name = name;
        this.publisher = publisher;
        this.author = author;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
    
    
    @Override
    public String toString() 
    {
        return "\nBook name: " + name + "\nPublisher: " + publisher + "\nAuthor: " + author + "\n";
    }
}
