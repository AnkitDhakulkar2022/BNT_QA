package Nilima_23;

import java.util.Scanner;

public class Assignment4_EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if(number % 2 == 0)
            System.out.println("Provided " + number + " is even");
        else
            System.out.println("Provided " + number + " is odd");

	}

	}
