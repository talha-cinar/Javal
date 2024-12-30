import java.util.Scanner;

public class qs_1 {
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the binary code: ");
        String binary = scanner.nextLine();
        scanner.close();
        if (!isValidBinary(binary)) 
        {
            System.out.println("Invalid code");
            return;
        }
        
        int decimal = binaryToDecimal(binary);
        
        System.out.println("The result is " + decimal);
    }
    
    public static boolean isValidBinary(String binary) 
    {
        for (int i = 0; i < binary.length(); i++) 
        {
            if (binary.charAt(i) != '0' && binary.charAt(i) != '1') 
            {
                return false;
            }
        }
        return true;
    }
    
    public static int binaryToDecimal(String binary) 
    {
        int decimal = 0;
        int power = 0;
        
        for (int i = binary.length() - 1; i >= 0; i--) 
        {
            if (binary.charAt(i) == '1') 
            {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        
        return decimal;
    }
}
