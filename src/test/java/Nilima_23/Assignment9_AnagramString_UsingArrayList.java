package Nilima_23;

import java.util.ArrayList;



public class Assignment9_AnagramString_UsingArrayList {

	public static void main(String[] args) {

		Assignment9_AnagramString_UsingArrayList obj = new Assignment9_AnagramString_UsingArrayList();
		obj.isStringAnagram("peek", "keep");
	}

	void isStringAnagram(String str1, String str2) {
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		if (str1.length() != str2.length())
			System.out.println("Strings is not Anagram");

		ArrayList a = new ArrayList();
		ArrayList a1 = new ArrayList();
		

		//ArrayList<String> a1 = new ArrayList<>();
		//a.add(str1);
		//a1.add(str2);
      
		for(int i =0 ; i<str1.length(); i++){
			a.add(str1.charAt(i));
			
			//System.out.println(str1.toCharsArray());
		}
		
		for(int i =0 ; i<str2.length(); i++){
			a1.add(str2.charAt(i));
			
			//System.out.println(str1.toCharsArray());
		}
		
		//a.containsAll(a1);
	    System.out.println(a);
		System.out.println(a1);
		System.out.println(a.containsAll(a1) + " : String is Anagram ");
	}
}