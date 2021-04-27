package lab9_homeact01;
public class Movie 
{
    private String rating;
    private String ID;
    private String title;
    
    public Movie(String rating, String ID, String title)
    {
        this.rating = rating;
        this.ID = ID;
        this.title = title;
    }

    public void setRating(String rating)
    {
        this.rating = rating;
    }

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getRating() 
    {
        return rating;
    }

    public String getID() 
    {
        return ID;
    }

    public String getTitle() 
    {
        return title;
    }
    
    @Override
    public boolean equals(Object objPassed)
    {
        
        if(this.ID == ((Movie)objPassed).ID)
        {
            return true;
        }
        else
            return false;
    }
    
    
    public double calcLateFees(double numOfDays)
    {
        return numOfDays*2;
    }
}
