import java.util.Scanner;

public class zadacha13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 2 and 27");
		int num = sc.nextInt();
		for (int i = 100; i <= 999; i++) {
			int a= i/100; 
			int b= (i%100)/10; 
			int c= i%10;
			if ((a+b+c) == num) {
				System.out.println(i);
			}
		}

	}

}
