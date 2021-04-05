package lab5act02;
public class lab5act02_Runner 
{
    public static void main(String[] args) 
    {
        Book book1 = new Book();
        book1.setter("L.D.Devid", 15);
        Book book2 = new Book("McConnell", 12);
        
        if(book1.compareBook(book2))
            System.out.println("Both the books are of same auther");
        else
            System.out.println("Both the books are not of same auther");
        
        System.out.println(book1.compareChapterNames(book2));   
    }
}
