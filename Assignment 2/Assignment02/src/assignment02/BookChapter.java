package assignment02;
public class BookChapter extends Text
{
    private String title;
    private int chapterNumber;
    
    public BookChapter(String title, int chapterNumber, String Content)
    {
        super(Content);
        this.title = title;
        this.chapterNumber = chapterNumber;
    }
    
    @Override
    public String toString()
    {
        return "Chapter: " + chapterNumber + "\n\t" + title + "\n" + super.toString();
    }
}

