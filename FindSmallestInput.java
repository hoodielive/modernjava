import java.util.Scanner; 

public class FindSmallestInput 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first number please: ");
		double x = in.nextDouble();
		System.out.print("Thank you for that. Now enter the second number please: ");
		double y = in.nextDouble();
		System.out.print("Great, we are almost complete. Please enter the last number: ");
		double z = in.nextDouble();
		System.out.print("The smallest number value that you entered is: " + SmallestValue(x, y, z) + "\n");
	}

	public static double SmallestValue(double x, double y, double z)
	{
		return Math.min(Math.min(x, y), z);
	}
}

