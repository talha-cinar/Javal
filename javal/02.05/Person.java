public class Person
{
    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public String introduceSelf()
    {
        return "I am (" +this.name +")";
    }
}
