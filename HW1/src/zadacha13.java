import java.util.Scanner;

public class zadacha13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature : ");
        int temp = sc.nextInt();
        if (temp < - 20) {
			System.out.println("Ice cold");
		}
        if (temp >= -20 && temp < 0) {
			System.out.println("Cold");
		}
        if (temp>=0 && temp < 15) {
			System.out.println("Chilly");
		}
        if (temp >= 15 && temp <25) {
			System.out.println("Hot");
		}
        if (temp >=25) {
			System.out.println("Very hot");
		}
        
	}

}
