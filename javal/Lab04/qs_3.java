import java.util.Scanner;

public class qs_3
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a length for triangle: ");
    int first = scanner.nextInt();
    System.out.print("Enter a length for triangle: ");
    int second = scanner.nextInt();
    System.out.print("Enter a length for triangle: ");
    int third = scanner.nextInt();
    qs_add.right_triangle(first,second,third);    
  }

  //public static int right_triangle(int a, int b, int c)
  //{
  //  if((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a))
  //  {
  //    System.out.println("It is a right triangle");
  //    return 1;
  //  }   
  //  else
  //  {
  //    System.out.println("It is not a right triangle");
  //    return -1;
  //  }
  //}
}
