package lab8_homeact01;

public class Employee extends Person
{
    protected int office;
    protected double salary;
    protected Date hiredDate;
    
    public Employee(String name, String address, int phoneNumber, String email, int office, double salary, Date obj)
    {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.hiredDate = obj;
    }
    
    @Override
    public void display()
    {
        super.display();
        System.out.println("Office no: " + office + "\nSalary: " + salary + "\nHired date: " + hiredDate);
    }
}

class Date 
{
    int year;
    int month;
    int day;
    
    public Date(int d, int m, int y) 
    {
        year = y;
        month = checkMonth(m);
        day = checkDay(d);
    }
    public int checkMonth(int m) 
    {
        if(m >= 1 && m <= 12)
            return m;
        else
            return 1;
    }
    public int checkDay(int d) 
    {
        int[] A ={1,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(d >= 1 && d <= A[month])
        {
            return d;
        }
        else
            return 1;    
    }   
    public String toString()
    {
        String s = day+"/ "+month+"/ "+year;
        return s;
    }   
}