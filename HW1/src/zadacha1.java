import java.util.Scanner;

public class zadacha1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number. a=");
		double a = sc.nextDouble();
		System.out.println("Enter second number. b=");
		double b = sc.nextDouble();
		System.out.println("Enter third number. c=");
		double c = sc.nextDouble();
		double x = a - b;
		if (x>0)
		{	
			if (a>c && b<c) {
				System.out.println(c + " is between " + b + " and " + a);				
			}
			else	System.out.println(c + " is not between " + b + " and " + a);
		}
		else if (x<0) 
		{
			if (b>c && a<c) 
			{
				System.out.println(c + " is between " + a + " and " + b);
			}
			else	System.out.println(c + " is not between " + a + " and " + b);
		}
		else System.out.println("a and b are equal");
			
		

	}

}
