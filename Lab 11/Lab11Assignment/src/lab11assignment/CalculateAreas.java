package lab11assignment;
public class CalculateAreas 
{
    public void calArea(Shape[] s)
    {
        double[] AreasOfRectangles  = new double[1];
        double[] AreasOfCircles  = new double[1];
        double[] AreasOfTriangles  = new double[1];
        
        for(int i = 0; i < s.length; i++)
        {
            if (s[i] instanceof Rectangle)
            {
                double a = ((Rectangle)s[i]).area();
                AreasOfRectangles = CalculateAreas.append(AreasOfRectangles, a);
            }
            else if (s[i] instanceof Circle)
            {
                double a = ((Circle)s[i]).area();
                AreasOfCircles = CalculateAreas.append(AreasOfCircles, a);
            }
            else if (s[i] instanceof Triangle)
            {
                double a = ((Triangle)s[i]).area();
                AreasOfTriangles = CalculateAreas.append(AreasOfTriangles, a);
            }
        }
        System.out.print("Rectangle Areas: ");
        for(int i = 0; i < AreasOfRectangles.length; i++)
        {
            System.out.printf("%4.2f, ", AreasOfRectangles[i]);
        }
        System.out.print("\nCircle Areas: ");
        for(int i = 0; i < AreasOfCircles.length; i++)
        {
            System.out.printf("%.2f, ", AreasOfCircles[i]);
        }
        System.out.print("\nTriangle Areas: ");
        for(int i = 0; i < AreasOfTriangles.length; i++)
        {
            System.out.printf("%.2f, ", AreasOfTriangles[i]);
        }
        System.out.println("");
    } 
    
    private static double[] append(double[] list, double area)
    {
        if(list[0] == 0)
        {
            list[0] = area;
            return list;
        }
        else
        {
            double[] temp = list;
            list = new double[temp.length + 1];
            for(int i = 0; i < list.length - 1; i++)
            {
                list[i] = temp[i];
            }
            list[list.length-1] = area;
            return list;
        }
    }
}
