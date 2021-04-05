package lab6assig;

public class lab6assig_Runner 
{
    public static void main(String[] args) 
    {
        String[] s = {"Sum", "Multiply", "Divide", "Modulus", "Sin", "Cos", "tan"};
        Calculator.showManu(s);
        int option = -1;
        while (option != 0)
        {
            option = Calculator.getOption();
            if(option >0 && option<=s.length)
                switch (option)
                {
                    case 1:
                        Calculator.Sum();
                        break;
                    case 2:
                        Calculator.Multiply();
                        break;
                    case 3:
                        Calculator.Divide();
                        break;
                    case 4:
                        Calculator.Modulus();
                        break;
                    case 5:
                        Calculator.Sin();
                        break;
                    case 6:
                        Calculator.Cos();
                        break;
                    case 7: 
                        Calculator.tan();
                        break;
                }
            else if(option<0 && option>s.length)
                System.out.println("Option you selected is incorrect: "); 
        }
    } 
    
}
