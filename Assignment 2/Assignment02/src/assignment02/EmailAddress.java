package assignment02;
import java.util.Scanner;
import java.io.IOException;
public class EmailAddress 
{
    private String emailAdress;
    
    public EmailAddress(String s) throws IOException
    {
        if (s.contains("@") && s.contains(".") && !(s.contains(" ")))
            emailAdress = s;
        else
        {
            throw new IOException("error message");
        }
            
    }
    
    @Override
    public String toString()
    {
        return emailAdress;
    }
}
