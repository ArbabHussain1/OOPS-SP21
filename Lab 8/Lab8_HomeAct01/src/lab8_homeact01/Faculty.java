package lab8_homeact01;

public class Faculty extends Employee
{
    private int officeHours;
    private String rank;
    
    public Faculty(String name, String address, int phoneNumber, String email, int office, double salary, Date obj,int officeHours, String rank)
    {
        super(name, address, phoneNumber, email, office, salary, obj);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    @Override
    public void display()
    {
        System.out.println("\nFACULTY MEMBER DETAILS: ");
        super.display();
        System.out.println("Office hours: " + officeHours + "\nRank: " + rank );
    }
}
