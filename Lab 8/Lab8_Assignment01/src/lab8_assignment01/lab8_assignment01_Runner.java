package lab8_assignment01;
import java.util.Scanner;
public class lab8_assignment01_Runner 
{
    public static void main(String[] rgs)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = input.nextLine();
        System.out.print("Enter price: ");
        int price = input.nextInt();
        System.out.print("Enter Number of pages: ");
        int pageCount = input.nextInt();
        System.out.print("Enter playing time: ");
        int playingTime = input.nextInt();
        System.out.println();
        
        Book b = new Book(title, price, pageCount);
        b.display();
        Tape t = new Tape(title, price, playingTime);
        t.display();
    }
}
