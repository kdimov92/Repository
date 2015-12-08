import java.util.Scanner;

public class zadacha8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a1 = (n/1000)*10 + n%10;
		int a2 = ((n%1000)/100)*10 + ((n/10)%10);
		if (a1 > a2)
		{
			System.out.println(a1 + " > " +a2);
		}
		else if (a2>1) 
		{
			System.out.println(a2 + " > " + a1);
		}
		else System.out.println(a1 + " = " + a2);

	}

}
