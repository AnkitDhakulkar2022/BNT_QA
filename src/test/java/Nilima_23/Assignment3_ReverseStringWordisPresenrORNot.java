package Nilima_23;

public class Assignment3_ReverseStringWordisPresenrORNot {
	

	boolean WordIsPresentorNot(String sentence, String word) {
		boolean flag = sentence.contains(word);
		return flag;
		
	}		
	public static void main(String[] args) {
	
		Assignment3_ReverseStringWordisPresenrORNot objWord = new Assignment3_ReverseStringWordisPresenrORNot();
		boolean status = objWord.WordIsPresentorNot("Today is best day", "is");

		if (status == true) {
			System.out.println("Word is present");
		}

		else {
			System.out.println("word is not present");
		}

	}

}
