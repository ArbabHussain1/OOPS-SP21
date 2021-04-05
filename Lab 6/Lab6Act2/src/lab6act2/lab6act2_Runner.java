package lab6act2;

public class lab6act2_Runner
{
    public static void main(String[] args)
    {
        ObjectCreation o1 = new ObjectCreation();
        ObjectCreation o2 = new ObjectCreation(20);
        ObjectCreation o3 = new ObjectCreation(30);
        o1 = null;
        ObjectCreation.destroyedObj();
        ObjectCreation.print();
    }
}
