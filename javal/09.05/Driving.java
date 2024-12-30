public class Driving
{
    private String name;
    private double price;

    public Driving(String name, double price)
    {
        this.name = name;
        if(price<0)
        {
            throw new IllegalArgumentException("Price can not be negative");
        }
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        
            if(price < 0)
            {
                throw new IllegalArgumentException("Price can not be negative");         
            }
            this.price = price;
    }

    public boolean Register(int age)
    {
        try
        {
            if(age<18)
            {
                throw new IllegalArgumentException("Age can not be lower than 18");         
            }
            System.out.println("Ok!");
            return true;
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Error!!!! " + e.getMessage());
            return false;
        }
    }

    
}
