package Rupesh_23;

import java.util.Arrays;

public class Assignment_9_Anagram {
	public static void main(String[] args) {
		Assignment_9_Anagram obj = new Assignment_9_Anagram();
		obj.isStringAnagram("peek", "seek");
		obj.isStringAnagram("peek", "keep");
	}
	
	
 void isStringAnagram(String str1, String str2){
	   char[] ch = str1.toCharArray();		
		Arrays.sort(ch);

		char[] ch1 = str2.toCharArray();
		Arrays.sort(ch1);

		boolean result = Arrays.equals(ch, ch1);
		System.out.println(result);

		if (result == true) {
			System.out.println("String is anagram : " +str1 + " = " + str2 );
		} else {
			System.out.println("String is not anagram : " +str1 + " = " + str2);
		}

	 
 }


}
