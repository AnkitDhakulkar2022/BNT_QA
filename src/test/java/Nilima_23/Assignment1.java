

/*Assignment1: 1. String reverse:

way 1. string raw logic
way2: StringBuffer ... revrese();

String reverse :
i/p= "Today is best day"
o/p="yad tseb si yadoT"

*/

package Nilima_23;

public class Assignment1 {
	public static void main(String[] args) {
		Assignment1 obj1= new Assignment1();
		obj1.reverseString("Nilima");
		
	}
	
	void reverseString(String input){
	//	String Test= "Nilima";
		String output = "";
		for(int i =input.length()-1 ; i>=0 ; i--){
			output= output+input.charAt(i);
		//System.out.println(output);
		}
		System.out.println(output);
	}


}
