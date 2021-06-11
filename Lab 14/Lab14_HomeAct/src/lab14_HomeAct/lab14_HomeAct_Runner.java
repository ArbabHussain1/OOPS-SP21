package lab14_HomeAct;

import java.util.Scanner;
import java.io.*;

public class lab14_HomeAct_Runner 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("BookStore.hax");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        Book book1 = new Book("Great Expectations", "Champman & Hall", new Person("Charles Dickness"));
        Book book2 = new Book("In Search of Lost Time", "J.S Son's", new Person("Marcel Proust"));
        Book book3 = new Book("Hamlet", "Shakespeare and Company", new Person("William Shakespeare"));
        Book book4 = new Book("Ulysses", "Edvin Booth", new Person("Jym Joyce"));
        Book book5 = new Book("THE GREAT GATSBY", "charles Scribnear", new Person("F Scott Fitzgerald"));
        
        oos.writeObject(book1);
        oos.writeObject(book2);
        oos.writeObject(book3);
        oos.writeObject(book4);
        oos.writeObject(book5);
        oos.close();
        
        FileInputStream fis = new FileInputStream("BookStore.hax");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
//        try
//        {
//            while(true)
//            {
//                System.out.println(ois.readObject());
//            }
//        }
//        catch (EOFException e){}
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of book: ");
        String bookName = input.nextLine();       
        try
        {
            while(true)
            {
                Book b = (Book)ois.readObject();
                if(b.name.equals(bookName))
                {
                    System.out.println(b);
                    break;
                }
            }
        }
        catch (EOFException e)
        {
            System.out.println("Book you searched doesn't exist.");
        }
    }
}
