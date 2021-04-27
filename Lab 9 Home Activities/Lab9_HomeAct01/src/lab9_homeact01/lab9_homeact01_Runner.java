package lab9_homeact01;
public class lab9_homeact01_Runner 
{
    public static void main(String[] rgs)
    {
        Action movie1 = new Action("Super Hit", "PG-13", "Fury");
        Comedy movie2 = new Comedy("Hit", "PG-13", "Minions");
        
        if(movie1.equals(movie2))
            System.out.println("Movies are equal");
        else
            System.out.println("Movies are not equal");
        
        System.out.println("Late fee = " + movie2.calcLateFees(4) + "$");

    }
}
