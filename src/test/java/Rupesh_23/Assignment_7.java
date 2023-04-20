
//sum_of_two_number_Accept_value_and_print_sum

package Rupesh_23;

import java.util.Scanner;

public class Assignment_7 {
	//sum_of_two_number_Accept_value_and_print_sum

	
		public static void main(String args[]) {
			int x, y, sum;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the first number: ");
			x = sc.nextInt();
			System.out.print("Enter the second number: ");
			y = sc.nextInt();
			sum = sum(x, y);
			System.out.println("The sum of two numbers x and y is: " + sum);
		}

		public static int sum(int a, int b) {
			int sum = a + b;
			return sum;
		}
}
