package Chapter7;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter a number for Pascal's Triangle: ");
		int n = console.nextInt();
		console.close();
		int[][] triangle = pascalTriangle(n);
		printTriangle(triangle, n);
	}
	
	public static int[][] pascalTriangle(int n) {
		int[][] triangle = new int[n][];
		for (int i = 0; i < n; i++) {
			triangle[i] = new int[i+1];
			triangle[i][0] = 1;
			triangle[i][i] = 1;
			for (int j = 1; j < i; j++) {
				triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
			}
		}
		return triangle;
	}
	
	public static void printTriangle(int[][] triangle, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				System.out.print(triangle[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

