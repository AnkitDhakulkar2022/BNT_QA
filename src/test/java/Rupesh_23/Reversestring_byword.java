package Rupesh_23;

public class Reversestring_byword {


		public static void main(String[] args) {
			
			System.out.println(reverseWord("Today is best day"));
		}
		
		public static String reverseWord(String str) {
			String words[] = str.split("\\s");
			String reverseWord = "";
			for (String w : words) {
				StringBuilder sb = new StringBuilder(w);
				sb.reverse();
				reverseWord += sb.toString() + " ";
			}
			return reverseWord.trim();
		}
}
