package Sarika;
import java.util.Scanner;
public class Stringreverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("input string : ");
		String inputStr = scanner.nextLine();
		String eachword[] = inputStr.split("\\s");
		String reversestr = "";
		for (int i = 0; i < eachword.length; i++) {
			String word = eachword[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reversestr = reversestr + reverseWord + " ";
		}
		String str = inputStr;
		String newString = "";
		for (String w : eachword) {
			String first = w.substring(0, 1); 
			String rest = w.substring(1); 
			newString += first.toUpperCase() + rest + " ";
		}
		System.out.println(newString.trim());
		System.out.print("output string : " + reversestr);
	}
}
