package assignment04;

import java.io.*;
import java.io.Serializable;

public class AddressBook<T>
{
    private T[] contacts;
    
    //Add method
    public void addContact(T address) throws FileNotFoundException, IOException
    {
        if(contacts == null)
        {
            contacts = (T[])new Object[1];
            contacts[0] = address;
        }
        else
        {
            T[] temp = contacts;
            contacts = (T[])new Object[temp.length + 1];
            for(int i=0; i<temp.length; i++)
            {
                contacts[i] = temp[i];
            }
            contacts[contacts.length - 1] = address;
        }
        
        FileOutputStream fos = new FileOutputStream("Address book");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        for(int i=0; i<contacts.length; i++)
        {
            oos.writeObject(contacts[i]);
        }
        oos.close();
    }
    
    //Search method
    public Address searchContact(String firstName, String lastName) throws FileNotFoundException, IOException
    {
        FileInputStream fis = new FileInputStream("Address book");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        try
        {
            while(true)
            {
                Address a = (Address)ois.readObject();
                if(a.getFirstName().equals(firstName) && a.getLastName().equals(lastName))
                {
                    return a;
                }
            }
        }
        catch (Exception e)
        {
            return null;
        }
    }
    
    //Update method
    public void updateContact(T address) throws FileNotFoundException, IOException
    {
        FileInputStream fis = new FileInputStream("Address book");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        try
        {
            int count = 0;
            while(true)
            {
                Address a = (Address)ois.readObject();
                if(a.getFirstName().equals(((Address)address).getFirstName()) && a.getLastName().equals(((Address)address).getLastName()))
                {
                    contacts[count] = address;
                    System.out.println("Contact updated Successfully\n");
                    break;
                }
                count++;
            }
        }
        catch (Exception e)
        {
            System.out.println("Contact didn't match\n");
        }
        
        FileOutputStream fos = new FileOutputStream("Address book");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        for(int i=0; i<contacts.length; i++)
        {
            oos.writeObject(contacts[i]);
        }
        oos.close();
    }
    
    //delete method
    public void deleteContact(T address) throws FileNotFoundException, IOException
    {
        FileInputStream fis = new FileInputStream("Address book");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        try
        {
             int count = 0;
            while(true)
            {
                Address a = (Address)ois.readObject();
                if(a.getFirstName().equals(((Address)address).getFirstName()) && a.getLastName().equals(((Address)address).getLastName()))
                {
                    T[] temp = contacts;
                    contacts = (T[])new Object[temp.length - 1];
                    for(int i=0, j=0; i<temp.length; i++, j++)
                    {
                        if(temp[j] == contacts[count])
                        {
                            j++;
                        }
                        contacts[i] = temp[j];
                    }
                    System.out.println("Contact deleted Successfully\n");
                    break;
                }
                count++;
            }
        }
        catch (Exception e)
        {
            System.out.println("");
        }
        
        FileOutputStream fos = new FileOutputStream("Address book");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        for(int i=0; i<contacts.length; i++)
        {
            oos.writeObject(contacts[i]);
        }
        oos.close();
    }
    
}
