package lab4act3;

public class Student 
{
    private String Name;  
    private int [] Result_array = new int[5];

    public static void main(String[] args)
    {
        int[] A1 = {90, 88, 72, 90, 85};
        int[] A2 = {80, 88, 72, 90, 85};
        Student a = new Student("Haleema" , A1);
        Student b = new Student("Arbab" , A2);
        if (a.Average() > b.Average())
        {
            System.out.println(a.Name + " has highest marks");
        }
        else
        {
            System.out.println(b.Name + " has highest marks");
        }
        
        Student c = new Student(a.Name , b.Result_array);
            
    }
    
    public Student (String s, int[] a) 
    {
        Name = s;
        
        for (int i = 0; i<a.length ; i++)
        {
            Result_array[i] = a[i];   
        }  
    }
    
    public double Average()
    {
        int sum = 0;
        for (int i = 0; i<Result_array.length ; i++)
        {
            sum += Result_array[i];
        }
        int average = sum / Result_array.length;
        return average;
    }
}
