import java.util.Scanner;

public class qs_2 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit integer: ");
        int number = scanner.nextInt();

        if (!isValidNumber(number)) 
        {
            System.out.println("Invalid number.");
            return;
        }

        int result = palindrome(number);

        if (result == 1) 
        {
            System.out.println(number + " is a palindrome number.");
        } 
        else 
        {
            System.out.println(number + " is not a palindrome number");
        }
    }

    public static boolean isValidNumber(int number) 
    {
        return String.valueOf(number).length() == 5;
    }

    public static int palindrome(int number) 
    {
        String numStr = String.valueOf(number);
        //System.out.println(numStr.length()/2);
        for (int i = 0; i < numStr.length() / 2; i++) 
        {
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - i - 1)) 
            {
                return -1;
            }
        }

        return 1;
    }
}
