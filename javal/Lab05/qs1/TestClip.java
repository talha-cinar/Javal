
public class TestClip 
{
    public static void main(String[] args) 
    {
        Clip clip = new Clip(10, 5);
        
        System.out.println("Initial number of bullets in the clip: " + clip.getCurrentBullets());
    
        clip.fire();
        clip.fire();
        clip.fire();
        System.out.println("Number of bullets in the clip after firing: " + clip.getCurrentBullets());
        clip.fill();
        
        System.out.println("Number of bullets in the clip after reloading: " + clip.getCurrentBullets());
    }
}
