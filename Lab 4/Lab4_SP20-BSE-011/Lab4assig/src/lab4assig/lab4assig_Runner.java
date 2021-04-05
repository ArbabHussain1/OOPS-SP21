package lab4assig;
public class lab4assig_Runner 
{
    public static void main(String[] args)
    {
        HotDogStand S1 = new HotDogStand(75263, 5);
        HotDogStand S2 = new HotDogStand(75264, 3);
        HotDogStand S3 = new HotDogStand(75265, 7);
        
        S1.justSold();
        S1.justSold();
        S2.justSold();
        S1.justSold();
        S2.justSold();
        S3.justSold();
        S3.justSold();
        S2.justSold();
        
        S1.get_dogs_sold();
        S2.get_dogs_sold();
        S3.get_dogs_sold();
    }   
}
