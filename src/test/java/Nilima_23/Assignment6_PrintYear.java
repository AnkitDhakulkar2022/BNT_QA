package Nilima_23;

public class Assignment6_PrintYear {

	public static void main(String[] args) {

		Assignment6_PrintYear obj = new Assignment6_PrintYear();
		obj.returnYear("27-09-1995");
	}

	void returnYear(String DOB) {
		String date[] = DOB.split("-");

		// String day = date[0];
		// String month = date[1];
		String year = date[2];

		System.out.println("Year: " + year);
	}
}
