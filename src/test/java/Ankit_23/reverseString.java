package Ankit_23;

public class reverseString {
	public void reversestringmethod(String s) {
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--)

		{
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
	}

	public static void main(String[] args) {

		reverseString rs = new reverseString();
		rs.reversestringmethod("Ankit");
	}
}
