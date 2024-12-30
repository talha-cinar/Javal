import java.util.Scanner;

public class Qs_2
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("This program checks ......\n");
    System.out.printf("Enter the first character: ");
    char first = scanner.next().charAt(0);
    System.out.printf("Enter the second character: ");
    char second = scanner.next().charAt(0);
    System.out.printf("Enter the third character: ");
    char third = scanner.next().charAt(0);
    scanner.close();
    if((first+third)/ 2.0 == second)
    {
      System.out.printf("%c is exactly the middle character.\n", second);
    }
    else
    {
      System.out.printf("%c is not exactly the middle character.\n", second);
    }
  }
}
