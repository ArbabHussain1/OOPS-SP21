package lab5act01;
public class lab5act01_Runnar 
{
    public static void main(String[] args) 
    {
        Distance d1 = new Distance();
        Distance d2 = new Distance(5, 2);
        Distance d3 = d1.addDistances(d2);
        d1.setter(10, 1);
        d3.display();
    }
}
