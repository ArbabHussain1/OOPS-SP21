package lab8_assignment01;
public class Publication 
{
    private String title;
    private int price;
    
    public Publication(String title, int price)
    {
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    public String getTitle() 
    {
        return title;
    }

    public int getPrice() 
    {
        return price;
    }
    
    public void display()
    {
        System.out.println("Title: " + getTitle() + "\nPrice: " + getPrice());
    }
}
