package lab8_homeact01;

public class Staff extends Employee
{
    private String title;
    
    public static void main(String[] arg)
    {
        Date d = new Date(10, 5, 2007);
        Staff s = new Staff("Ali Zadi", "house no 3 street no 13 Islamabad", 0514231, "ali788@gmail.com",117, 65000, d, "Registrar");
        s.display();
    }
    
    public Staff(String name, String address, int phoneNumber, String email, int office, double salary, Date obj, String title)
    {
        super(name, address, phoneNumber, email, office, salary, obj);
        this.title = title;
    }
    
    @Override
    public void display()
    {
        System.out.println("\nSTAFF MEMBER DETAILS: ");
        super.display();
        System.out.println("Title: : " + title);
    }
}
