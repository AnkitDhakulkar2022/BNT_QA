/*Assignment1: 1. String reverse:

i/p= "Today is best day"
o/p="yad tseb si yadoT"
way 1. string raw logic
way2: StringBuffer ... revrese();
*/

package Nilima_23;

public class Assignment1_ReverseString {

	public static void main(String[] args) {
		System.out.println("------String reversed using reverse function------");
		Assignment1_ReverseString obj1 = new Assignment1_ReverseString();
		obj1.reverseString("Today is best day");

		System.out.println("=======================================");
		System.out.println("-------String reversed using StringBuffer------");

		StringBuffer obj2 = new StringBuffer("Today is best day");
		obj2.reverse();
		System.out.println(obj2);

	}

	void reverseString(String input) {
		// String input= "Nilima";
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
			// System.out.println(output);
		}
		System.out.println(output);
	}

}
