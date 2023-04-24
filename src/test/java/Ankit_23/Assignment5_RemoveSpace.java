//Write program which removes spaces from from provided string

package Ankit_23;

public class Assignment5_RemoveSpace {
	public static void main(String[] args) {
		Assignment5_RemoveSpace r = new Assignment5_RemoveSpace();
		r.removespace("   Today is    monday     ");
	}

	public void removespace(String s) {
		// String rs=s.trim();
		String s1 = s.replaceAll("\\s+", "");
		System.out.println(s1);
	}
}
