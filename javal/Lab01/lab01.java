import java.util.Scanner;

public class lab01
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program solves;");
        System.out.println("ax+by=e");
        System.out.println("cx+dy=f");
        System.out.println("a:");
        float a= scanner.nextFloat();        
        System.out.println("b:");
        float b = scanner.nextFloat();        
        System.out.println("e:");
        float e= scanner.nextFloat();        
        System.out.println("c:");
        float c= scanner.nextFloat();        
        System.out.println("d:");
        float d = scanner.nextFloat();        
        System.out.println("f:");
        scanner.close();
        float f = scanner.nextFloat();
        float x = (e*d - b*f)/ (a*d - b*c);
        float y = (a*f - e*c)/ (a*d - b*c);               
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
