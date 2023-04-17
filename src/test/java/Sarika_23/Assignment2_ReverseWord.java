package Sarika_23;

public class Assignment2_ReverseWord {
	public static void main(String[] args) {
		String str = "Today is best day";
		String[] newstr = str.split("\\s");
		StringBuilder sb = new StringBuilder();
		int lengths = newstr.length;

		for (int i = lengths - 1; i >= 0; i--) {
			sb.append(newstr[i]);
			sb.append(" ");
		}
		System.out.println("Reversed word is...-> " + sb.toString());
	}
}
