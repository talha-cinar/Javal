import java.util.Scanner;

public class Qs_2
{
  public static void main(String[] args)
  {        
    Scanner scanner = new Scanner(System.in);
    System.out.println("This program gives the position of the digit in a number");    
    System.out.println("Enter the number: ");
    String number = scanner.nextLine();
    System.out.println("Enter the digit(0-9):");
    int digit = scanner.nextInt();
    int result = find_digit(number, digit);
    if(result != -1)
    {
      System.out.printf("The %d in position %d\n",digit, result);
    }
    else
    {
      System.out.println("Digit not found in the number");
    }
  }
  public static int find_digit(String number, int digit)
  {
    int result =-1;
    int length = number.length();
    for(int i =length; i>0; i--)
    {
      if( Character.getNumericValue(number.charAt(i-1)) == digit)
      {
        result = length-i;
      }
    }
    return result;
  }
}
