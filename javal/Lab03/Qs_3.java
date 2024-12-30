import java.util.Scanner;

public class Qs_3
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    TriangleType(2,5,6);
    TriangleType(5,5,5);
    TriangleType(2,5,5);
    TriangleType(4,6,4);
  }

  public static void TriangleType(int first, int second, int third)
  {
    if(first==second || second==third || third==first)
    {
      if(first==second && second ==third )
      {
        System.out.printf("TriangleType(%d,%d,%d)-> equilateral triangle\n",first,second,third);
      }
      else
      {
        System.out.printf("TriangleType(%d,%d,%d)-> isocels triangle\n",first,second,third);
      }
    }
    else
    {      
        System.out.printf("TriangleType(%d,%d,%d)-> scalene triangle\n",first,second,third);
    }
  }
}
