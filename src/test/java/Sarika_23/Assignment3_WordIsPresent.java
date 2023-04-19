package Sarika_23;

import Sarika.Program_3_WordIsPresent;

public class Assignment3_WordIsPresent {
	boolean wordispresent(String sentence, String word) {
		boolean verify = sentence.contains(word);

		return verify;

	}

	public static void main(String[] args) {
		Program_3_WordIsPresent a = new Program_3_WordIsPresent();
		boolean values = a.wordispresent("Today is Monday", "xyz");
		if (values == true) {
			System.out.println("Word is present");

		} else {
			System.out.println("Word is NOT present");
		}

	}

}
