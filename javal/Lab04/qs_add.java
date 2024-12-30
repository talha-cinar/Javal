public class qs_add{

public static int right_triangle(int a, int b, int c)
{
  if((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a))
  {
    System.out.println("It is a right triangle");
    return 1;
  }   
  else
  {
    System.out.println("It is not a right triangle");
    return -1;
  }
}
}
