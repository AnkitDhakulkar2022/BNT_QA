package Sarika_23;

public class Assignment5_RemoveSpaces {
	public static void main(String[] args) {

		String str = "  Today is monday  ";
		String valuess = str.replaceAll(" ", "");
		System.out.println("String is->>" + valuess);
		String str1 = "India     is  my      country";
		str1 = str1.replaceAll("\\s+", " ");
		System.out.println("Final string is" + str1);
	}

}
