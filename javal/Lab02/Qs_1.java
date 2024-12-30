import java.util.Scanner;

public class Qs_1
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);    
    System.out.println("This program checks;");
    System.out.println("If a number is Hilbert Number or not. ");
    System.out.println("Enter a non negative integer: ");    
    scanner.close();
    int number = scanner.nextInt();
    if((number-1) % 4 == 0)
    {
      System.out.printf("%d is a Hilbert number\n" , number);
    }
    else
    {
      System.out.printf("%d is not a Hilber number\n" , number);
    }

  }
}
