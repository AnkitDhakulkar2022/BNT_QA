package Nilima_23;

public class Assignment5_RemoveSpace {

	public static void main(String[] args) {

		Assignment5_RemoveSpace obj1 = new Assignment5_RemoveSpace();
		obj1.removeSpace(" Today is best day ");

	}

	void removeSpace(String input) {
		// String input= "Nilima";
		String output = "";
		output = input.replaceAll("\\s", "");

		System.out.println(output);
	}

}
