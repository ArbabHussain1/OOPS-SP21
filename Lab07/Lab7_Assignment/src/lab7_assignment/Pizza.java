package lab7_assignment;
public class Pizza 
{
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;
   
    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings)
    {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }
    
    public void setSize(String size)
    {
        this.size = size;
    }
    public void setCheeseToppings(int cheeseToppings)
    {
        this.cheeseToppings = cheeseToppings;
    }
    public void setPepperoniToppings(int pepperoniToppings)
    {
        this.pepperoniToppings = pepperoniToppings;
    }
    public void setHamToppings(int hamToppings)
    {
        this.hamToppings = hamToppings;
    }
    
    public String getSize()
    {
        return size;
    }
    public int getetCheeseToppings()
    {
        return cheeseToppings;
    }
    public int getPepperoniToppings()
    {
        return pepperoniToppings;
    }
    public int getHamToppings()
    {
        return hamToppings;
    }
    
    public double  calcCost()
    {
        int cost = 0;
        if (getSize() == "Small")
            cost = 10 + 2*(getetCheeseToppings() + getPepperoniToppings() + getHamToppings());
        else if (getSize() == "Medium")
            cost = 12 + 2*(getetCheeseToppings() + getPepperoniToppings() + getHamToppings());
        else if (getSize() == "Large")
            cost = 14 + 2*(getetCheeseToppings() + getPepperoniToppings() + getHamToppings());
        return cost;
    }
    
    public String getDescription()
    {
        return "pizza size: "+ getSize() +"\ncheese toppings: "+ getetCheeseToppings() +"\npepperoni toppings: "+ getPepperoniToppings() +"\nham toppings: "+ getHamToppings();
    }
}
