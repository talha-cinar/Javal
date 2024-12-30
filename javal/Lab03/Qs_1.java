import java.util.Scanner;

public class Qs_1
{
  public static void main(String[] args)
  {    
    //Scanner scanner = new Scanner(System.in);
    //System.out.println("This program calculates binary operation on two numbers;");
    //System.out.println("Enter the first number:");
    //int first_number = scanner.nextInt();
    //System.out.println("Enter the second number:");
    //int second_number = scanner.nextInt();    
    //System.out.println("Enter the binary operation:");
    //char operator = scanner.next().charAt(0);
    //scanner.close();
    //float result = simpleCalculator(first_number,second_number, operator);
    //if(result != (float) -0.0001)
    //{   
    //  System.out.printf("%d %c %d = %f\n", first_number , operator , second_number , result);
    //}
    simpleCalculator(4,8,'+');
    simpleCalculator(4,8,'-');
    simpleCalculator(4,8,'*');
    simpleCalculator(4,8,'/');
  }

  public static float simpleCalculator(int first, int second, char operator)
  {
    float result;
    switch(operator)
    {
      case '+':
        result = first + second;
        break;
      case '-':
        result = first - second;
        break;
      case '*':
        result = first * second;
        break;
      case '/':
        result = first / (float) second;
        break;
      default:
        System.out.println("This operation is not supported.");
        result = (float) -0.0001;
        break; 
    }
    System.out.printf("simpleCalculator(4,8,'%c')-> %f\n", operator , result);
    return result;
  }
}

