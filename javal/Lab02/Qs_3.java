import java.util.Scanner;

public class Qs_3
{

	public static void main(String[] args)
	{
		
		double price_A = 42.5;
		double price_B = 28.5;
		double price_C = 19.0;
		double labor_fee = 25.4;
		System.out.printf("How much money you will pay?\n");
		System.out.printf("Enter the type of parquet(a,b or c)\n");
		Scanner scanner = new Scanner(System.in);						
    	char type = scanner.next().charAt(0);
		System.out.printf("How many square meters you are going to buy\n");
		float meter_square = scanner.nextFloat();
		scanner.close();
		double result =0.0;
		switch(type)
		{
			case 'a':
				result = calc(price_A, meter_square, labor_fee);
				break;
			case 'b':
				result = calc(price_B, meter_square, labor_fee);
				break;
			case 'c':
				result = calc(price_C, meter_square, labor_fee);
				break;
			default:
				System.out.printf("Incorrect parquet type\n");
				System.exit(0);
		}

		if(result> 1000)
		{			
			result *= 0.9;
		}
		System.out.printf("Invoice is %f\n", result);	
	}
	


	public static double calc(double price, double meter_square, double labor_fee)
	{
		return (price + labor_fee) * meter_square ;
	}
}
