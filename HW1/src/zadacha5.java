import java.util.Scanner;

public class zadacha5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number. a=");
		double a = sc.nextDouble();
		System.out.println("Enter second number. b=");
		double b = sc.nextDouble();
		System.out.println("Enter third number. c=");
		double c = sc.nextDouble();
		if (a>=b && a>=c)
		{
			if (b>=c)
			{
				System.out.println(a + " " + b + " " + c);
			}
			else System.out.println(a + " " + c + " " + b);
		}
		else if (b>=c)
		{
			if (a>=c)
			{
				System.out.println(b + " " + a + " " + c);
			}
			else System.out.println(b + " " + c + " " + a);
		}
		else if (a>b)
		{
			System.out.println(c + " " + a + " " + b);
		}
		else System.out.println(c + " " + b + " " + a);

	}

}
