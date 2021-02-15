package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int a = 0; a < mat.length; a++) {
			for (int b = 0; b < mat[a].length; b++) {
				mat[a][b] = sc.nextInt();
			}
		}

		int x = sc.nextInt();

		for (int a = 0; a < mat.length; a++) {
			for (int b = 0; b < mat[a].length; b++) {
				if (mat[a][b] == x) {
					System.out.println("position: " + a + "," + b);
					if (b > 0) {
						System.out.println("Left: " + mat[a][b - 1]);
					}
					if (a > 0) {
						System.out.println("Up: " + mat[a - 1][b]);
					}
					if (b + 1 < mat[a].length) {
						System.out.println("Right: " + mat[a][b + 1]);
					}
					if (a + 1 < mat.length) {
						System.out.println("Down: " + mat[a + 1][b]);
					}
				}
			}
		}

		sc.close();
	}

}
