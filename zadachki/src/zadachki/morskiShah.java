package zadachki;

import java.util.Scanner;

public class morskiShah {

	public static boolean proverka(char[][] arr) {
		// ������
		if (arr[0][0] == arr[0][1] && arr[0][0] == arr[0][2]) {
			return true;
		}
		if (arr[1][0] == arr[1][1] && arr[1][0] == arr[1][2]) {
			return true;
		}
		if (arr[2][0] == arr[2][1] && arr[2][0] == arr[2][2]) {
			return true;
		}
		// ������
		if (arr[0][0] == arr[1][0] && arr[0][0] == arr[2][0]) {
			return true;
		}
		if (arr[0][1] == arr[1][1] && arr[0][1] == arr[2][1]) {
			return true;
		}
		if (arr[0][2] == arr[1][2] && arr[0][0] == arr[2][2]) {
			return true;
		}
		// ���������
		if (arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2]) {
			return true;
		}
		if (arr[0][2] == arr[1][1] && arr[0][2] == arr[2][0]) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		char[][] daska = new char[3][3];
		Scanner sc = new Scanner(System.in);
		int count = 1;
		do {
			System.out.println("�������� ���");
			int row = sc.nextInt();
			System.out.println("�������� ������");
			int col = sc.nextInt();
			if (count % 2 == 1) {
				daska[row - 1][col - 1] = 'o';
			} else {
				daska[row - 1][col - 1] = 'x';
			}
			boolean result = proverka(daska);
			if (result == true) {
				if (count % 2 == 1) {
					System.out.println("����� 1 ������.");
					break;
				} else {
					System.out.println("����� 2 ������.");
					break;
				}
			}
			count++;

		} while (count <= 9);
		if (count == 9) {
			System.out.println("���������");
		}

	}

}
