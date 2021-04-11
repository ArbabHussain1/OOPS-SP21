package lab7_homeact01;
public class Address 
{
    /**
     * class contains
     * four data fields 
     * a constructor 
     * setters methods 
     * get methods
     */
    private int street;
    private int house;
    private String city;
    private int code;
    public Address(int street, int house, String city, int code)
    {
        this.street = street;
        this.house = house;
        this.city = city;
        this.code = code;
    }
    public void setStreet(int street)
    {
        this.street = street;
    }
    public void setHouse(int house)
    {
        this.house = house;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public void setCode(int code)
    {
        this.code = code;
    }
    public int getStreet()
    {
        return this.street;
    }
    public int getHouse()
    {
        return this.house;
    }
    public String getCity()
    {
        return this.city;
    }
    public int getCode()
    {
        return this.code;
    }
}


