package lab7_homeact01;
public class Person 
{
    /**
     * class contains:
     * two data fields(one of String type and second of Address type)
     * a constructor 
     * setters method 
     * toString method
     */
    private String name;
    private Address address;
    public Person(String name, int street, int house, String city, int code)
    {
        this.name = name;
        this.address = new Address(street, house, city, code);
    }
    public void setAddress(int street, int house, String city, int code)
    {
        address.setStreet(street);
        address.setHouse(house);
        address.setCity(city);
        address.setCode(code);
    }
    public String toString()
    {
        return "* Name: "+ name +"\n* Address;  Street: "+ address.getStreet() +",  House: "+ address.getHouse() +",  City: "+ address.getCity() +",  City code: "+ address.getCode();
    }
}
