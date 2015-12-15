package zadachki;

import java.util.Scanner;

public class konove {
	
	public static void hod (char[][] array, int a,int b){
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Въведете брой редове");
		int row = sc.nextInt();
		System.out.println("Въведете брой колони");
		int col = sc.nextInt();
		char[][] arr= new char[row][col];
		
		System.out.println("Въведете ред");
		int row1 = sc.nextInt();
		System.out.println("Въведете колонa");
		int col1 = sc.nextInt();
		hod(arr,row1,col1);
		
		
	}

}
