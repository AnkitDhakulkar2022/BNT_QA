
package Sarika_23;

public class Assignment6_ReturnMonth {
	String dates(String dates1) {

		String str = dates1;
		String[] a = str.split("-");
		String bb = a[1];
		System.out.println("Month is" + bb);
		return bb;
	}

	public static void main(String[] args) {

		Assignment6_ReturnMonth a1 = new Assignment6_ReturnMonth();
		a1.dates("12-1-1897");

	}
}