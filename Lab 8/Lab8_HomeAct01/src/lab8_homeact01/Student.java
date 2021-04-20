package lab8_homeact01;

public class Student extends Person
{
    private String status;
    
    public Student(String name, String address, int phoneNumber, String email, String status)
    {
        super(name, address, phoneNumber, email);
        this.status = status;
    }
    
    @Override
    public void display()
    {
        System.out.println("\nSTUDENT DETAILS: ");
        super.display();
        System.out.println("Status: " + status);
    }
}
