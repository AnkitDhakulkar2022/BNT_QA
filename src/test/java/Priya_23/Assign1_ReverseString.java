package Priya_23;


public class Assign1_ReverseString {
	
	public void reversestringmethod(String s) {
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--)

		{
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
	}

	public static void main(String[] args) {

		Assign1_ReverseString rs = new Assign1_ReverseString();
		rs.reversestringmethod("Ankit");
	}

}
