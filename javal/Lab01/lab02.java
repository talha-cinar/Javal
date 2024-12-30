import java.util.Scanner;

public class lab02
{
    public static void main(String[] args) 
    {
      double volume_of_cylinder = 2*2*10*3.14;
      double volume_of_water = 100;
      double volume_of_a_ball = 0.75 *1.50 * 1.50 * 1.50 * 3.14;
      double overflowing_water = 0 - volume_of_cylinder + volume_of_a_ball + volume_of_water;
      System.out.println("over flowing water"+overflowing_water);
    }
}
