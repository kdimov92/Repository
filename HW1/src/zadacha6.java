import java.util.Scanner;

public class zadacha6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number. a1=");
		double a1 = sc.nextDouble();
		System.out.println("Enter second number. a2=");
		double a2 = sc.nextDouble();
		System.out.println("Enter third number. a3=");
		double a3 = sc.nextDouble();
		a1=a1*a2;
		a2=a1/a2;
		a1=a1/a2;
		a2=a2*a3;
		a3=a2/a3;
		a2=a2/a3;
		System.out.println(a1 + " " + a2 + " " + a3);

	}

}
