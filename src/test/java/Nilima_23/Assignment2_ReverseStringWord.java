package Nilima_23;
/*
i/p : "Today is best day"
o/p "day best is Today"
*/
public class Assignment2_ReverseStringWord {

	public static void main(String[] args) {
		String input = "Today is the best day";
		String output = " ";
		String[] Splits = input.split(" ");
		
	for (int i = Splits.length - 1; i >= 0; i--) {
			output = output + " "+ Splits[i];
			
		}
	
		output=output.trim();
		System.out.println(output);
	}
		
		
	}

	

