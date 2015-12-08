import java.util.Scanner;

public class zadacha11 {

	public static void main(String[] args) {
		System.out.println("Please enter 3 digit numer (non of the digits shoud be 0 )");
		Scanner sc = new Scanner(System.in);
		int number = 0;
		do 
		{			
			number = sc.nextInt();			
		}
		while ( number > 1000 || number <100 || (number / 100)==0 || 
				((number % 100)/10) == 0 || number%10 == 0);
		int a= number/100; 
		int b= (number%100)/10; 
		int c= number%10;
		if (number % a == 0 && number % b == 0 && number % c == 0) 
		{
			System.out.println("Yes");
		}
		else System.out.println("No");

	}

}
