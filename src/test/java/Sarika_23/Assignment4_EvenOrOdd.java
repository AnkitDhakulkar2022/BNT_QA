package Sarika_23;

import java.util.Scanner;

public class Assignment4_EvenOrOdd {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Given number is even");
		} else {
			System.out.println("Given number is odd ");
		}
	}
}
