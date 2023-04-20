package Nilima_23;

import java.util.Scanner;

public class Assignment7_Addition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int a = sc.nextInt();
		System.out.println("Enter second integer: ");
		int b = sc.nextInt();

		Assignment7_Addition s = new Assignment7_Addition();
		s.addition(a, b);
	}

	void addition(int x, int y) {
		int sum = x + y;
		System.out.println("Addition of two integer: " + sum);

	}

}
