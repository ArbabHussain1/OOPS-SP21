package lab11act01;

public class lab11act02_Runner
{
    public static void main(String[] args) 
    {
        Shape s1 = new TestAplication(13);
        System.out.printf("Perimeter = %.2f " , ((EnhancedShape)s1).perimeter());
        System.out.println();
    }
}
