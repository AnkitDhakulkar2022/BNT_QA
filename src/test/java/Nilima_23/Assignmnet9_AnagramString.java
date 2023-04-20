package Nilima_23;

import java.util.Arrays;

public class Assignmnet9_AnagramString {

	public static void main(String[] args) {
		Assignmnet9_AnagramString obj = new Assignmnet9_AnagramString();
		obj.isStringAnagram("peek", "seek");
		obj.isStringAnagram("PEEK", "keep");
	}

	void isStringAnagram(String str1, String str2) {
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		
		char[] ch = str1.toCharArray();
		Arrays.sort(ch);
		

		char[] ch1 = str2.toCharArray();
		Arrays.sort(ch1);

		boolean result = Arrays.equals(ch, ch1);
		System.out.println(result);

		if (result == true) {
			System.out.println("String is anagram : " + str1 + " = " + str2);
		} else {
			System.out.println("String is not anagram : " + str1 + " = " + str2);
		}

	}

}
