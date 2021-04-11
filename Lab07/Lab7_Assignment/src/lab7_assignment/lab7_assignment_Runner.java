package lab7_assignment;
public class lab7_assignment_Runner 
{
    public static void main(String[] args) 
    {  
        Pizza p1 = new Pizza("Large", 1, 1, 2);
        Pizza p2 = new Pizza("Medium", 1, 2, 2);
        Pizza p3 = new Pizza("null", 0, 0, 0);
        
        PizzaOrder order1 = new PizzaOrder(p1, p2, p3);
        
        System.out.println("Total cost = "+ order1.totalCost());
    }
}
