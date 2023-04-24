//Write a program for sum of two number

package Ankit_23;

public class Assignment7_Accepts_two_int_value_and_retun_the_sum {
	int sum;

	public static void main(String[] args) {
		Assignment7_Accepts_two_int_value_and_retun_the_sum s = new Assignment7_Accepts_two_int_value_and_retun_the_sum();
		s.sum(5, 5);

	}

	public void sum(int a, int b) {
		sum = a + b;
		System.out.println(sum);
	}
}
