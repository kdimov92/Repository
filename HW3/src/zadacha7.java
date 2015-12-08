import java.util.Scanner;

public class zadacha7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arrMod = new int[n];
		arrMod[0]=arr[0];
		arrMod[n-1]=arr[n-1];
		for (int i = 1; i < arrMod.length -1; i++) {
			arrMod[i] = arr[i-1] +arr[i+1];
		}
		for (int i = 0; i < arrMod.length; i++) {
			System.out.print(arrMod[i] + " " );
		}
		
		

	}

}
