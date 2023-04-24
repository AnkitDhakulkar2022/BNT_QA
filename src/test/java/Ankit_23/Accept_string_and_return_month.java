//Write a program to accept string and return month

package Ankit_23;

public class Accept_string_and_return_month {
	public static void main(String[] args) {
		Accept_string_and_return_month a = new Accept_string_and_return_month();
		a.returnmonth("19-04-2023");
	}

	public void returnmonth(String s) {
		String[] splits = s.split("-");
		String month = splits[1];
		System.out.println(month);
	}

}
