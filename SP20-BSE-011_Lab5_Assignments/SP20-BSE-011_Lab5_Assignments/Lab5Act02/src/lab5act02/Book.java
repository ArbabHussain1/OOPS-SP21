package lab5act02;
public class Book 
{
    private String auther;
    private String[] chapterName;
    
    public Book()
    {
    }
    public Book(String auther, int Chapters)
    {
        this.auther = auther;
        chapterName = new String[Chapters];
    }
    public void setter(String auther, int Chapters)
    {
        this.auther = auther;
        chapterName = new String[Chapters];
    }
    public boolean compareBook(Book b)
    {
        if (auther == b.auther)
            return true;
        else
            return false;
    }
    public String compareChapterNames(Book b)
    {
        if (chapterName.length > b.chapterName.length)
            return auther+"'s book has more chapters";
        else
            return b.auther+"'s book has more chapters";
    }
    
    
}
