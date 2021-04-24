package assignment02;

import java.util.Scanner;

public class Runner 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        EmailAddress from = null;
        boolean getEmail = true;
        while(getEmail) 
        {
            try
            {
                System.out.print("enter sender's email address: ");
                String email = input.nextLine();
                from = new EmailAddress(email);
                getEmail = false;
            }
            catch(Exception ex)
            {
                System.out.print("email is not valid re-");
                getEmail = true;
            }
        }
        
        EmailAddress to = null;
        getEmail = true;
        while(getEmail) 
        {
            try
            {
                System.out.print("enter receiver's email address: ");
                String email = input.nextLine();
                to = new EmailAddress(email);
                getEmail = false;
            }
            catch(Exception ex)
            {
                System.out.print("email is not valid re-");
                getEmail = true;
            }
        }
        
        String subject = "Subject of email";
        String message = "These are the contents of email";

        Email email = new Email(from, to, subject, message);

        email.addPara("This is another para that is added");
        System.out.println(email);

        BookChapter bookChapter = new BookChapter("Inheritance", 11, "Contents about inheritance");
        System.out.println(bookChapter);
    }
}



