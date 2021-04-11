package lab7_homeact01;
public class lab7_homeact01_Runner 
{
    public static void main(String[] args) 
    {
        Person person1 = new Person("Ali", 4, 1, "Rawalpindi", 42);
        person1.setAddress(4, 2, "Islamabad", 51);
        System.out.println(person1);
    }
}

