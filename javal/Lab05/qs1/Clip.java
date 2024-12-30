public class Clip 
{
    private int bulletCapacity;
    private int currentBullets;

    public Clip(int bulletCapacity, int currentBullets) 
    {
        this.bulletCapacity = bulletCapacity;
        this.currentBullets = currentBullets;
    }

    public void fire() 
    {
        if (currentBullets > 0) 
        {
            System.out.println("Firing a bullet");
            currentBullets--;
        } else 
        {
            System.out.println("No bullets left in the clip");
        }
    }

    public void fill() 
    {
        currentBullets = bulletCapacity;
        System.out.println("Reloading the clip with " + bulletCapacity + " bullets");
    }

    public int getCurrentBullets() 
    {
        return currentBullets;
    }
}

