package assignment04;

import java.io.*;

public class Runner 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        AddressBook<Address> addressBook = new AddressBook<>();
        
        Address[] address = new Address[10];
        address[0] = new Address("Arbab", "Hussain","051232375", "Islamabad");
        address[1] = new Address("Saad", "Ali","042372155", "Karachi");
        address[2] = new Address("Saifullah", "Saleem", "042391342", "Karachi");
        address[3] = new Address("Muhammad", "Ali", "0519087482", "Lahore");
        address[4] = new Address("Ahmer", "Shehrooz", "0421009488", "Karachi");
        address[5] = new Address("Jawad", "Ahmad", "0511254541", "Islamabad");
        address[6] = new Address("Rasif", "Khan", "0519809821", "Islamabad");
        address[7] = new Address("Saad", "Ashraf", "0512309567", "Rawalpindi");
        address[8] = new Address("Malik", "Uzair", "0421870001", "Karachi");
        address[9] = new Address("Saqib", "Ali", "0519898980", "Islamabad");
        
        for(int i=0; i<address.length; i++)
        {
            addressBook.addContact(address[i]);
        }
        
        Address x = addressBook.searchContact("Arbab", "Hussain");
        if(x != null)
            System.out.println("\nSEARCH RESULT\n\n" + x + "\n");
        else
            System.out.println("Contact doesn't found");
        
        address[2].setPhoneNumber("051343851");
        addressBook.updateContact(address[2]);
        address[9].setAddress("Lahore");
        addressBook.updateContact(address[9]);
        
        addressBook.deleteContact(address[1]);
        addressBook.deleteContact(address[7]);
        addressBook.deleteContact(address[8]);
        
        FileInputStream fis = new FileInputStream("Address book");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        System.out.println("x-------------------------x");
        System.out.println("\tData in file\n");
        try
        {
            while(true)
            {
                System.out.println(ois.readObject() + "\n");
            }
        }
        catch (Exception e){}
    }   
}

