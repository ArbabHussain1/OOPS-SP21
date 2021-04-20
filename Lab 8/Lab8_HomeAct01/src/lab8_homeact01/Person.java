package lab8_homeact01;

public class Person 
{
    protected String name;
    protected String address;
    protected int phoneNumber;
    protected String email;
    
    public Person(String name, String address, int phoneNumber, String email)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void display()
    {
        System.out.println("Name: " + name + "\nAddress: " + address + "\nPhone number: " + phoneNumber + "\nEmail: " + email);
    }
}
