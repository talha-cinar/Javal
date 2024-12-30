public class Gallery
{
    private String galleryName;
    private Car[] cars;
    private int carCount; 
    private int capacity;
    private Person galleryOwner;

    public Gallery(String name, int Capacity, Person owner)
    {
        this.galleryName = name;
        this.Capacity = capacity;
        this.galleryOwner = owner;
    }

    public String getGalleryName()
    {
        return galleryName;
    }
    public void setGalleryName(String name)
    {
        this.galleryName = name;
    }

    public boolean addCar(Car car)
    {
        if(searchCar(car))
        {
            System.out.println("This car is already added");
            return false;
        }
        else if(!search(car))
        {
        carCount++;
        return true;
        }
    }

    public boolean searchCar(Car car)
    {
        for(int i=0; i< carCount; i++)
        {
            if(car.getPlate() == cars[i].getplate())
            {
                return true;
            }
            return false;
        }
    }

    public Car searchCar(String plate)
    {
        for(int i=0; i< carCount; i++)
        {
            if(plate == cars[i].getplate())
            {
                return cars[i];
            }
            return null;
        }
    }

    public void introduceSelf()
    {
        System.out.printf("%s , %s, %d", galleryName, galleryOwner, carCount);
    }
}
