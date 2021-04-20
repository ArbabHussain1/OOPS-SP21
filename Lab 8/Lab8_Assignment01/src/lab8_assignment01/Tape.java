package lab8_assignment01;

public class Tape extends Publication
{
    private int playingTime;
    
    public Tape(String title, int price, int playingTime)
    {
        super(title, price);
        this.playingTime = playingTime;
    }

    public void setPlayingTime(int playingTime) 
    {
        this.playingTime = playingTime;
    }

    public int getPlayingTime() 
    {
        return playingTime;
    }
    
    public void display()
    {
        super.display();
        System.out.println("Playing time: " + playingTime + " m\n");
    }
}
