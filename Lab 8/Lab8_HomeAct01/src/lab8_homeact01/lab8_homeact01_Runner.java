package lab8_homeact01;
public class lab8_homeact01_Runner 
{
    public static void main(String[] arg)
    {
        Student stdnt = new Student("Zain Abid", "house no 2 street no 8 karachi", 0415624, "zain222@gmail.com", "graduated");
        stdnt.display();
        
        Date d1 = new Date(28, 3, 2012);
        Faculty f1 = new Faculty("M. Ali", "house no 4 street no 22 Islamabad", 05123231, "ali788@gmail.com",332, 70000, d1, 8, "Lecturer");
        f1.display();
        
        Date d2 = new Date(10, 5, 2007);
        Staff s = new Staff("Ali Zadi", "house no 3 street no 13 Islamabad", 0514231, "ali788@gmail.com",117, 65000, d2, "Registrar");
        s.display();
    }
}
