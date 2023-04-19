package Nilima_23;
/*
i/p : "Today is best day"
o/p "day best is Today"
*/
public class Assignment2_ReverseStringWord {

	public static void main(String[] args) {
		Assignment2_ReverseStringWord obj2 = new Assignment2_ReverseStringWord();
		obj2.reverseStringWord("Today is best day");
	
	}
	void reverseStringWord(String input){
		String[] Splits = input.split(" ");
		String output="";
		
		for (int i = Splits.length - 1; i >= 0; i--) {
			output = output + " "+ Splits[i];
			
		}
		output=output.trim();
		System.out.println("Original sentence -->: " +input);
		System.out.println("Reversed sentence -->: " +output);
		
	}
	
	}

	

