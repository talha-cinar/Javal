abstract class Person
{
    private String name;
    private double price;

    public Person(String name, double price)
    {
        this.name = name;
        this.price= price;
    }

    public String getName()
    {
        return name;
    }

    public void buyCandy()    
    {} 

    public void buyCigarette()
    {}
}

class Kid extends Person
{
    public Kid(String name, double price)
    {
        super(name,price);
    }

    @Override
    public void buyCandy()
    {
        System.out.println("he/she can buy candy but not a cigarette.");
    }

    @Override
    public void buyCigarette()
    {
        System.out.println("he/she can buy candy but not a cigarette.");
    }
}

class YoungAdoult extends Person
{   

    public YoungAdoult(String name, double price)
    {
        super(name,price);
    }

    @Override
    public void buyCandy()
    {
        System.out.println("he/she can buy both candy and also cigarette.");
    }

    @Override
    public void buyCigarette()
    {
        System.out.println(" he/she can buy both candy and also cigarette, he/she must stop smoking");
    }
}

class Adoult extends Person
{
    
    public Adoult(String name, double price)
    {
        super(name,price);
    }

    @Override
    public void buyCandy()
    {
        System.out.println("he/she can buy both candy and also cigarette.");
    }

    @Override
    public void buyCigarette()
    {
        System.out.println(" he/she can buy candy and cigarette,he/she must be careful about getting fat");
    }
}


