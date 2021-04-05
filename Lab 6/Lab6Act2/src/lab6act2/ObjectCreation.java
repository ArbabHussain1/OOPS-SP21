package lab6act2;
public class ObjectCreation 
{
    private static int objCreated;
    private static int objDestroyed;
    private int num;
   
    public ObjectCreation()
    {
       num = 10;
       objCreated++;
    }
    public ObjectCreation(int n)
    {
       num = n; 
       objCreated++;
    }
    public static void destroyedObj()
    {
        objDestroyed++;
    }
    public static void print()
    {
        System.out.println("Object created: "+ objCreated);
        System.out.println("Object destroyed: "+ objDestroyed);
    }
    
    
}
