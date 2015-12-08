import java.util.Scanner;

public class zadacha15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour");
		int hour = sc.nextInt();
		if (hour >= 0 && hour < 4) {
			System.out.println("Good evening");
		}
        if (hour >= 4 && hour <=9 ) {
			System.out.println("Good morning");
		}
        if (hour >9 && hour <= 18 ) {
			System.out.println("Good day");
		}
        if (hour > 18 && hour <=23) {
			System.out.println("Good evening");
		}
        
	}

}
