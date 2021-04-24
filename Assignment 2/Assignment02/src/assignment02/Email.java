package assignment02;

public class Email extends Text
{
    private EmailAddress from;
    private EmailAddress to;
    String subject;
    
    public Email(EmailAddress from, EmailAddress to, String subject, String message)
    {
        super(message);
        this.from = from;
        this.to = to;
        this.subject = subject;
    }
    
    @Override
    public String toString()
    {
        return "\t\tNew email\n\t\t---------\nFrom: " + from + "\nTo: " + to + "\nSubject: " + subject + "\n.........................\n" + super.toString() + "\n";
    }
}
