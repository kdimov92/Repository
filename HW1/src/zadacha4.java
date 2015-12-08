import java.util.Scanner;

public class zadacha4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number. a=");
		double a = sc.nextDouble();
		System.out.println("Enter second number. b=");
		double b = sc.nextDouble();
		if (a >= b) 
		{
			System.out.println(b + " " + a);
		}
		else System.out.println(a + " " + b);

	}

}
