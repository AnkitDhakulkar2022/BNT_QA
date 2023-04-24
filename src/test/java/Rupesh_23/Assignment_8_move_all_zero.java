package Rupesh_23;

import java.util.Arrays;

public class Assignment_8_move_all_zero {
	public static void main(String[] args) {

		int a[] = { 5, 0, 3, 6, 9, 5, 0, 6, 0, 3, 6 };

		System.out.println("Original array: \n" + Arrays.toString(a));
		int n = a.length;

		Assignment_8_move_all_zero s = new Assignment_8_move_all_zero();
		s.moveAllZero(a, n);

	}

	void moveAllZero(int a[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++)
			if (a[i] != 0)
				a[count++] = a[i];

		while (count < n)
			a[count++] = 0;

		System.out.println("Final array : ");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");

	}

}
