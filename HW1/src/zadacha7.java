import java.util.Scanner;

public class zadacha7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour");
		byte hour = sc.nextByte();
		System.out.println("Enter money");
		double money= sc.nextDouble();
		System.out.println("Enter are you sick (false or true)");
		boolean ifSick = sc.nextBoolean();
		if (ifSick == true) 
		{
			System.out.println("I'll stay at home.");
			if (money != 0) 
			{
				System.out.println("I'll stay home and drink tea.");
			}
			else System.out.println("I'll buy some medicine.");
		}
		else if (money >= 10) 
		{
			System.out.println("I'll go to the cinema with firends.");
		}
		else System.out.println("I'll go to the caffe.");

	}

}
