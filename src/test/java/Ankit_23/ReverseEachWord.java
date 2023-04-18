package Ankit_23;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "Today is best day";
		String rev = "";
		String[] s1 = s.split(" ");

		for (int i = s1.length - 1; i >= 0; i--) {
			rev = rev + " " + s1[i];
		}

		System.out.println(rev);
	}

}
