package lab7_assignment;
public class PizzaOrder 
{
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
   
    public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3)
    {
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
        this.pizza3 = pizza3;
    }
    
    public double totalCost()
    {
        return pizza1.calcCost() + pizza2.calcCost() + pizza3.calcCost();
    }
}
